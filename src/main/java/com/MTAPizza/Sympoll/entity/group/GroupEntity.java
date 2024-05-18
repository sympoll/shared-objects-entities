package com.MTAPizza.Sympoll.entity.group;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "groups")
public class GroupEntity implements Serializable {
    @Id
    @Column(name = "group_id", nullable = false)
    private int groupID;

    @Column(name = "group_name")
    private String groupName;

    public GroupEntity() {
    }

    public GroupEntity(int groupID, String groupName) {
        this.groupID = groupID;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "GroupEntity{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
