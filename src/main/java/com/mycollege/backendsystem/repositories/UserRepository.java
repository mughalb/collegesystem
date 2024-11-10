package com.mycollege.backendsystem.repositories;

import com.mycollege.backendsystem.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
