package ru.ifmo.kot.track.mvc.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ifmo.kot.track.mvc.entity.uwikiz;

import java.util.List;

public interface UwikizRepository extends JpaRepository<uwikiz, Long> {
    @Query("select b from uwikiz b where b.id = :id")
    uwikiz findById(@Param("id") long id);
    @Query("select b from uwikiz b where user_id = :id")
    List<uwikiz> findUwikiByIdUser(@Param("id") long id);
}
