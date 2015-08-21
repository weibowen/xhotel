package com.hotel.service.vo;

import java.util.Date;

public class InfoPayVo {
    private Long feeNo;

    private Long payNo;

    private Long custNo;

    private String roomCode;

    private String status;

    private String payMode;

    private Float payFee;

    private Date payTime;

    private String operNo;

    public Long getFeeNo() {
        return feeNo;
    }

    public void setFeeNo(Long feeNo) {
        this.feeNo = feeNo;
    }

    public Long getPayNo() {
        return payNo;
    }

    public void setPayNo(Long payNo) {
        this.payNo = payNo;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(Long custNo) {
        this.custNo = custNo;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public Float getPayFee() {
        return payFee;
    }

    public void setPayFee(Float payFee) {
        this.payFee = payFee;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo == null ? null : operNo.trim();
    }
}