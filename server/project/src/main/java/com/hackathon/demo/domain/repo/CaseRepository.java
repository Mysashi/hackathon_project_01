package com.hackathon.demo.domain.repo;


import com.hackathon.demo.domain.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
}
