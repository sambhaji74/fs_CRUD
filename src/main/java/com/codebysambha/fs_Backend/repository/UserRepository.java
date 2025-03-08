package com.codebysambha.fs_Backend.repository;

import com.codebysambha.fs_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long >{
}
