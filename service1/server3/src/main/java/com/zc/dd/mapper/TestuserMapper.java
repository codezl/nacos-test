package com.zc.dd.mapper;

import com.zc.dd.entity.Testuser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestuserMapper {
    @Select("select * from testuser where name='zs' ")
    List<Testuser> findOne();
}
