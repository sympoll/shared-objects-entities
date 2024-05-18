package com.MTAPizza.Sympoll.service.poll.answer;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.entity.poll.answer.AnswerEntity;
import com.MTAPizza.Sympoll.repository.poll.answer.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public List<AnswerEntity> list(){
        return answerRepository.findAll();
    }

    public AnswerEntity getPollById(int id){
        return answerRepository.getReferenceById(id);
    }

    public long count(){
        return answerRepository.count();
    }
}
