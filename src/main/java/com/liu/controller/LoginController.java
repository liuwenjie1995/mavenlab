package com.liu.controller;

import com.liu.model.LoginStatus;
import com.liu.model.NorResponse;
import com.liu.service.Imp.userServiceImp;
import com.liu.service.userService;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@PropertySource("classpath:global.properties")
@Controller
public class LoginController{

    @Autowired
    private userService userService;

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession)
    {
        userService.logoutuser(httpSession);
        return "/main/main";
    }

    @ResponseBody
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public NorResponse<LoginStatus> judge(@RequestParam Map<String,Object> param, HttpSession httpSession, HttpServletRequest request)
    {

        String userid =(String)param.get("userid");
        String password= (String)param.get("password");

        if (userService.getuser(userid,password))
        {
            //返回json,登录成功
            return new NorResponse<>(1, new LoginStatus(1));
        }
        else
        {
            return new NorResponse<>(1,new LoginStatus(0));
        }

    }

}
