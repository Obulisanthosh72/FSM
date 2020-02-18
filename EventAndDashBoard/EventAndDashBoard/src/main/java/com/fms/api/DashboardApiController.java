package com.fms.api;

import com.fms.model.Dashboard;
import com.fms.service.DashBoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-17T11:13:43.196+05:30[Asia/Calcutta]")
@RestController
public class DashboardApiController implements DashboardApi {

	@Autowired
	DashBoardService dashBoardService;
	
	@Override
	public ResponseEntity<Dashboard> getDashboardDetails() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(dashBoardService.getDashBoardDetails());
	}
}
