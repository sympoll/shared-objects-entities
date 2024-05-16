package com.MTAPizza.Sympoll.service.poll;

import com.MTAPizza.Sympoll.repository.poll.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }
}
