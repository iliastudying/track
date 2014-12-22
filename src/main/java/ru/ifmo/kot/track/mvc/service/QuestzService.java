package ru.ifmo.kot.track.mvc.service;

import ru.ifmo.kot.track.mvc.entity.questz;

import java.util.List;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
public interface QuestzService {
    questz addQuest(questz quest);
    void delete(long id);
    questz getById(long id);
    questz editQuest(questz quest);
    List<questz> getAll();
}
