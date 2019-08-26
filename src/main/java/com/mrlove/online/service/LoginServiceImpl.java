package com.mrlove.online.service;

import com.mrlove.online.common.domain.Online;
import com.mrlove.online.dao.OnlineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

    @Autowired
    private OnlineMapper onlineMapper;

    @Override
    public List<Online> queryuser(String username) {
        return onlineMapper.queryUser(username);
    }

    @Override
    public List<Online> querypwd(String username, String pwd) {
        return onlineMapper.queryPwd(username,pwd);
    }
}
