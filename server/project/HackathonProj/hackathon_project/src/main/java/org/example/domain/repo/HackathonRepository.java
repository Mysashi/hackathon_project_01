package org.example.domain.repo;

import org.example.domain.entity.Hackathon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HackathonRepository  extends JpaRepository<Hackathon, Long> {
}
