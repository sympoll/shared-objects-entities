package com.MTAPizza.Sympoll.repository.group;

import com.MTAPizza.Sympoll.entity.group.GroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,Integer> {
}
