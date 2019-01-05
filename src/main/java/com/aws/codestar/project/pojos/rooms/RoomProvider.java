package com.aws.codestar.project.pojos.rooms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

import static com.aws.codestar.project.util.Helper.toJson;

@Data
@Entity
@Builder
public class RoomProvider{

	@JsonProperty("provider")
	private List<Room> provider;

	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("requesterId")
	private String requesterId;

	@Override
	public String toString()
	{
		return toJson(this);
	}
}