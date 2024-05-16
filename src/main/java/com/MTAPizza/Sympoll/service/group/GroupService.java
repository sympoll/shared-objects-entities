package com.MTAPizza.Sympoll.service.group;

import com.MTAPizza.Sympoll.repository.group.GroupRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }
}
