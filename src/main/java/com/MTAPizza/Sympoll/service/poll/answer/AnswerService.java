package com.MTAPizza.Sympoll.service.poll.answer;

import com.MTAPizza.Sympoll.repository.poll.answer.AnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
}
