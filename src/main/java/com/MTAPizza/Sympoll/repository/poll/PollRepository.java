package com.MTAPizza.Sympoll.repository.poll;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<PollEntity, Integer> {
}
