package ru.ifmo.kot.track.mvc.model.service;

import ru.ifmo.kot.track.mvc.model.entity.userz;

import java.util.List;

/**
 * Created by fanmilan007 on 20.12.2014.
 */
public interface UserzService {
    userz addUser(userz user);
    void delete(long id);
    userz getByName(String name);
    void editUser(userz user);
    List<userz> getAll();
}
