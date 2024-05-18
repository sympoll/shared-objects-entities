package com.MTAPizza.Sympoll.service.poll.vote;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.entity.poll.answer.AnswerEntity;
import com.MTAPizza.Sympoll.entity.poll.vote.VoteEntity;
import com.MTAPizza.Sympoll.entity.user.UserEntity;
import com.MTAPizza.Sympoll.repository.poll.vote.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

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
        vote.setVoteID((int)count() + 1);
        return voteRepository.save(vote);
    }
}
