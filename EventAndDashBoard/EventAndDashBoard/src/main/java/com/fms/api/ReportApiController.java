package com.fms.api;

import com.fms.model.ViewEvent;
import com.fms.service.ReportService;

import reactor.core.publisher.Flux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-18T11:44:46.984+05:30[Asia/Calcutta]")
@RestController
public class ReportApiController implements ReportApi {

	@Autowired
	ReportService reportService;
	
	@Override
	public Flux<ResponseEntity<ViewEvent>> reportDetails() {
		// TODO Auto-generated method stub
		return reportService.reportDetails();
	}
	
}
