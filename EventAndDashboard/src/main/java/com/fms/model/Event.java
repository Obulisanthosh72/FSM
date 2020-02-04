package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@Table("event")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-28T17:34:25.877+05:30[Asia/Calcutta]")
public class Event   {
  @JsonProperty("base_location")
  @Column("baselocation")
  private String baseLocation = null;

  @JsonProperty("event_date")
  private LocalDate eventDate = null;

  @JsonProperty("event_id")
  private Integer eventId = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("event_status")
  private String eventStatus = null;

  @JsonProperty("total_travel_hour")
  private Integer totalTravelHour = null;

  @JsonProperty("total_volunteer_hour")
  private Integer totalVolunteerHour = null;

  @JsonProperty("total_volunteers")
  private Integer totalVolunteers = null;

  @JsonProperty("venue_address")
  private String venueAddress = null;

  @JsonProperty("rating")
  private Integer rating = null;

  @JsonProperty("likes")
  private String likes = null;

  @JsonProperty("dislikes")
  private String dislikes = null;

  @JsonProperty("avgrating")
  private Integer avgrating = null;

  @JsonProperty("volunteers")
  private Integer volunteers = null;

  @JsonProperty("ovlhrs")
  private String ovlhrs = null;

  @JsonProperty("lives_impacted")
  private Integer livesImpacted = null;

  @JsonProperty("pocid")
  private String pocid = null;

  @JsonProperty("pocname")
  private String pocname = null;

  @JsonProperty("pocnumber")
  private String pocnumber = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("council_name")
  private String councilName = null;

  @JsonProperty("bname")
  private String bname = null;

  public Event baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(value = "")
  
    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Event eventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Event eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  
    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event eventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
    return this;
  }

  /**
   * Get eventStatus
   * @return eventStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getEventStatus() {
    return eventStatus;
  }

  public void setEventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
  }

  public Event totalTravelHour(Integer totalTravelHour) {
    this.totalTravelHour = totalTravelHour;
    return this;
  }

  /**
   * Get totalTravelHour
   * @return totalTravelHour
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalTravelHour() {
    return totalTravelHour;
  }

  public void setTotalTravelHour(Integer totalTravelHour) {
    this.totalTravelHour = totalTravelHour;
  }

  public Event totalVolunteerHour(Integer totalVolunteerHour) {
    this.totalVolunteerHour = totalVolunteerHour;
    return this;
  }

  /**
   * Get totalVolunteerHour
   * @return totalVolunteerHour
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalVolunteerHour() {
    return totalVolunteerHour;
  }

  public void setTotalVolunteerHour(Integer totalVolunteerHour) {
    this.totalVolunteerHour = totalVolunteerHour;
  }

  public Event totalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Event venueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
    return this;
  }

  /**
   * Get venueAddress
   * @return venueAddress
  **/
  @ApiModelProperty(value = "")
  
    public String getVenueAddress() {
    return venueAddress;
  }

  public void setVenueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
  }

  public Event rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Event likes(String likes) {
    this.likes = likes;
    return this;
  }

  /**
   * Get likes
   * @return likes
  **/
  @ApiModelProperty(value = "")
  
    public String getLikes() {
    return likes;
  }

  public void setLikes(String likes) {
    this.likes = likes;
  }

  public Event dislikes(String dislikes) {
    this.dislikes = dislikes;
    return this;
  }

  /**
   * Get dislikes
   * @return dislikes
  **/
  @ApiModelProperty(value = "")
  
    public String getDislikes() {
    return dislikes;
  }

  public void setDislikes(String dislikes) {
    this.dislikes = dislikes;
  }

  public Event avgrating(Integer avgrating) {
    this.avgrating = avgrating;
    return this;
  }

  /**
   * Get avgrating
   * @return avgrating
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAvgrating() {
    return avgrating;
  }

  public void setAvgrating(Integer avgrating) {
    this.avgrating = avgrating;
  }

  public Event volunteers(Integer volunteers) {
    this.volunteers = volunteers;
    return this;
  }

  /**
   * Get volunteers
   * @return volunteers
  **/
  @ApiModelProperty(value = "")
  
    public Integer getVolunteers() {
    return volunteers;
  }

  public void setVolunteers(Integer volunteers) {
    this.volunteers = volunteers;
  }

  public Event ovlhrs(String ovlhrs) {
    this.ovlhrs = ovlhrs;
    return this;
  }

  /**
   * Get ovlhrs
   * @return ovlhrs
  **/
  @ApiModelProperty(value = "")
  
    public String getOvlhrs() {
    return ovlhrs;
  }

  public void setOvlhrs(String ovlhrs) {
    this.ovlhrs = ovlhrs;
  }

  public Event livesImpacted(Integer livesImpacted) {
    this.livesImpacted = livesImpacted;
    return this;
  }

  /**
   * Get livesImpacted
   * @return livesImpacted
  **/
  @ApiModelProperty(value = "")
  
    public Integer getLivesImpacted() {
    return livesImpacted;
  }

  public void setLivesImpacted(Integer livesImpacted) {
    this.livesImpacted = livesImpacted;
  }

  public Event pocid(String pocid) {
    this.pocid = pocid;
    return this;
  }

  /**
   * Get pocid
   * @return pocid
  **/
  @ApiModelProperty(value = "")
  
    public String getPocid() {
    return pocid;
  }

  public void setPocid(String pocid) {
    this.pocid = pocid;
  }

  public Event pocname(String pocname) {
    this.pocname = pocname;
    return this;
  }

  /**
   * Get pocname
   * @return pocname
  **/
  @ApiModelProperty(value = "")
  
    public String getPocname() {
    return pocname;
  }

  public void setPocname(String pocname) {
    this.pocname = pocname;
  }

  public Event pocnumber(String pocnumber) {
    this.pocnumber = pocnumber;
    return this;
  }

  /**
   * Get pocnumber
   * @return pocnumber
  **/
  @ApiModelProperty(value = "")
  
    public String getPocnumber() {
    return pocnumber;
  }

  public void setPocnumber(String pocnumber) {
    this.pocnumber = pocnumber;
  }

  public Event month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Event councilName(String councilName) {
    this.councilName = councilName;
    return this;
  }

  /**
   * Get councilName
   * @return councilName
  **/
  @ApiModelProperty(value = "")
  
    public String getCouncilName() {
    return councilName;
  }

  public void setCouncilName(String councilName) {
    this.councilName = councilName;
  }

  public Event bname(String bname) {
    this.bname = bname;
    return this;
  }

  /**
   * Get bname
   * @return bname
  **/
  @ApiModelProperty(value = "")
  
    public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.baseLocation, event.baseLocation) &&
        Objects.equals(this.eventDate, event.eventDate) &&
        Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventName, event.eventName) &&
        Objects.equals(this.eventStatus, event.eventStatus) &&
        Objects.equals(this.totalTravelHour, event.totalTravelHour) &&
        Objects.equals(this.totalVolunteerHour, event.totalVolunteerHour) &&
        Objects.equals(this.totalVolunteers, event.totalVolunteers) &&
        Objects.equals(this.venueAddress, event.venueAddress) &&
        Objects.equals(this.rating, event.rating) &&
        Objects.equals(this.likes, event.likes) &&
        Objects.equals(this.dislikes, event.dislikes) &&
        Objects.equals(this.avgrating, event.avgrating) &&
        Objects.equals(this.volunteers, event.volunteers) &&
        Objects.equals(this.ovlhrs, event.ovlhrs) &&
        Objects.equals(this.livesImpacted, event.livesImpacted) &&
        Objects.equals(this.pocid, event.pocid) &&
        Objects.equals(this.pocname, event.pocname) &&
        Objects.equals(this.pocnumber, event.pocnumber) &&
        Objects.equals(this.month, event.month) &&
        Objects.equals(this.councilName, event.councilName) &&
        Objects.equals(this.bname, event.bname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseLocation, eventDate, eventId, eventName, eventStatus, totalTravelHour, totalVolunteerHour, totalVolunteers, venueAddress, rating, likes, dislikes, avgrating, volunteers, ovlhrs, livesImpacted, pocid, pocname, pocnumber, month, councilName, bname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
    sb.append("    totalTravelHour: ").append(toIndentedString(totalTravelHour)).append("\n");
    sb.append("    totalVolunteerHour: ").append(toIndentedString(totalVolunteerHour)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    dislikes: ").append(toIndentedString(dislikes)).append("\n");
    sb.append("    avgrating: ").append(toIndentedString(avgrating)).append("\n");
    sb.append("    volunteers: ").append(toIndentedString(volunteers)).append("\n");
    sb.append("    ovlhrs: ").append(toIndentedString(ovlhrs)).append("\n");
    sb.append("    livesImpacted: ").append(toIndentedString(livesImpacted)).append("\n");
    sb.append("    pocid: ").append(toIndentedString(pocid)).append("\n");
    sb.append("    pocname: ").append(toIndentedString(pocname)).append("\n");
    sb.append("    pocnumber: ").append(toIndentedString(pocnumber)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    councilName: ").append(toIndentedString(councilName)).append("\n");
    sb.append("    bname: ").append(toIndentedString(bname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
