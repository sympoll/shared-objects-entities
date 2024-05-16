package com.MTAPizza.Sympoll.service.poll;

import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.repository.poll.PollRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public List<PollEntity> list(){
        return pollRepository.findAll();
    }

    public PollEntity getPollById(int id){
        return pollRepository.getReferenceById(id);
    }

    public long count(){
        return pollRepository.count();
    }
}
