package org.hal.fortune.repository;

import org.hal.fortune.model.Fortune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FortuneRepository extends JpaRepository<Fortune, Long> {

}
