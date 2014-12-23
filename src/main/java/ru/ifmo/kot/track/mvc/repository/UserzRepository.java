package ru.ifmo.kot.track.mvc.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.ifmo.kot.track.mvc.entity.userz;

public interface UserzRepository extends JpaRepository<userz, Long> {
    @Query("select b from userz b where b.id = :id")
    userz findById(@Param("id") long id);

    @Query("select b from userz b where b.name = :name")
    userz findByName(@Param("name") String name);


    @Modifying
    @Transactional
    @Query("UPDATE userz b SET b.name = :name, b.pass = :pass, b.email = :email WHERE b.id = :id")
    void EditUser(@Param("name") String name,@Param("pass") String pass,@Param("email") String email, @Param("id")long id);
}
