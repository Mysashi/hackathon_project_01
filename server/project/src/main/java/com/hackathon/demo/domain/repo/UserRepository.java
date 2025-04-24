package com.hackathon.demo.domain.repo;


import com.hackathon.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
