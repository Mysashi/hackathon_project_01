package com.hackathon.demo.domain.repo;


import com.hackathon.demo.domain.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
