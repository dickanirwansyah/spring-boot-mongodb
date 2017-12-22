package com.github.mongodb.springbootmongodb.controller;

import com.github.mongodb.springbootmongodb.document.User;
import com.github.mongodb.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/mongoDB/")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> findAlls(){
        List<User> userList = userRepository.findAll();
        if(userList.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }
}
