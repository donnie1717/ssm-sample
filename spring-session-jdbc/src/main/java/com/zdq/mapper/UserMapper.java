package com.zdq.mapper;

import com.zdq.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserEntity findById(@Param("id")int id);
}
