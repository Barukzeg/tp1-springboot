package com.example.tp1.repositories;

import com.example.tp1.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    boolean findByPseudo(String pseudo);
}