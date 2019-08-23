package com.mrlove.online.dao;

import com.mrlove.online.common.domain.Online;

public interface OnlineMapper {
    int insert(Online record);

    int insertSelective(Online record);
}