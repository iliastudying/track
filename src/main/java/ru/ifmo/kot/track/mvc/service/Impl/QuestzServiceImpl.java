package ru.ifmo.kot.track.mvc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.entity.questz;
import ru.ifmo.kot.track.mvc.repository.QuestzRepository;
import ru.ifmo.kot.track.mvc.service.QuestzService;

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
    public questz editQuest (questz quest) {
        return questzRepository.saveAndFlush(quest);
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
