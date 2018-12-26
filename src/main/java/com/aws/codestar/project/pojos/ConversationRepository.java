package com.aws.codestar.project.pojos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ConversationRepository extends CrudRepository<Conversation, String> {
}
