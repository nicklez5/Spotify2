package com.spotify.demo.service;

import com.spotify.demo.entity.CurrentUserSession;
import com.spotify.demo.entity.Login;
import com.spotify.demo.entity.User;
import com.spotify.demo.exception.CurrentUserException;
import com.spotify.demo.exception.UserException;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface UserService {
    public String addUser();
    //public User addUser(User user) throws UserException;
//    public User updateUser(User user, String uuId) throws CurrentUserException;
//    public User readUser(String uuId) throws CurrentUserException;
//    public User deleteUser(String uuId, Integer id) throws CurrentUserException, UserException;
    public List<User> getAllUsers();
//    public CurrentUserSession logIn(Login logIn) throws CurrentUserException;
//    public String logOut(String uuId) throws CurrentUserException;
}
