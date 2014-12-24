package ru.ifmo.kot.track.mvc.model.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.entity.uwikiz;
import ru.ifmo.kot.track.mvc.repository.UwikizRepository;
import ru.ifmo.kot.track.mvc.service.UwikizService;

import java.util.List;

@Service
public class UwikizServiceImpl implements UwikizService {

    @Autowired
    private UwikizRepository uwikizRepository;

    @Override
    public uwikiz addUwiki(uwikiz uwiki) {
        uwikiz savedUwiki = uwikizRepository.saveAndFlush(uwiki);
        return savedUwiki;
    }

    @Override
    public void delete(long id) {
        uwikizRepository.delete(id);
    }




    @Override
    public uwikiz editUwiki(uwikiz uwiki) {
        return uwikizRepository.saveAndFlush(uwiki);
    }

    @Override
    public List<uwikiz> getAll() {
        return uwikizRepository.findAll();
    }
}
