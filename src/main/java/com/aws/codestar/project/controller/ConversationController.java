package com.aws.codestar.project.controller;

import com.aws.codestar.project.pojos.conversation.Conversation;
import com.aws.codestar.project.service.conversations.ConversationService;
import com.aws.codestar.project.util.Helper;
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
    public Conversation receive(@RequestBody  Conversation conversation)
    {
        Logger.getAnonymousLogger().info(conversation.toString());
        conversationService.saveConversation(conversation);
        return conversation;
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET, produces = "application/json")
    public Conversation send(@RequestParam String id)
    {
        Conversation conversation = null;
        if(id !=null & !id.equalsIgnoreCase("") & !id.equalsIgnoreCase("null"))
        {
            try
            {
                conversation = conversationService.findConversationByID(id);
            }
            catch (Exception e)
            {
                Logger.getAnonymousLogger().info(e.getMessage());
                conversation = createConversation();
            }
            return conversation;
        }
        else
        {
            conversation = createConversation();
        }
        Logger.getAnonymousLogger().info(conversation.toString());
        return conversation;
    }

    private Conversation createConversation()
    {
        Conversation conversation;
        conversation = Conversation.builder().build();
        conversation.getMessageItem().stream().forEachOrdered(x->x.setTimestamps(Helper.getCurrentLocalDateTimeStamp()));
        return conversation;
    }
}
