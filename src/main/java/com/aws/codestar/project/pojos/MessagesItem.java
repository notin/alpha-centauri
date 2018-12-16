package com.aws.codestar.project.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class MessagesItem{

	@JsonProperty("timestamps")
	private String timestamps;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@JsonProperty("id")
	private String id;

	@JsonProperty("message")
	private String message;

	@JsonProperty("user")
	private String user;
}