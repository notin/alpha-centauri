package com.aws.codestar.project.controller;

import com.aws.codestar.project.pojos.Conversation;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/conversation")
public class ConversationController
{

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Conversation getConversation() {

        Conversation build = Conversation.builder().build();
        Logger.getAnonymousLogger().info(build.toString());
        return build;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void setConversation(@RequestParam(value = "name", defaultValue = "World") Conversation conversation) {

        Logger.getAnonymousLogger().info(String.valueOf(conversation.getId()));
    }

}
