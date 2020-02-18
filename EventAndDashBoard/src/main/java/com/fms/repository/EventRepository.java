package com.fms.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.model.Event;

import reactor.core.publisher.Mono;

@Repository
public interface EventRepository extends ReactiveCrudRepository<Event, Integer>{
	
	@Query("select * from event where event_id = ?eventId")
	Mono<Event> findByEventId(String eventId);

}
