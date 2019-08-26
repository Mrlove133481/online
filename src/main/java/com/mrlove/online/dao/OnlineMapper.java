package com.mrlove.online.dao;

import com.mrlove.online.common.domain.Online;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OnlineMapper {
    int insert(Online record);

    int insertSelective(Online record);

    List<Online> queryUser(@Param("username") String username);

    List<Online> queryPwd(@Param("username") String username,@Param("pwd") String pwd);
}