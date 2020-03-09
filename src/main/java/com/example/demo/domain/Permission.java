package com.example.demo.domain;

public class Permission {
    private int PmId;
    private String PmName;
    private String PmDescription;

    public int getPmId() {
        return PmId;
    }

    public void setPmId(int pmId) {
        PmId = pmId;
    }

    public String getPmName() {
        return PmName;
    }

    public void setPmName(String pmName) {
        PmName = pmName;
    }

    public String getPmDescription() {
        return PmDescription;
    }

    public void setPmDescription(String pmDescription) {
        PmDescription = pmDescription;
    }
}
