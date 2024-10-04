package com.snehit.crud.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snehit.crud.example.entity.user;

@Repository
public interface userRepo extends JpaRepository<user, Integer>{
	Optional<user> findByEmail(String email);
}
