package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;
import java.io.IOException;

@Controller
@RequestMapping(value = "/User")
public class UserController {

    @Autowired(required = false)
    private UserService userService;
    @RequestMapping(value = "/Login")
    public String Login(HttpServletRequest request) {

        String n = "";
        String p = "";
        try{
            n = request.getParameter("name");
            p = request.getParameter("pwd");
        }catch (Exception e){

        }
        System.out.println(n+p);

        User user = new User();

        user.setUserPwd(p);
        user.setUserName(n);

        String result = userService.Login(user);
        if(result.equals("false")){
                            //传失败数据
            return "redirect:/View/Login";  //false
        }else{
            return result;  //success
        }

    }
    @RequestMapping(value = "/Display")
    public void Display(HttpServletResponse httpServletResponse,HttpServletRequest request) throws IOException {
        String a = request.getParameter("option");
        System.out.println(a);
        String responsedata = userService.Display();
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=utf-8");
        httpServletResponse.getWriter().write(responsedata);

    }
    @RequestMapping(value = "/Query")
    public void Query(HttpServletResponse httpServletResponse,HttpServletRequest request) throws IOException {
        String a = request.getParameter("query");
        System.out.println(a);
        String responsedata = userService.Query(a);
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=utf-8");

        httpServletResponse.getWriter().write(responsedata);

    }

    @RequestMapping(value = "/Delete")
    public String Delete(HttpServletRequest request){
        String a = request.getParameter("name");
        return userService.Delete(a);
    }


}
