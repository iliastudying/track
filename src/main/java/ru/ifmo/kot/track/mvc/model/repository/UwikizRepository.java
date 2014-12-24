package ru.ifmo.kot.track.mvc.model.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ifmo.kot.track.mvc.model.entity.uwikiz;

public interface UwikizRepository extends JpaRepository<uwikiz, Long> {
}
