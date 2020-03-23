package com.example.demo.controller;

import com.example.demo.service.RoleService;
import com.example.demo.service.UserRoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/Role")
public class RoleController {
    @Autowired(required = false)
    private RoleService roleService;
    @Autowired(required = false)
    private UserRoleService userRoleService;

    @RequestMapping(value = "/Display")
    public void Display(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String option = request.getParameter("option");
        System.out.println(option);
        String rolejson = roleService.Display();
        System.out.println(rolejson);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(rolejson);

    }

    @RequestMapping(value = "/Query")
    public void Query(HttpServletResponse httpServletResponse,HttpServletRequest request) throws IOException {
        String a = request.getParameter("query");
        System.out.println(a);
        String responsedata = roleService.Query(a);
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=utf-8");

        httpServletResponse.getWriter().write(responsedata);

    }

    @RequestMapping(value = "/Delete")
    public String Delete(HttpServletRequest request){
        String a = request.getParameter("type");
        return roleService.Delete(a);
    }

    @RequestMapping(value = "/Update")
    public String Update(HttpServletRequest request){
        String a = request.getParameter("name");
        String r = request.getParameter("role");

        System.out.println(a+r);

        String s = userRoleService.Update(a,r);

        return "redirect:/View/Display";
    }

    @RequestMapping(value = "/RoleAdd")
    public String RoleAdd(HttpServletRequest request){
        String name = request.getParameter("name");
        String ds = request.getParameter("description");
        String pm = request.getParameter("permission");
        System.out.println(name+ds+pm);

        return roleService.Insert(name,ds,pm);
    }

    @RequestMapping(value = "/Info")
    public void Info(HttpServletResponse response) throws IOException {
        String info = roleService.Info();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(info);
    }
}
