package ru.ifmo.kot.track.mvc.model.service;

import ru.ifmo.kot.track.mvc.model.entity.uwikiz;

import java.util.List;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
public interface UwikizService {
    uwikiz addUwiki(uwikiz uwiki);
    void delete(long id);
    //Bank getByName(String name);
    uwikiz editUwiki(uwikiz uwiki);
    List<uwikiz> getAll();
}
