package ru.ifmo.kot.track.mvc.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.entity.qwikiz;
import ru.ifmo.kot.track.mvc.repository.QwikizRepository;
import ru.ifmo.kot.track.mvc.service.QwikizService;

import java.util.List;

@Service
public class QwikizServiceImpl implements QwikizService {

    @Autowired
    private QwikizRepository qwikizRepository;

    @Override
    public qwikiz addQwiki(qwikiz qwiki) {
        qwikiz savedQwiki = qwikizRepository.saveAndFlush(qwiki);
        return savedQwiki;
    }

    @Override
    public void delete(long id) {
        qwikizRepository.delete(id);
    }

    @Override
    public qwikiz editQwiki(qwikiz qwiki) {
        return qwikizRepository.saveAndFlush(qwiki);
    }

    @Override
    public List<qwikiz> getAll() {
        return qwikizRepository.findAll();
    }

    @Override
    public qwikiz getById(long id) {
        return qwikizRepository.findById(id);
    }
}
