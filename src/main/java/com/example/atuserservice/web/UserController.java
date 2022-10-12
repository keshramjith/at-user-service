package com.example.atuserservice.web;

import com.example.atuserservice.data.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    // just to check with POSTMAN
    @GetMapping
    public ResponseEntity<ArrayList<User>> getAllUsers() {
        return new ResponseEntity<>(new ArrayList<User>(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getUser(@RequestParam String id) {
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
