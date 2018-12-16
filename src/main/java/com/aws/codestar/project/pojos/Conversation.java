package com.aws.codestar.project.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
@Data
@Entity
@Builder
public class Conversation{

	@JsonProperty("messages")
    @OneToMany(targetEntity=MessagesItem.class, mappedBy="id", fetch=FetchType.EAGER)
	private List<MessagesItem> messages;

    @GeneratedValue(strategy= GenerationType.AUTO)
	@JsonProperty("id")
	private int id;
}