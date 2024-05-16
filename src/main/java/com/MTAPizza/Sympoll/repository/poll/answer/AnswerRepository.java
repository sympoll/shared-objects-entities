package com.MTAPizza.Sympoll.repository.poll.answer;

import com.MTAPizza.Sympoll.entity.poll.answer.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
}
