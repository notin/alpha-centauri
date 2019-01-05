package com.aws.codestar.project.service.rooms;

import com.aws.codestar.project.pojos.conversation.Conversation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoomProviderRepository extends CrudRepository<Conversation, String> {
}
