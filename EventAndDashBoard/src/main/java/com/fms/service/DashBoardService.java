package com.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;

import com.fms.model.Dashboard;

import reactor.core.publisher.Mono;

@Service
public class DashBoardService {

	@Autowired
	DatabaseClient databaseClient;

	public Dashboard getDashBoardDetails() {
		Dashboard dashboard = new Dashboard();
		Mono<Dashboard> dash = databaseClient
				.execute("select count(event.event_id) as total_events, sum(event.lives_impacted) as lives_impacted,"
						+ "sum(event.total_volunteers) as total_volunteers from event")
				.as(Dashboard.class).fetch().one();
		dashboard.setTotalEvents(dash.block().getTotalEvents());
		dashboard.setLivesImpacted(dash.block().getLivesImpacted());
		dashboard.setTotalVolunteers(dash.block().getTotalVolunteers());
		dash = databaseClient.execute("select count(sno) as total_participants from participated").as(Dashboard.class)
				.fetch().one();
		dashboard.setTotalParticipants(dash.block().getTotalParticipants());
		return dashboard;
	}
}
