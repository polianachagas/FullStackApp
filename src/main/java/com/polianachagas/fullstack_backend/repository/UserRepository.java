package com.polianachagas.fullstack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polianachagas.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
