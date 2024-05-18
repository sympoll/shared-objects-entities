package com.MTAPizza.Sympoll.service.user;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.entity.user.UserEntity;
import com.MTAPizza.Sympoll.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> list(){
        return userRepository.findAll();
    }

    public UserEntity getUserById(int id){
        return userRepository.getReferenceById(id);
    }

    public long count(){
        return userRepository.count();
    }
}
