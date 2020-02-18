package com.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fms.model.ViewEvent;

import reactor.core.publisher.Flux;

@Service
public class ReportService {

	
	@Autowired
	DatabaseClient databaseClient;
	
	public Flux<ResponseEntity<ViewEvent>> reportDetails() {
		String sql = "select event.event_id,event.event_name,event.council_name,event.base_location,participated.event_description,"
				+ "participated.status,participated.iiep_category as category,event.bname,event.total_volunteers as volunteers,"
				+ "event.total_volunteer_hour as volunteering_hrs,event.ovlhrs as ovl_hrs,event.total_travel_hour as trvl_hrs,event.lives_impacted,"
				+ "event.pocid as poc_id,event.pocname as poc_name,event.pocnumber as contact_number from event inner join participated "
				+ "on participated.event_id = event.event_id ";
		Flux<ViewEvent> flux = databaseClient.execute(sql).as(ViewEvent.class).fetch().all();
		return flux.log().map(event -> ResponseEntity.ok(event)).defaultIfEmpty(ResponseEntity.noContent().build());
	}
}
