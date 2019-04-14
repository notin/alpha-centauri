package com.aws.codestar.project.pojos.questions;

import com.aws.codestar.project.util.Helper;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

import static com.aws.codestar.project.util.Helper.getUUID;

@Data
@Entity
@Builder
public class Question
{

    @JsonProperty("question")
    private String question;

    @JsonProperty("id")
    private String id = getUUID();

    @JsonProperty("answer")
    private String answer;

    @JsonProperty("option")
    private List<Options> option = null;

    @Override
    public String toString()
    {
        return Helper.toJson(this);
    }

    public List<Options> getOption()
    {
        if(option == null)
        {
            option = new ArrayList<>();
        }
        return option;
    }
}