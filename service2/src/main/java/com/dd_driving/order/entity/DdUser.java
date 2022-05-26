package com.dd_driving.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class DdUser {

    private Integer id;
    private String userNo;  //用户身份标识
    private String name;
    private int sex;  //0为男，1为女
    private int age;
    private int rejectTimes; //拒绝接单次数
    @JsonFormat(timezone = "GMT+8",pattern = "YY-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "YY-MM-dd HH:mm:ss")
//    private Date startTime;
    private String phone;
    private String address;
}
