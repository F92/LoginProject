package com.example.demo.domain;

public class UserRoleRelation {
    private int UrrId;
    private int UserId;
    private int RoleId;

    public int getUrrId() {
        return UrrId;
    }

    public void setUrrId(int urrId) {
        UrrId = urrId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }
}
