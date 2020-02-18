package com.fms.model;

import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table("participated")
public class Participated {

	@Id
	private Integer sno;
	private String event_id;
	private String base_location;
	private String bname;
	private String council_name;
	private String event_name;
	private String event_description;
	private Date event_date;
	private Integer emp_id;
	private String emp_name;
	private Integer volunteer_hrs;
	private Integer trvl_hrs;
	private Integer lives_impacted;
	private String business_unit;
	private String status;
	private String iiep_category;
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCouncil_name() {
		return council_name;
	}
	public void setCouncil_name(String council_name) {
		this.council_name = council_name;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public Date getEvent_date() {
		return event_date;
	}
	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}
	public Integer getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Integer getVolunteer_hrs() {
		return volunteer_hrs;
	}
	public void setVolunteer_hrs(Integer volunteer_hrs) {
		this.volunteer_hrs = volunteer_hrs;
	}
	public Integer getTrvl_hrs() {
		return trvl_hrs;
	}
	public void setTrvl_hrs(Integer trvl_hrs) {
		this.trvl_hrs = trvl_hrs;
	}
	public Integer getLives_impacted() {
		return lives_impacted;
	}
	public void setLives_impacted(Integer lives_impacted) {
		this.lives_impacted = lives_impacted;
	}
	public String getBusiness_unit() {
		return business_unit;
	}
	public void setBusiness_unit(String business_unit) {
		this.business_unit = business_unit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIiep_category() {
		return iiep_category;
	}
	public void setIiep_category(String iiep_category) {
		this.iiep_category = iiep_category;
	}
	}
