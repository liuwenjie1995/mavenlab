package com.liu.controller;

import com.liu.service.Imp.userServiceImp;
import com.liu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/login.do")
    public String judge(String userid, String password, HttpSession httpsession)
    {
        System.out.print("this is in use");
        int flag=0;
        try {
            if (userid.equals("liu") && password.equals("123"))
            {
                flag=1;
                //getusername
                String username = "刘文杰";
                httpsession.setAttribute("welcomeuser","欢迎您，"+username);
                httpsession.setAttribute("isTeacher","1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (flag){
            case 1:return "/main/main";
            case 0:return "login/fail";
            default:return "login/fail";
        }
    }

}
