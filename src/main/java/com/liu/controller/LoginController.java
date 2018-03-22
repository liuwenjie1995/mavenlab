package com.liu.controller;

import com.liu.service.userService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@PropertySource("classpath:global.properties")
@Controller
public class LoginController{

    private userService userService;

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession)
    {
        userService.logoutuser(httpSession);
        return "/main/main";
    }

    @RequestMapping("/logincheck")
    @ResponseBody
    public String logincheck()
    {
        /*
        这里选中user并返回是否存在这样一个人
        使用json处理前端的问题
                */
        return "0";
    }

}
