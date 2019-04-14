package com.aws.codestar.project.service.rooms;

import com.aws.codestar.project.pojos.questions.Options;
import com.aws.codestar.project.pojos.rooms.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OptionsRepository extends CrudRepository<Options, String> {
}
