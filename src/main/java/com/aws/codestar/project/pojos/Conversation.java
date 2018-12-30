package com.aws.codestar.project.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static com.aws.codestar.project.util.Helper.getUUID;
import static com.aws.codestar.project.util.Helper.toJson;

@Generated("com.robohorse.robopojogenerator")
@Data
@Entity
@Builder
public class Conversation{

	@JsonProperty("messageItem")
    @OneToMany
	private List<MessagesItem> messageItem;

	@Id
	@JsonProperty("id")
	private String id = getUUID();;

    public List<MessagesItem> getMessageItem()
	{
		if(messageItem == null)
		{
			MessagesItem messagesItem = MessagesItem.builder().build();
			messageItem = new ArrayList<>();
			messageItem.add(messagesItem);
		}
		return messageItem;
	}

	public  String getId()
	{
		this.id = id == null ? getUUID() : id;
		return id;
	}

	public void setId(String id)
	{ this.id = id == null ? getUUID() : id; }

	@Override
	public String toString()
	{
		return toJson(this);
	}
}