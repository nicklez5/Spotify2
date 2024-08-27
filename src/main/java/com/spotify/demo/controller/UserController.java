package com.spotify.demo.controller;

import com.spotify.demo.entity.CurrentUserSession;
import com.spotify.demo.entity.Login;
import com.spotify.demo.entity.User;
import com.spotify.demo.exception.CurrentUserException;
import com.spotify.demo.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spotify.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addUser() throws UserException {
        String user1 = userService.addUser();
        return new ResponseEntity<String>(user1, HttpStatus.CREATED);
    }
//    @PostMapping("/add")
//    public ResponseEntity<User> addUser(@RequestBody User user) throws UserException {
//        User user1 = userService.addUser(user);
//        return new ResponseEntity<User>(user1, HttpStatus.CREATED);
//    }
//    @PutMapping("/update/{uuId}")
//    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("uuId") String uuId) throws CurrentUserException {
//        User user1 = userService.updateUser(user, uuId);
//        return new ResponseEntity<User>(user1, HttpStatus.OK);
//    }
//    @DeleteMapping("/delete/{uuId}/{id}")
//    public ResponseEntity<User> deleteUser(@PathVariable("uuId") String uuId, @PathVariable("id") Integer id) throws CurrentUserException,UserException {
//        User user1 = userService.deleteUser(uuId,id);
//        return new ResponseEntity<User>(user1,HttpStatus.OK);
//    }
//    @GetMapping("/read/{uuId}")
//    public ResponseEntity<User> readUser(@PathVariable("uuId") String uuId) throws CurrentUserException {
//        User user1 = userService.readUser(uuId);
//        return new ResponseEntity<User>(user1,HttpStatus.OK);
//    }
//    @PostMapping("/login")
//    public ResponseEntity<CurrentUserSession> logIn(@RequestBody Login logIn) throws CurrentUserException {
//       CurrentUserSession session = userService.logIn(logIn);
//       return new ResponseEntity<CurrentUserSession>(session,HttpStatus.OK);
//    }
//    @DeleteMapping("/logout/{uuId}")
//    public ResponseEntity<String> logOut(@PathVariable("uuId") String uuId) throws CurrentUserException {
//        String message = userService.logOut(uuId);
//        return new ResponseEntity<String>(message,HttpStatus.OK);
//    }

}
