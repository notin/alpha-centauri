package com.aws.codestar.project.service.rooms;

import com.aws.codestar.project.pojos.conversation.Conversation;
import com.aws.codestar.project.pojos.rooms.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomProviderService
{

    @Autowired
    RoomProviderRepository roomProviderRepository;

    @Autowired
    RoomRepository roomRepository;

    public void reserveRoom(Room s)
    {
        roomRepository.save(s);
    }

    public Conversation getRooms(String id)
    {
        String id1 = id;
        Optional<Conversation> byId = roomProviderRepository.findById(id1);
        return byId.get();
    }
}
