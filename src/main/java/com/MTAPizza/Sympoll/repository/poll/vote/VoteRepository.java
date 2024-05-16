package com.MTAPizza.Sympoll.repository.poll.vote;

import com.MTAPizza.Sympoll.entity.poll.vote.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteEntity, Integer> {
}
