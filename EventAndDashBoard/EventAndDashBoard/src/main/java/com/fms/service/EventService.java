package com.fms.service;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fms.model.Event;
import com.fms.model.ViewEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
	
	public ViewEvent eventById(String eventId){
		
		String sql = "select event.event_id,event.event_name,event.council_name,event.base_location,participated.event_description,"
				+ "participated.status,participated.iiep_category as category,event.bname,event.total_volunteers as volunteers,"
				+ "event.total_volunteer_hour as volunteering_hrs,event.ovlhrs as ovl_hrs,event.total_travel_hour as trvl_hrs,event.lives_impacted,"
				+ "event.pocid as poc_id,event.pocname as poc_name,event.pocnumber as contact_number from event inner join participated "
				+ "on participated.event_id = event.event_id where event.event_id = '"+eventId +"'";
		Mono<ViewEvent> mono = databaseClient.execute(sql).as(ViewEvent.class).fetch().one().log();
		ViewEvent event = mono.block();
		return event;
	}
}
