package ru.ifmo.kot.track.mvc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.entity.questz;
import ru.ifmo.kot.track.mvc.repository.QuestzRepository;
import ru.ifmo.kot.track.mvc.service.QuestzService;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@Service
public class QuestzServiceImpl implements QuestzService {

    @Autowired
    private QuestzRepository questzRepository;

    @Override
    public questz addQuest(questz quest) {
        questz savedQuest = questzRepository.save(quest);
        return savedQuest;
    }

    @Override
    public void delete(long id) {
        questzRepository.delete(id);
    }


    @Override
    public void editQuest (questz quest) {
       // Calendar calendar = Calendar.getInstance();
        //java.util.Date now = calendar.getTime();
        //Timestamp currentTimestamp = new Timestamp(now.getTime());
        questzRepository.EditQuest(quest.getName(), quest.getDate_created(), quest.getLast_created(), quest.getId());
        questzRepository.flush();
    }

    @Override
    public questz getById(long id) {
        return questzRepository.findById(id);
    }

    @Override
    public List<questz> getAll() {
        return questzRepository.findAll();
    }


}
