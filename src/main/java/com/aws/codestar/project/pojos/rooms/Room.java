package com.aws.codestar.project.pojos.rooms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

import static com.aws.codestar.project.util.Helper.toJson;

@Data
@Entity
@Builder
public class Room
{

	@JsonProperty("timestamps")
	private String timestamps;

	@JsonProperty("checkin time")
	private String checkinTime;

	@JsonProperty("available")
	private boolean available;

	@JsonProperty("location")
	private String location;

	@JsonProperty("userId")
	private String userId;

	@Override
 	public String toString() { return toJson(this); }
}