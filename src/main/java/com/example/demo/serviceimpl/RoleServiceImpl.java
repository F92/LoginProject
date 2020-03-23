package com.example.demo.serviceimpl;

import com.example.demo.dao.PermissionMapper;
import com.example.demo.dao.RoleMapper;
import com.example.demo.dao.RolePermissionRelationMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.domain.Permission;
import com.example.demo.domain.Role;
import com.example.demo.domain.RolePermission;
import com.example.demo.domain.User;
import com.example.demo.service.RoleService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired(required = false)
    RoleMapper roleMapper;
    @Autowired(required = false)
    RolePermissionRelationMapper rolePermission;
    @Autowired(required = false)
    PermissionMapper permissionMapper;
    @Override
    public String Display() {
        ArrayList<RolePermission> rolePermissions = new ArrayList<>();
        rolePermissions = roleMapper.selectByRolePermission();
        Gson gson = new Gson();
        String rolejson = gson.toJson(rolePermissions);
        System.out.println(rolejson);
        return rolejson;
    }

    @Override
    public String Query(String query) {
        ArrayList<RolePermission> roles = new ArrayList<>();
        roles = roleMapper.selectByAboutType(query);
        Gson gson = new Gson();
        String queryjson = gson.toJson(roles);
        return queryjson;
    }

    @Override
    public String Delete(String type) {

        Role role = roleMapper.selectByRoleType(type);
        roleMapper.deleteByRoleType(type);

        System.out.println(role.getRoleId());
        rolePermission.deleteByRoleId(role.getRoleId());

        return "redirect:/View/Display";
    }

    @Override
    public String Insert(String type, String ds, String pm) {

        roleMapper.insertRole(type,ds);
        int roleid = roleMapper.selectByRoleType(type).getRoleId();
        int pmid = permissionMapper.selectByPmName(pm).getPmId();
        rolePermission.insertRoleId(roleid,pmid);
        return "redirect:/View/Display";
    }

    @Override
    public String Info() {

        ArrayList<Role> role = new ArrayList<>();
        role = roleMapper.selectAllRole();
        Gson gson = new Gson();
        String info = gson.toJson(role);
        return info;
    }


}
