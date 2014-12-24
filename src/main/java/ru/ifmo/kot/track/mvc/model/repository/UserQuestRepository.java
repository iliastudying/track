package ru.ifmo.kot.track.mvc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ifmo.kot.track.mvc.model.entity.userquest;

import java.util.List;

/**
 * Created by fanmilan007 on 23.12.2014.
 */
public interface UserQuestRepository extends JpaRepository<userquest, Long> {

    @Query("select b from userquest b where user_id=:id")
    List<userquest> findQuestbyUserId(@Param("id") long id);

    @Query("select b from userquest b where quest_id=:id")
    List<userquest> findUserbyQuestId(@Param("id") long id);

}
