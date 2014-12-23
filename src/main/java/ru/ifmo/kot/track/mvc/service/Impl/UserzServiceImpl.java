package ru.ifmo.kot.track.mvc.service.Impl;

import ru.ifmo.kot.track.mvc.entity.userquest;
import ru.ifmo.kot.track.mvc.entity.userz;
import ru.ifmo.kot.track.mvc.entity.uwikiz;
import ru.ifmo.kot.track.mvc.repository.UserzRepository;
import ru.ifmo.kot.track.mvc.service.UserzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ifmo.kot.track.mvc.service.UserzService;

import java.util.List;

@Service
public class UserzServiceImpl implements UserzService {

    @Autowired
    private UserzRepository userzRepository;

    @Override
    public userz addUser(userz user) {
        userz savedUser = userzRepository.saveAndFlush(user);
        return savedUser;
    }

    @Override
    public void delete(long id) {
        userzRepository.delete(id);
    }

    @Override
    public userz getByName(String name) {
        return userzRepository.findByName(name);
    }

    @Override
    public long getIdByName(String name) {
       userz u= userzRepository.findByName(name);
        return u.getId();
    }


    @Override
    public void editUser (userz user) {
        userzRepository.EditUser(user.getName(),user.getPass(),user.getEmail(), user.getId());
        userzRepository.flush();
    }

    @Override
    public List<userz> getAll() {
        return userzRepository.findAll();
    }

    @Override
    public userz getById(long id) {
        return userzRepository.findById(id);
    }

    @Override
    public String getStatusById(long id) {
        userz u=userzRepository.findById(id);
        return u.getStatus();
    }

}
