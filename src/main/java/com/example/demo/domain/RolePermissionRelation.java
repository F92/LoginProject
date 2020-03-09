package com.example.demo.domain;

public class RolePermissionRelation {
    private int RppId;
    private int RoleId;
    private int PmId;

    public int getRppId() {
        return RppId;
    }

    public void setRppId(int rppId) {
        RppId = rppId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int roleId) {
        RoleId = roleId;
    }

    public int getPmId() {
        return PmId;
    }

    public void setPmId(int pmId) {
        PmId = pmId;
    }
}
