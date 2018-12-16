
package com.aws.codestar.project.pojos;

import com.aws.codestar.project.util.Helper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Builder
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conversation {

    @Id
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("messages")
    public List<Message> messages = null;

    @Override
    public String toString()
    {
       return Helper.toJson(this);
    }
}
