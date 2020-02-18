package com.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fms.model.Event;

import reactor.core.publisher.Flux;

@Service
public class EventService {

	@Autowired
	DatabaseClient databaseClient;
	
	public Flux<ResponseEntity<Event>> searchEvent(Event event){
		String sql = "select * from event ";
		int check = 0;
		if(event.getEventId() != null){
			sql += "where event_id = "+"'"+event.getEventId()+"'";
			check = 1;
		}
		if(event.getMonth() != null){
			if(check == 1){
				sql += " and month = "+"'"+event.getMonth()+"'";
			}
			else{
				sql += "where month = "+"'"+event.getMonth()+"'";
				check =1;
			}
		}
		if(event.getBaseLocation() != null){
			if(check == 1){
				sql += " and base_location = "+"'"+event.getBaseLocation()+"'";
			}
			else{
				sql += "where base_location = "+"'"+event.getBaseLocation()+"'";
				check =1;
			}
		}
		if(event.getCouncilName() != null){
			if(check == 1){
				sql += " and council_name = "+"'"+event.getCouncilName()+"'";
			}
			else{
				sql += "where council_name = "+"'"+event.getCouncilName()+"'";
				check =1;
			}
		}
		if(event.getBname() != null){
			if(check == 1){
				sql += " and bname = "+"'"+event.getBname()+"'";
			}
			else{
				sql += "where bname = "+"'"+event.getBname()+"'";
				check =1;
			}
		}
		System.err.println(sql);
		Flux<Event> filteredEvent = databaseClient.execute(sql).as(Event.class).fetch().all();
		return filteredEvent.log().map(user -> ResponseEntity.ok(user)).defaultIfEmpty(ResponseEntity.noContent().build());
	}
}
