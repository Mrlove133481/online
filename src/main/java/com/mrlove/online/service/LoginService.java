package com.mrlove.online.service;

import com.mrlove.online.common.domain.Online;

import java.util.List;

public interface LoginService {
    List<Online> queryuser(String username);

    List<Online> querypwd(String username, String pwd);
}
