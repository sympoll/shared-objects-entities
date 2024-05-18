package com.MTAPizza.Sympoll;

import com.MTAPizza.Sympoll.entity.group.GroupEntity;
import com.MTAPizza.Sympoll.entity.poll.PollEntity;
import com.MTAPizza.Sympoll.entity.user.UserEntity;
import com.MTAPizza.Sympoll.service.group.GroupService;
import com.MTAPizza.Sympoll.service.poll.PollService;
import com.MTAPizza.Sympoll.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@SpringBootApplication
public class Main {

    @Autowired
    private PollService pollService;
    @Autowired
    private UserService userService;
    @Autowired
    private GroupService groupService;

    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Main main = context.getBean(Main.class);
        main.run();
        context.close();
    }

    private void run(){
        Timestamp currentDateInMs = new Timestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) * 1000);

        UserEntity userEntity = new UserEntity(1,"Roy", "meow12@gfuck.com", "12345", currentDateInMs);
        userService.addUser(userEntity);

        GroupEntity groupEntity = new GroupEntity(1, "Meowwwwwwww");
        groupService.addGroup(groupEntity);

        PollEntity pollEntity = new PollEntity(1, "test1", "meow ahi", 1, 1, 1, currentDateInMs, currentDateInMs, currentDateInMs);
        pollService.addPoll(pollEntity);

        PollEntity retrievedDBPoll = pollService.getPollByID(1);
        System.out.println(retrievedDBPoll.toString());

        GroupEntity retrievedDBGroup = groupService.getGroupByID(1);
        System.out.println(retrievedDBGroup.toString());

        UserEntity retrievedDBUser = userService.getUserByID(1);
        System.out.println(retrievedDBUser.toString());
    }

}
