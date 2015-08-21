package com.hotel.po;

public class CodeRoomType extends CodeRoomTypeKey {
    private String roomTypeName;

    private Float price;

    private Float off;

    private Float discountPrice;

    private Integer roomCount;

    private Integer overCount;

    private String byDay;

    private Float perDayFee;

    private String byScale;

    private Float perScaleNum;

    private Integer reserveRoomCount;

    private String weekend;

    private Float weekendPrice;

    private Integer orderNum;

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName == null ? null : roomTypeName.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getOff() {
        return off;
    }

    public void setOff(Float off) {
        this.off = off;
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getOverCount() {
        return overCount;
    }

    public void setOverCount(Integer overCount) {
        this.overCount = overCount;
    }

    public String getByDay() {
        return byDay;
    }

    public void setByDay(String byDay) {
        this.byDay = byDay == null ? null : byDay.trim();
    }

    public Float getPerDayFee() {
        return perDayFee;
    }

    public void setPerDayFee(Float perDayFee) {
        this.perDayFee = perDayFee;
    }

    public String getByScale() {
        return byScale;
    }

    public void setByScale(String byScale) {
        this.byScale = byScale == null ? null : byScale.trim();
    }

    public Float getPerScaleNum() {
        return perScaleNum;
    }

    public void setPerScaleNum(Float perScaleNum) {
        this.perScaleNum = perScaleNum;
    }

    public Integer getReserveRoomCount() {
        return reserveRoomCount;
    }

    public void setReserveRoomCount(Integer reserveRoomCount) {
        this.reserveRoomCount = reserveRoomCount;
    }

    public String getWeekend() {
        return weekend;
    }

    public void setWeekend(String weekend) {
        this.weekend = weekend == null ? null : weekend.trim();
    }

    public Float getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(Float weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}