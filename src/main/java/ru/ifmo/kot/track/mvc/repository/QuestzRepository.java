package ru.ifmo.kot.track.mvc.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ifmo.kot.track.mvc.entity.questz;
import ru.ifmo.kot.track.mvc.entity.userz;


public interface QuestzRepository extends JpaRepository<questz, Long> {
    @Query("select b from questz b where b.id = :id")
    questz findById(@Param("id") long id);
}
