package com.dd_driving.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dd_driving.order.entity.DdOrder;

public interface DdOrderMapper extends BaseMapper<DdOrder> {
    DdOrder getOrder();
}
