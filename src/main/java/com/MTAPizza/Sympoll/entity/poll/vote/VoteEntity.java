package com.MTAPizza.Sympoll.entity.poll.vote;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "votes")
public class VoteEntity implements Serializable {
    @Id
    @Column(name = "vote_id", nullable = false)
    private int voteID;

    @Column(name = "user_id")
    private int userID;

    @Column(name = "poll_id")
    private int pollID;

    @Column(name = "answer_id")
    private int answerID;

    @Column(name = "vote_datetime")
    private Timestamp voteDateTime;

    public VoteEntity() {
    }

    public VoteEntity(int voteID, int userID, int pollID, int answerID, Timestamp voteDateTime) {
        this.voteID = voteID;
        this.userID = userID;
        this.pollID = pollID;
        this.answerID = answerID;
        this.voteDateTime = voteDateTime;
    }

    public int getVoteID() {
        return voteID;
    }

    public void setVoteID(int voteID) {
        this.voteID = voteID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public Timestamp getVoteDateTime() {
        return voteDateTime;
    }

    public void setVoteDateTime(Timestamp voteDateTime) {
        this.voteDateTime = voteDateTime;
    }
}
