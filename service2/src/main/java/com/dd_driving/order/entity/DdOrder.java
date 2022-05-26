package com.dd_driving.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName(autoResultMap = true, value = "dd_order",schema = "dd_database")
public class DdOrder {

//    private Integer id;
//    private String userName;
//    private String driverName;
//    private String orderNo;
//    private BigDecimal payPrice;
//    private BigDecimal realPrice;
//    private Date createTime;
//    private Date endTime;
//    private BigDecimal discount;
//    private String startAddress;
//    private String endAddress;
//    private Integer orderState;
//    private String aliNo;
//    private Integer userId;
//    private Integer driverId;

    private Integer id;
    private String userName;
    private String driverName;
    private String orderNo; //
    private BigDecimal payPrice;
    private BigDecimal realPrice;
    private Date createTime;
    private Date endTime;
    private BigDecimal discount;
    private String startAddress;
    private String endAddress;
    private Integer orderState;
    private String aliNo;
    private Integer userId;
}
