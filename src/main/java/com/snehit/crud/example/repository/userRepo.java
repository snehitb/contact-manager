package com.snehit.crud.example.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.snehit.crud.example.entity.user;


public interface userRepo extends  MongoRepository<user, Integer>{
	Optional<user> findByEmail(String email);
}
