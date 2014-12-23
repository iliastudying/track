package ru.ifmo.kot.track.mvc.service;

import ru.ifmo.kot.track.mvc.entity.questz;
import ru.ifmo.kot.track.mvc.entity.userquest;

import java.util.List;

/**
 * Created by fanmilan007 on 23.12.2014.
 */
public interface UserQuestService {
   List<Long> findQuestbyUserId(long id);
    userquest addUserQuest(userquest uq);
    List<Long> findUserByQuestId(long id);
}
