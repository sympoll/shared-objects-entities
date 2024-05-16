package com.MTAPizza.Sympoll.repository.poll;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<PollEntity, Integer> {
}
