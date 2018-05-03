package com.liu.controller;

import com.liu.beans.User;
import com.liu.model.LoginStatus;
import com.liu.model.NorResponse;
import com.liu.model.RegiserStatus;
import com.liu.service.UserService;
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
    private UserService UserService;

    @RequestMapping("/logout.do")
    public String logout(HttpSession httpSession)
    {
        UserService.logoutuser(httpSession);
        return "/main/main";
    }

    /*
    * xxx 登录验证
    * */
    @ResponseBody
    @RequestMapping(value = "/login.do")
    public NorResponse<LoginStatus> judge(@RequestParam Map<String,Object> param,HttpSession session)
    {

        String userid =(String)param.get("userid");
        String password= (String)param.get("password");
        User user = UserService.getuser(Integer.parseInt(userid),password);

        if (user!=null)
        {
            session.setAttribute("username",user.getUsername());
            session.setAttribute("userid",user.getUserid());
            session.setAttribute("rank",user.getRank());
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
    {
        int rank = 1;

        String username = (String)params.get("username");
        String password = (String)params.get("password");
        System.out.print("name is : "+username);
        if(params.get("rank")!=null)
        {
            rank = Integer.parseInt((String) params.get("rank"));
        }
        if(UserService.saveuser(username,password,rank))
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
