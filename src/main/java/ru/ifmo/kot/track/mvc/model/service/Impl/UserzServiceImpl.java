package ru.ifmo.kot.track.mvc.model.service.Impl;

import ru.ifmo.kot.track.mvc.model.entity.userz;
import ru.ifmo.kot.track.mvc.model.repository.UserzRepository;
import ru.ifmo.kot.track.mvc.model.service.UserzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void editUser (userz user) {
        userzRepository.EditUser(user.getName(),user.getPass(),user.getEmail(), user.getId());
        userzRepository.flush();
    }

    @Override
    public List<userz> getAll() {
        return userzRepository.findAll();
    }


}
