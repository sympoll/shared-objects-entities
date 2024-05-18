package com.MTAPizza.Sympoll.repository.poll;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<PollEntity, Integer> {
    List<PollEntity> getPollEntityByCreatorID(int creatorID);

    List<PollEntity> getPollEntityByGroupID(int groupID);
}
