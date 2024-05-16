package com.MTAPizza.Sympoll.service.user;

import com.MTAPizza.Sympoll.repository.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
