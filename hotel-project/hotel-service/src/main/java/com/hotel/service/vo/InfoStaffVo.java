package com.hotel.service.vo;

public class InfoStaffVo {
    private Long staffId;

    private String staffName;

    private Long staffMobile;

    private String password;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Long getStaffMobile() {
        return staffMobile;
    }

    public void setStaffMobile(Long staffMobile) {
        this.staffMobile = staffMobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}