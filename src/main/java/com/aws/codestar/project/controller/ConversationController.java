package com.aws.codestar.project.controller;

import com.aws.codestar.project.pojos.Conversation;
import com.aws.codestar.project.pojos.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/conversation")
public class ConversationController
{

    @Autowired
    private ConversationService conversationService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Conversation getConversation() {

        Conversation build = Conversation.builder().build();
        Logger.getAnonymousLogger().info(build.toString());
        return build;
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public void receive(@RequestBody  Conversation conversation)
    {
        Logger.getAnonymousLogger().info(conversation.toString());

        conversationService.saveConversation(conversation);
    }
}
