package com.aws.codestar.project.controller;


import com.aws.codestar.project.pojos.questions.Options;
import com.aws.codestar.project.pojos.questions.Question;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * Tests for {@link ConversationController}. Modify the tests in order to support your use case as you build your project.
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = QuestionController.class)
public class QuestionControllerTest
{

    @Autowired
    private QuestionController controller;

    @BeforeClass()
    public void setup()
    {
//        controller = new ConversationController();
    }
    /**
     * Initializing variables before we run the tests.
     * Use @BeforeAll for initializing static variables at the start of the test class execution.
     * Use @BeforeEach for initializing variables before each test is run.
     */
    /**
     * Basic test to verify the result obtained when calling post
     */
    @Test
    void testPostRequest()
    {
        Question conversation = Question.builder().build();
        Options build = Options.builder().build();
        conversation.getOption().add(build);
        String msg = conversation.toString();
        Logger.getAnonymousLogger().info(msg);
    }

}
