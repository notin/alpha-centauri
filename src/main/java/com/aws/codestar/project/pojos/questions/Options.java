package com.aws.codestar.project.pojos.questions;

import com.aws.codestar.project.util.Helper;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;

import static com.aws.codestar.project.util.Helper.getUUID;

@Data
@Entity
@Builder
public class Options
{
    @JsonProperty("value")
    private String value;

    @JsonProperty("id")
    private String id = getUUID();

    @Override
    public String toString()
    {
        return Helper.toJson(this);
    }
}