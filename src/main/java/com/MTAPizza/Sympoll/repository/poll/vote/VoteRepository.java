package com.MTAPizza.Sympoll.repository.poll.vote;

import com.MTAPizza.Sympoll.entity.poll.vote.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<VoteEntity, Integer> {
    List<VoteEntity> getVoteEntitiesByPollID(int pollID);

    void deleteAllByPollID(int pollID);
}
