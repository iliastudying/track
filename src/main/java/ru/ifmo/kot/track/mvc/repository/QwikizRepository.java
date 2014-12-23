package ru.ifmo.kot.track.mvc.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ifmo.kot.track.mvc.entity.qwikiz;

public interface QwikizRepository extends JpaRepository<qwikiz, Long> {
    @Query("select b from qwikiz b where b.id = :id")
    qwikiz findById(@Param("id") long id);
}
