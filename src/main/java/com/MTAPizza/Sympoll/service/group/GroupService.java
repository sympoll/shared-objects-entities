package com.MTAPizza.Sympoll.service.group;

import com.MTAPizza.Sympoll.entity.group.GroupEntity;
import com.MTAPizza.Sympoll.entity.poll.answer.AnswerEntity;
import com.MTAPizza.Sympoll.repository.group.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<GroupEntity> list(){
        return groupRepository.findAll();
    }

    public GroupEntity getPollById(int id){
        return groupRepository.getReferenceById(id);
    }

    public long count(){
        return groupRepository.count();
    }
}
