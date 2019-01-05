package com.aws.codestar.project.controller;

import com.aws.codestar.project.pojos.rooms.Room;
import com.aws.codestar.project.pojos.rooms.RoomProvider;
import com.aws.codestar.project.service.rooms.RoomProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
@RequestMapping("/conversation")
public class RoomProviderController
{

    @Autowired
    private RoomProviderService roomProvider;

    @CrossOrigin
    @RequestMapping( method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RoomProvider receive(@RequestBody  RoomProvider roomProvider)
    {
        Logger.getAnonymousLogger().info(roomProvider.toString());

        String requesterId = roomProvider.getRequesterId();
        Room room = roomProvider.getProvider().stream().filter(x -> x.isAvailable() == true && x.getUserId().equalsIgnoreCase(requesterId)).findFirst().get();
        this.roomProvider.reserveRoom(room);
        return roomProvider;
    }

//    @CrossOrigin
//    @RequestMapping( method = RequestMethod.GET, produces = "application/json")
//    public Conversation send(@RequestParam String id)
//    {
//        Conversation conversation = null;
//        if(id !=null & !id.equalsIgnoreCase("") & !id.equalsIgnoreCase("null"))
//        {
//            conversation = roomProvider.getRooms(id);
//            return conversation;
//        }
//        else
//        {
//           conversation = Conversation.builder().build();
//           conversation.getMessageItem().stream().forEachOrdered(x->x.setTimestamps(Helper.getCurrentLocalDateTimeStamp()));
//        }
//        Logger.getAnonymousLogger().info(conversation.toString());
//        return conversation;
//    }
}
