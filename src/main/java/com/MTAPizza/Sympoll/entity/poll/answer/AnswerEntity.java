package com.MTAPizza.Sympoll.entity.poll.answer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "answer_options")
public class AnswerEntity implements Serializable {
    @Id
    @Column(name = "answer_id", nullable = false)
    private int answerID;
    @Column(name = "poll_id", nullable = false)
    private int pollID;
    @Column(name = "ordinal", nullable = false)
    private int ordinal;
    @Column(name = "answer_text")
    private String answerText;
    @Column(name = "num_of_votes")
    private int numOfVotes;

    public AnswerEntity() {
    }

    public AnswerEntity(int answerID, int pollID, int ordinal, String answerText, int numberOfVotes) {
        this.answerID = answerID;
        this.pollID = pollID;
        this.ordinal = ordinal;
        this.answerText = answerText;
        this.numOfVotes = numberOfVotes;
    }

    public int getAnswerID() {
        return answerID;
    }

    public int getPollID() {
        return pollID;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getAnswerText() {
        return answerText;
    }

    public int getNumOfVotes() {
        return numOfVotes;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public void setNumOfVotes(int numOfVotes) {
        this.numOfVotes = numOfVotes;
    }
}
