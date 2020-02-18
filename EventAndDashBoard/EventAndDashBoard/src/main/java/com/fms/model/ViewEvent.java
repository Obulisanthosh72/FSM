package com.fms.model;

import java.util.List;

public class ViewEvent {

	private String event_id;
	private String event_name;
	private String council_name;
	private String base_location;
	private String event_description;
	private String status;
	private String category;
	private String bname;
	private int volunteers;
	private int volunteering_hrs;
	private int ovl_hrs;
	private int trvl_hrs;
	private int lives_impacted;
	private String poc_name;
	private String poc_id;
	private int contact_number;
	
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getCouncil_name() {
		return council_name;
	}
	public void setCouncil_name(String council_name) {
		this.council_name = council_name;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getVolunteers() {
		return volunteers;
	}
	public void setVolunteers(int volunteers) {
		this.volunteers = volunteers;
	}
	public int getVolunteering_hrs() {
		return volunteering_hrs;
	}
	public void setVolunteering_hrs(int volunteering_hrs) {
		this.volunteering_hrs = volunteering_hrs;
	}
	public int getOvl_hrs() {
		return ovl_hrs;
	}
	public void setOvl_hrs(int ovl_hrs) {
		this.ovl_hrs = ovl_hrs;
	}
	public int getTrvl_hrs() {
		return trvl_hrs;
	}
	public void setTrvl_hrs(int trvl_hrs) {
		this.trvl_hrs = trvl_hrs;
	}
	public int getLives_impacted() {
		return lives_impacted;
	}
	public void setLives_impacted(int lives_impacted) {
		this.lives_impacted = lives_impacted;
	}
	public String getPoc_name() {
		return poc_name;
	}
	public void setPoc_name(String poc_name) {
		this.poc_name = poc_name;
	}
	public String getPoc_id() {
		return poc_id;
	}
	public void setPoc_id(String poc_id) {
		this.poc_id = poc_id;
	}
	public int getContact_number() {
		return contact_number;
	}
	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}
}
