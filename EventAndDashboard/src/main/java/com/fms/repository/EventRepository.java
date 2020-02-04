package com.fms.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.model.Event;

@Repository
public interface EventRepository  extends ReactiveCrudRepository<Event, String>{

	

}
