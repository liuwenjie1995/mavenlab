package com.liu.controller;

import com.liu.model.LoginStatus;
import com.liu.model.NorResponse;
import com.liu.model.RegiserStatus;
import com.liu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /*
    * xxx 登录验证
    * */
    @ResponseBody
    @RequestMapping(value = "/login.do")
    public NorResponse<LoginStatus> judge(@RequestParam Map<String,Object> param)
    {

        String userid =(String)param.get("userid");
        String password= (String)param.get("password");


        if (userService.getuser(Integer.parseInt(userid),password))
        {
            //返回json,登录成功
            return new NorResponse<>(1, new LoginStatus(1));
        }
        else
        {
            return new NorResponse<>(1,new LoginStatus(0));
        }


    }

    @ResponseBody
    @RequestMapping("/register.do")
    public NorResponse<RegiserStatus> register(@RequestParam Map<String,Object> params,HttpSession session)
    {   int rank = 1;


        String username = (String)params.get("username");
        String password = (String)params.get("password");
        if(params.get("rank")!=null)
        {
            rank = Integer.parseInt((String) params.get("rank"));
        }
        if(userService.saveuser(username,password,rank))
        {
            session.setAttribute("username",username);
            session.setAttribute("rank",rank);
            return new NorResponse<>(1,new RegiserStatus(1));
        }
        else
        {
            return new NorResponse<>(1,new RegiserStatus(0));
        }
    }

}
