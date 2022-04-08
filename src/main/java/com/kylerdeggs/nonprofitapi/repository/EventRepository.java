package com.kylerdeggs.nonprofitapi.repository;

import com.kylerdeggs.nonprofitapi.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
