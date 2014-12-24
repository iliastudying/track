package ru.ifmo.kot.track.mvc.model.service;

import ru.ifmo.kot.track.mvc.entity.qwikiz;

import java.util.List;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
public interface QwikizService {
    qwikiz addQwiki(qwikiz qwiki);
    void delete(long id);
    qwikiz editQwiki(qwikiz qwiki);
    List<qwikiz> getAll();
}
