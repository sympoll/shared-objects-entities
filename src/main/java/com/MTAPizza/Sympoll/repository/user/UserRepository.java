package com.MTAPizza.Sympoll.repository.user;

import com.MTAPizza.Sympoll.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity getUserEntityByUserID(int userID);
}
