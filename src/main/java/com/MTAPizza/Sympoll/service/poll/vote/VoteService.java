package com.MTAPizza.Sympoll.service.poll.vote;

import com.MTAPizza.Sympoll.entity.user.UserEntity;
import com.MTAPizza.Sympoll.repository.poll.vote.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }



}
