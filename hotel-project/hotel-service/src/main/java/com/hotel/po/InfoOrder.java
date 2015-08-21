package com.hotel.po;

import java.util.Date;

public class InfoOrder {
    private Long orderNo;

    private String channel;

    private Long custNo;

    private String custName;

    private String mobileNumber;

    private Long custNo2;

    private String custName2;

    private Long custNo3;

    private String custName3;

    private String orderStatus;

    private String roomType;

    private String roomCode;

    private Float discountPrice;

    private Long payNo;

    private String validTime;

    private Date startTime;

    private Date endTime;

    private String remark;

    private Date updateTime;

    private String operNo;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(Long custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber == null ? null : mobileNumber.trim();
    }

    public Long getCustNo2() {
        return custNo2;
    }

    public void setCustNo2(Long custNo2) {
        this.custNo2 = custNo2;
    }

    public String getCustName2() {
        return custName2;
    }

    public void setCustName2(String custName2) {
        this.custName2 = custName2 == null ? null : custName2.trim();
    }

    public Long getCustNo3() {
        return custNo3;
    }

    public void setCustNo3(Long custNo3) {
        this.custNo3 = custNo3;
    }

    public String getCustName3() {
        return custName3;
    }

    public void setCustName3(String custName3) {
        this.custName3 = custName3 == null ? null : custName3.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode == null ? null : roomCode.trim();
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getPayNo() {
        return payNo;
    }

    public void setPayNo(Long payNo) {
        this.payNo = payNo;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime == null ? null : validTime.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperNo() {
        return operNo;
    }

    public void setOperNo(String operNo) {
        this.operNo = operNo == null ? null : operNo.trim();
    }
}