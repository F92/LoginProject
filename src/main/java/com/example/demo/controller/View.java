package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/View")
public class View {

    @Autowired(required = false)
    private UserService userService;
    @RequestMapping("/Login")
    public String Login(){


        return "Login";
    }
    @RequestMapping("/Display")
    public String Display()  {


        return "Display";
    }
    @RequestMapping("/UserAdd")
    public String UserAdd(){

        return "UserAdd";
    }
    @RequestMapping("/RoleAdd")
    public String RoleAdd(){

        return "RoleAdd";
    }
}
