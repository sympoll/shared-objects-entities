package com.MTAPizza.Sympoll.service.poll;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.entity.user.UserEntity;
import com.MTAPizza.Sympoll.repository.poll.PollRepository;
import com.MTAPizza.Sympoll.repository.poll.answer.AnswerRepository;
import com.MTAPizza.Sympoll.repository.poll.vote.VoteRepository;
import com.MTAPizza.Sympoll.service.poll.answer.AnswerService;
import com.MTAPizza.Sympoll.service.poll.vote.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {
    private final PollRepository pollRepository;

    private AnswerService answerService;

    private VoteService voteService;

    @Autowired
    private void setServices(VoteService voteService, AnswerService answerService){
        this.answerService = answerService;
        this.voteService = voteService;
    }

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public List<PollEntity> list(){
        return pollRepository.findAll();
    }

    public PollEntity getPollByID(int id){
        return pollRepository.getReferenceById(id);
    }

    public long count(){
        return pollRepository.count();
    }

    public List<PollEntity> getPollsByCreatorID(int creatorID){
        return pollRepository.getPollEntityByCreatorID(creatorID);
    }

    public List<PollEntity> getPollsByGroupID(int groupID){
        return pollRepository.getPollEntityByGroupID(groupID);
    }

    public PollEntity addPoll(PollEntity poll){
        poll.setPollID((int)count() + 1);
        return pollRepository.save(poll);
    }

    public void deletePoll(PollEntity poll){
        pollRepository.delete(poll);

        answerService.deleteAllAnswersByPollID(poll.getPollID());
        voteService.deleteAllVotesByPollID(poll.getPollID());

    }
}
