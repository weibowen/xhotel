package com.hotel.po;

import java.util.ArrayList;
import java.util.List;

public class CodeRoomTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeRoomTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNull() {
            addCriterion("room_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNotNull() {
            addCriterion("room_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameEqualTo(String value) {
            addCriterion("room_type_name =", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotEqualTo(String value) {
            addCriterion("room_type_name <>", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThan(String value) {
            addCriterion("room_type_name >", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_name >=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThan(String value) {
            addCriterion("room_type_name <", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThanOrEqualTo(String value) {
            addCriterion("room_type_name <=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLike(String value) {
            addCriterion("room_type_name like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotLike(String value) {
            addCriterion("room_type_name not like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIn(List<String> values) {
            addCriterion("room_type_name in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotIn(List<String> values) {
            addCriterion("room_type_name not in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameBetween(String value1, String value2) {
            addCriterion("room_type_name between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotBetween(String value1, String value2) {
            addCriterion("room_type_name not between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOffIsNull() {
            addCriterion("off is null");
            return (Criteria) this;
        }

        public Criteria andOffIsNotNull() {
            addCriterion("off is not null");
            return (Criteria) this;
        }

        public Criteria andOffEqualTo(Float value) {
            addCriterion("off =", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotEqualTo(Float value) {
            addCriterion("off <>", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffGreaterThan(Float value) {
            addCriterion("off >", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffGreaterThanOrEqualTo(Float value) {
            addCriterion("off >=", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffLessThan(Float value) {
            addCriterion("off <", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffLessThanOrEqualTo(Float value) {
            addCriterion("off <=", value, "off");
            return (Criteria) this;
        }

        public Criteria andOffIn(List<Float> values) {
            addCriterion("off in", values, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotIn(List<Float> values) {
            addCriterion("off not in", values, "off");
            return (Criteria) this;
        }

        public Criteria andOffBetween(Float value1, Float value2) {
            addCriterion("off between", value1, value2, "off");
            return (Criteria) this;
        }

        public Criteria andOffNotBetween(Float value1, Float value2) {
            addCriterion("off not between", value1, value2, "off");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Float value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Float value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Float value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Float value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Float value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Float> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Float> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Float value1, Float value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Float value1, Float value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNull() {
            addCriterion("room_count is null");
            return (Criteria) this;
        }

        public Criteria andRoomCountIsNotNull() {
            addCriterion("room_count is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCountEqualTo(Integer value) {
            addCriterion("room_count =", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotEqualTo(Integer value) {
            addCriterion("room_count <>", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThan(Integer value) {
            addCriterion("room_count >", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_count >=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThan(Integer value) {
            addCriterion("room_count <", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountLessThanOrEqualTo(Integer value) {
            addCriterion("room_count <=", value, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountIn(List<Integer> values) {
            addCriterion("room_count in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotIn(List<Integer> values) {
            addCriterion("room_count not in", values, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountBetween(Integer value1, Integer value2) {
            addCriterion("room_count between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andRoomCountNotBetween(Integer value1, Integer value2) {
            addCriterion("room_count not between", value1, value2, "roomCount");
            return (Criteria) this;
        }

        public Criteria andOverCountIsNull() {
            addCriterion("over_count is null");
            return (Criteria) this;
        }

        public Criteria andOverCountIsNotNull() {
            addCriterion("over_count is not null");
            return (Criteria) this;
        }

        public Criteria andOverCountEqualTo(Integer value) {
            addCriterion("over_count =", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountNotEqualTo(Integer value) {
            addCriterion("over_count <>", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountGreaterThan(Integer value) {
            addCriterion("over_count >", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_count >=", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountLessThan(Integer value) {
            addCriterion("over_count <", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountLessThanOrEqualTo(Integer value) {
            addCriterion("over_count <=", value, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountIn(List<Integer> values) {
            addCriterion("over_count in", values, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountNotIn(List<Integer> values) {
            addCriterion("over_count not in", values, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountBetween(Integer value1, Integer value2) {
            addCriterion("over_count between", value1, value2, "overCount");
            return (Criteria) this;
        }

        public Criteria andOverCountNotBetween(Integer value1, Integer value2) {
            addCriterion("over_count not between", value1, value2, "overCount");
            return (Criteria) this;
        }

        public Criteria andByDayIsNull() {
            addCriterion("by_day is null");
            return (Criteria) this;
        }

        public Criteria andByDayIsNotNull() {
            addCriterion("by_day is not null");
            return (Criteria) this;
        }

        public Criteria andByDayEqualTo(String value) {
            addCriterion("by_day =", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayNotEqualTo(String value) {
            addCriterion("by_day <>", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayGreaterThan(String value) {
            addCriterion("by_day >", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayGreaterThanOrEqualTo(String value) {
            addCriterion("by_day >=", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayLessThan(String value) {
            addCriterion("by_day <", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayLessThanOrEqualTo(String value) {
            addCriterion("by_day <=", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayLike(String value) {
            addCriterion("by_day like", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayNotLike(String value) {
            addCriterion("by_day not like", value, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayIn(List<String> values) {
            addCriterion("by_day in", values, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayNotIn(List<String> values) {
            addCriterion("by_day not in", values, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayBetween(String value1, String value2) {
            addCriterion("by_day between", value1, value2, "byDay");
            return (Criteria) this;
        }

        public Criteria andByDayNotBetween(String value1, String value2) {
            addCriterion("by_day not between", value1, value2, "byDay");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeIsNull() {
            addCriterion("per_day_fee is null");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeIsNotNull() {
            addCriterion("per_day_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeEqualTo(Float value) {
            addCriterion("per_day_fee =", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeNotEqualTo(Float value) {
            addCriterion("per_day_fee <>", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeGreaterThan(Float value) {
            addCriterion("per_day_fee >", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("per_day_fee >=", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeLessThan(Float value) {
            addCriterion("per_day_fee <", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeLessThanOrEqualTo(Float value) {
            addCriterion("per_day_fee <=", value, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeIn(List<Float> values) {
            addCriterion("per_day_fee in", values, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeNotIn(List<Float> values) {
            addCriterion("per_day_fee not in", values, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeBetween(Float value1, Float value2) {
            addCriterion("per_day_fee between", value1, value2, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andPerDayFeeNotBetween(Float value1, Float value2) {
            addCriterion("per_day_fee not between", value1, value2, "perDayFee");
            return (Criteria) this;
        }

        public Criteria andByScaleIsNull() {
            addCriterion("by_scale is null");
            return (Criteria) this;
        }

        public Criteria andByScaleIsNotNull() {
            addCriterion("by_scale is not null");
            return (Criteria) this;
        }

        public Criteria andByScaleEqualTo(String value) {
            addCriterion("by_scale =", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleNotEqualTo(String value) {
            addCriterion("by_scale <>", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleGreaterThan(String value) {
            addCriterion("by_scale >", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleGreaterThanOrEqualTo(String value) {
            addCriterion("by_scale >=", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleLessThan(String value) {
            addCriterion("by_scale <", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleLessThanOrEqualTo(String value) {
            addCriterion("by_scale <=", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleLike(String value) {
            addCriterion("by_scale like", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleNotLike(String value) {
            addCriterion("by_scale not like", value, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleIn(List<String> values) {
            addCriterion("by_scale in", values, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleNotIn(List<String> values) {
            addCriterion("by_scale not in", values, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleBetween(String value1, String value2) {
            addCriterion("by_scale between", value1, value2, "byScale");
            return (Criteria) this;
        }

        public Criteria andByScaleNotBetween(String value1, String value2) {
            addCriterion("by_scale not between", value1, value2, "byScale");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumIsNull() {
            addCriterion("per_scale_num is null");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumIsNotNull() {
            addCriterion("per_scale_num is not null");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumEqualTo(Float value) {
            addCriterion("per_scale_num =", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumNotEqualTo(Float value) {
            addCriterion("per_scale_num <>", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumGreaterThan(Float value) {
            addCriterion("per_scale_num >", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumGreaterThanOrEqualTo(Float value) {
            addCriterion("per_scale_num >=", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumLessThan(Float value) {
            addCriterion("per_scale_num <", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumLessThanOrEqualTo(Float value) {
            addCriterion("per_scale_num <=", value, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumIn(List<Float> values) {
            addCriterion("per_scale_num in", values, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumNotIn(List<Float> values) {
            addCriterion("per_scale_num not in", values, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumBetween(Float value1, Float value2) {
            addCriterion("per_scale_num between", value1, value2, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andPerScaleNumNotBetween(Float value1, Float value2) {
            addCriterion("per_scale_num not between", value1, value2, "perScaleNum");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountIsNull() {
            addCriterion("reserve_room_count is null");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountIsNotNull() {
            addCriterion("reserve_room_count is not null");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountEqualTo(Integer value) {
            addCriterion("reserve_room_count =", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountNotEqualTo(Integer value) {
            addCriterion("reserve_room_count <>", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountGreaterThan(Integer value) {
            addCriterion("reserve_room_count >", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_room_count >=", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountLessThan(Integer value) {
            addCriterion("reserve_room_count <", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_room_count <=", value, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountIn(List<Integer> values) {
            addCriterion("reserve_room_count in", values, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountNotIn(List<Integer> values) {
            addCriterion("reserve_room_count not in", values, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountBetween(Integer value1, Integer value2) {
            addCriterion("reserve_room_count between", value1, value2, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andReserveRoomCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_room_count not between", value1, value2, "reserveRoomCount");
            return (Criteria) this;
        }

        public Criteria andWeekendIsNull() {
            addCriterion("weekend is null");
            return (Criteria) this;
        }

        public Criteria andWeekendIsNotNull() {
            addCriterion("weekend is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendEqualTo(String value) {
            addCriterion("weekend =", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendNotEqualTo(String value) {
            addCriterion("weekend <>", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendGreaterThan(String value) {
            addCriterion("weekend >", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendGreaterThanOrEqualTo(String value) {
            addCriterion("weekend >=", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendLessThan(String value) {
            addCriterion("weekend <", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendLessThanOrEqualTo(String value) {
            addCriterion("weekend <=", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendLike(String value) {
            addCriterion("weekend like", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendNotLike(String value) {
            addCriterion("weekend not like", value, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendIn(List<String> values) {
            addCriterion("weekend in", values, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendNotIn(List<String> values) {
            addCriterion("weekend not in", values, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendBetween(String value1, String value2) {
            addCriterion("weekend between", value1, value2, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendNotBetween(String value1, String value2) {
            addCriterion("weekend not between", value1, value2, "weekend");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIsNull() {
            addCriterion("weekend_price is null");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIsNotNull() {
            addCriterion("weekend_price is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceEqualTo(Float value) {
            addCriterion("weekend_price =", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotEqualTo(Float value) {
            addCriterion("weekend_price <>", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceGreaterThan(Float value) {
            addCriterion("weekend_price >", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("weekend_price >=", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceLessThan(Float value) {
            addCriterion("weekend_price <", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceLessThanOrEqualTo(Float value) {
            addCriterion("weekend_price <=", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIn(List<Float> values) {
            addCriterion("weekend_price in", values, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotIn(List<Float> values) {
            addCriterion("weekend_price not in", values, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceBetween(Float value1, Float value2) {
            addCriterion("weekend_price between", value1, value2, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotBetween(Float value1, Float value2) {
            addCriterion("weekend_price not between", value1, value2, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}