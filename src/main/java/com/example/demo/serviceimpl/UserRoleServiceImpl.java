package com.example.demo.serviceimpl;

import com.example.demo.dao.RoleMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.dao.UserRoleRelationMapper;
import com.example.demo.domain.User;
import com.example.demo.domain.UserRoleRelation;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    UserRoleRelationMapper userRoleRelationMapper;
    @Autowired(required = false)
    RoleMapper roleMapper;
    @Override
    public String Update(String name, String role) {

        User user = userMapper.selectByUserName(name);
        System.out.println(user.getUserId());
        UserRoleRelation userRoleRelation = userRoleRelationMapper.selectByUserId(user.getUserId());
        System.out.println(userRoleRelation.getRoleId());
        roleMapper.updateByRoleId(userRoleRelation.getRoleId(),role);

        return "redirect:/View/Display";
    }
}
