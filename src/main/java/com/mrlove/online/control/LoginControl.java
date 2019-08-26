package com.mrlove.online.control;

import com.mrlove.online.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/login")
public class LoginControl {
    //控制层注入 服务层
    @Autowired
    private LoginService loginService;
    @RequestMapping("test")
    @ResponseBody
    private String login(String username,String pwd){
        if (username == "") {
         return "用户名为空";
        } else if (username !="" && pwd =="") {
            return "密码为空";
        } else if (loginService.queryuser(username).size()!=0) {
            if (loginService.querypwd(username,pwd).size()!=0) {

                return  loginService.querypwd(username,pwd).get(0).getName()+"登录成功";
            } else {
                return "密码错误";
            }
        } else {
                return "用户名错误";
        }
    }

    @RequestMapping("haha")
    @ResponseBody
    private String haha(){
        return "hehe";
    }
}
