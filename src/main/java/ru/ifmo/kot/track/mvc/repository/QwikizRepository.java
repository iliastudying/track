package ru.ifmo.kot.track.mvc.repository;

/**
 * Created by fanmilan007 on 20.12.2014.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ifmo.kot.track.mvc.entity.qwikiz;

public interface QwikizRepository extends JpaRepository<qwikiz, Long> {
}
