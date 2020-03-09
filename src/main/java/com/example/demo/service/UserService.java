package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {

    String Login(User user);

    String Display();

    String Query(String name);

    String Delete(String name);


}
