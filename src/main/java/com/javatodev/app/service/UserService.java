package com.javatodev.app.service;

import com.javatodev.app.model.dto.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> readUsers () {
        List<User> users = new ArrayList<>();
        users.add(User.builder().id(1L).firstName("Sam").lastName("George").email("random_user01@gmail.com").build());
        users.add(User.builder().id(2L).firstName("John").lastName("Doe").email("johndoe@gmail.com").build());
        users.add(User.builder().id(3L).firstName("Jane").lastName("Doe").email("janedoe@gmail.com").build());
        users.add(User.builder().id(4L).firstName("Nik").lastName("George").email("random_user01@gmail.com").build());
        users.add(User.builder().id(5L).firstName("Sonu").lastName("Nigam").email("random_user01@gmail.com").build());
        return users;
    }
}
