package com.uasms.adhyayan.service;

import com.uasms.adhyayan.dao.UserRepository;
import com.uasms.adhyayan.entity.User;
import com.uasms.adhyayan.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    private UserModel convertUserToUserModel(User user) {
        return new UserModel(
                user.getId(),
                user.getName(),
                user.getPhoneNo(),
                user.getEmail(),
                user.getDateOfBirth(),
                user.getAddress(),
                user.getCourse()
        );
    }

    UserModel getUser(int id) {
        return convertUserToUserModel(userRepository.getReferenceById(id + ""));
    }

}
