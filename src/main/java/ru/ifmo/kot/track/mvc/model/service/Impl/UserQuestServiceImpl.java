package ru.ifmo.kot.track.mvc.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.entity.userquest;
import ru.ifmo.kot.track.mvc.repository.UserQuestRepository;
import ru.ifmo.kot.track.mvc.service.UserQuestService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanmilan007 on 23.12.2014.
 */
@Service
public class UserQuestServiceImpl implements UserQuestService {

    @Autowired
    private UserQuestRepository userQuestRepository;

    @Override
    public userquest addUserQuest(userquest uq) {
        userquest savedUser = userQuestRepository.saveAndFlush(uq);
        return savedUser;
    }

    @Override
    public List<Long> findQuestbyUserId(long id) {
        List<userquest> find = userQuestRepository.findQuestbyUserId(id);
        List<Long> quest_id=new ArrayList<Long>(0);
        for (userquest f : find){
            quest_id.add(f.getQuest().getId());
        }
        return quest_id;
    }

    @Override
    public List<Long> findUserByQuestId(long id) {
        List<userquest> find = userQuestRepository.findUserbyQuestId(id);
        List<Long> user_id=new ArrayList<Long>(0);
        for (userquest f : find){
            user_id.add(f.getQuest().getId());
        }
        return user_id;
    }

}
