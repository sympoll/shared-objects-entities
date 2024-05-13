package com.MTAPizza.Sympoll.entity.poll.vote;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "votes")
public class VoteEntity implements Serializable {
    @Id
    @Column(name = "vote_id", nullable = false)
    private int voteID;
}
