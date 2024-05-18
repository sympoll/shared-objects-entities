package com.MTAPizza.Sympoll.service.poll.vote;

import com.MTAPizza.Sympoll.entity.poll.vote.VoteEntity;
import com.MTAPizza.Sympoll.repository.poll.vote.VoteRepository;
import com.MTAPizza.Sympoll.service.poll.answer.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    private AnswerService answerService;

    /**
     * Injecting  AnswerService, so we can call it in this service.
     */
    @Autowired
    public void setAnswerService(AnswerService answerService){
        this.answerService = answerService;
    }

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public List<VoteEntity> list(){
        return voteRepository.findAll();
    }

    public VoteEntity getAnswerByID(int id){
        return voteRepository.getReferenceById(id);
    }

    public long count(){
        return voteRepository.count();
    }

    public List<VoteEntity> getVotesByPollID(int pollID){
        return  voteRepository.getVoteEntitiesByPollID(pollID);
    }

    public VoteEntity addVote(VoteEntity vote){
        int answerID = vote.getAnswerID();
        int numOfVotes = answerService.getAnswerByID(answerID).getNumOfVotes();
        answerService.updateAnswerVotes(answerID, numOfVotes + 1);

        vote.setVoteID((int)count() + 1);
        return voteRepository.save(vote);
    }

    public void deleteVote(VoteEntity vote){
        int answerID = vote.getAnswerID();
        int numOfVotes = answerService.getAnswerByID(answerID).getNumOfVotes();
        answerService.updateAnswerVotes(answerID, numOfVotes - 1);

        voteRepository.delete(vote);
    }

    public void deleteAllVotesByPollID(int pollID){
        voteRepository.deleteAllByPollID(pollID);
    }
}
