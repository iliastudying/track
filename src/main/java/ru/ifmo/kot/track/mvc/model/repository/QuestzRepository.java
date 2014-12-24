package ru.ifmo.kot.track.mvc.model.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ifmo.kot.track.mvc.entity.questz;

import java.sql.Timestamp;

public interface QuestzRepository extends JpaRepository<questz, Long> {
    @Query("select b from questz b where b.id = :id")
    questz findById(@Param("id") long id);

    @Modifying
    @Transactional
    @Query("UPDATE questz b SET b.name = :name, b.date_created = :date_created, b.last_created = :last_created WHERE b.id = :id")
    void EditQuest(@Param("name") String name, @Param("date_created") Timestamp date_created, @Param("last_created") Timestamp last_createdl, @Param("id") long id);
}
