package com.example.demo.serviceimpl;

import com.example.demo.dao.UserMapper;
import com.example.demo.dao.UserRoleRelationMapper;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRole;
import com.example.demo.domain.UserRoleRelation;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    UserRoleRelationMapper userRoleRelationMapper;
    @Override
    public String Login(User user) {

        String name = "";
        String pwd = "";
        name = user.getUserName();
        pwd = user.getUserPwd();

        try{
            if(userMapper.selectByUserName(name).getUserPwd().equals(pwd)){ //对比数据库
                return "redirect:/View/Display";
            }else{
                return "false";
            }
        }catch (Exception e){
            return "false";
        }

    }

    @Override
    public String Display() {
        ArrayList<UserRole> userRoles = new ArrayList<>();
        userRoles = userMapper.selectAllUserRole();
        Gson gson = new Gson();
        String userjson = gson.toJson(userRoles);
        System.out.println(userjson);

        return userjson;
    }

    @Override
    public String Query(String query) {
        ArrayList<UserRole> users = new ArrayList<>();
        users = userMapper.selectByAboutName(query);
        Gson gson = new Gson();
        String queryjson = gson.toJson(users);
        return queryjson;
    }

    @Override
    public String Delete(String name) {
        User user = userMapper.selectByUserName(name);
        userMapper.deleteByUserName(name);

        System.out.println(user.getUserId());
        userRoleRelationMapper.deleteByUserId(user.getUserId());
        return "redirect:/View/Display";
    }

    @Override
    public String Insert(String name, String pwd) {

        userMapper.insertUser(name,pwd);
        int id = userMapper.selectByUserName(name).getUserId();
        userRoleRelationMapper.insertUserId(id);


        return "redirect:/View/Display";
    }


}
