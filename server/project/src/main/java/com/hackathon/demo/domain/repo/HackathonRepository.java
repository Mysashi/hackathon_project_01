package com.hackathon.demo.domain.repo;


import com.hackathon.demo.domain.entity.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HackathonRepository  extends JpaRepository<Hackathon, Long> {
}
