package com.MTAPizza.Sympoll.entity.poll;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "polls")
public class PollEntity implements Serializable {
    @Id
    @Column(name = "poll_id", nullable = false)
    private int pollID;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "creator_id", nullable = false)
    private int creatorID;
    @Column(name = "group_id", nullable = false)
    private int groupID;
    @Column(name = "num_answers_allowed", nullable = false)
    private int numAnswersAllowed;
    @Column(name = "time_created")
    private Timestamp timeCreated;
    @Column(name = "time_updated")
    private Timestamp timeUpdated;
    @Column(name = "time_ends")
    private Timestamp timeEnds;

    public PollEntity() {
    }

    public PollEntity(int pollID, String title, String description, int creatorID, int groupID, int numAnswersAllowed, Timestamp timeCreated, Timestamp timeUpdated, Timestamp timeEnds) {
        this.pollID = pollID;
        this.title = title;
        this.description = description;
        this.creatorID = creatorID;
        this.groupID = groupID;
        this.numAnswersAllowed = numAnswersAllowed;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeEnds = timeEnds;
    }

    @Override
    public String toString() {
        return "PollEntity{" +
                "pollID=" + pollID +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creatorID=" + creatorID +
                ", groupID=" + groupID +
                ", numAnswersAllowed=" + numAnswersAllowed +
                ", timeCreated=" + timeCreated +
                ", timeUpdated=" + timeUpdated +
                ", timeEnds=" + timeEnds +
                '}';
    }

    public int getPollID() {
        return pollID;
    }

    public void setPollID(int pollID) {
        this.pollID = pollID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(int creatorID) {
        this.creatorID = creatorID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getNumAnswersAllowed() {
        return numAnswersAllowed;
    }

    public void setNumAnswersAllowed(int numAnswersAllowed) {
        this.numAnswersAllowed = numAnswersAllowed;
    }

    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Timestamp getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(Timestamp timeUpdated) {
        this.timeUpdated = timeUpdated;
    }

    public Timestamp getTimeEnds() {
        return timeEnds;
    }

    public void setTimeEnds(Timestamp timeEnds) {
        this.timeEnds = timeEnds;
    }
}
