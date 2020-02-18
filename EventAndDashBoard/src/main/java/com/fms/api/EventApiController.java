package com.fms.api;

import com.fms.model.Event;
import com.fms.repository.EventRepository;
import com.fms.service.EventService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-17T11:13:43.196+05:30[Asia/Calcutta]")
@RestController
public class EventApiController implements EventApi {

	@Autowired
	EventRepository eventRepository;
	@Autowired
	EventService eventService;
	
	@Override
	public Flux<ResponseEntity<Event>> getAllEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAll()
			   .map(user -> ResponseEntity.ok(user))
			   .defaultIfEmpty(ResponseEntity.noContent().build());
	}
	
	@Override
	public Mono<ResponseEntity<Event>> getEventById(String eventId) {
		// TODO Auto-generated method stub
		return eventRepository.findByEventId(eventId)
				.map(event -> ResponseEntity.ok(event))
				.defaultIfEmpty(ResponseEntity.noContent().build());
				
	}
	
	@Override
	public Flux<ResponseEntity<Event>> searchEvent(Event body) {
		// TODO Auto-generated method stub
		return eventService.searchEvent(body);
				
	}
	
}
