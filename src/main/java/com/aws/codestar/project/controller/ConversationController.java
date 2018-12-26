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

    @CrossOrigin
    @RequestMapping( method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public String receive(@RequestBody  Conversation conversation)
    {
        Logger.getAnonymousLogger().info(conversation.toString());
        conversationService.saveConversation(conversation);
        return conversation.getId();
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET, produces = "application/json")
    public Conversation send(@RequestParam String id)
    {
        String id1 = id;
        Conversation conversationByID = conversationService.findConversationByID(id1);
        Logger.getAnonymousLogger().info(conversationByID.toString());
        return conversationByID;
    }
}
