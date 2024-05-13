package com.MTAPizza.Sympoll.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
    @Id
    @Column(name = "user_id", nullable = false)
    private int userID;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "created_at")
    private long createdAt;

    public UserEntity() {
    }

    public UserEntity(int user_id, String username, String email, long created_at) {
        this.userID = user_id;
        this.username = username;
        this.email = email;
        this.createdAt = created_at;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int user_id) {
        this.userID = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long created_at) {
        this.createdAt = created_at;
    }
}
