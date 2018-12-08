
package com.aws.codestar.project.pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aws.codestar.project.util.Helper;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString()
    {
       return Helper.toJson(this);
    }
}
