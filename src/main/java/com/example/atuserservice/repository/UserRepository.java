package com.example.atuserservice.repository;

import com.example.atuserservice.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
