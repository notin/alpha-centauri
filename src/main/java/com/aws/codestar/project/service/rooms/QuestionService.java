package com.aws.codestar.project.service.rooms;

import com.aws.codestar.project.pojos.questions.Options;
import com.aws.codestar.project.pojos.questions.Question;
import com.aws.codestar.project.pojos.rooms.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService
{
    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    OptionsRepository answerRepo;

    public void saveQuestion(Question q, Options s)
    {
        answerRepo.save(s);
        questionRepository.save(q);
    }

    public Question getQuestion()
    {
        Question answer = null;
        Iterable<Question> all = questionRepository.findAll();
        Question build = Question.builder().build();

        for( Question question: all)
        {

            if(question.getQuestion()!= null && !question.getAnswer().isEmpty())
            {
                answer = question;
                break;
            }
        }
        return answer;
    }
}
