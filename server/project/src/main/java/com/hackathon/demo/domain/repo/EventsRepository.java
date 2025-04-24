package com.hackathon.demo.domain.repo;


import com.hackathon.demo.domain.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepository extends JpaRepository<Event, Long> {
}
