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
}
