package com.aws.codestar.project.controller;

import com.aws.codestar.project.pojos.questions.Question;
import com.aws.codestar.project.pojos.rooms.RoomProvider;
import com.aws.codestar.project.service.rooms.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/question")
public class QuestionController
{

    @Autowired
    private QuestionService questionService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void receive(@RequestBody Question question)
    {
        Logger.getAnonymousLogger().info(question.toString());

        String requesterId = question.getId();

    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Question send()
    {
        Logger.getAnonymousLogger().info(questionService.toString());

        Question question = questionService.getQuestion();

        return question;
    }
}
