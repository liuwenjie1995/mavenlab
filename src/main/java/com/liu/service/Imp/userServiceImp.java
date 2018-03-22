package com.liu.service.Imp;

import com.liu.beans.user;
import com.liu.service.userService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
@Service("userService")
public class userServiceImp implements userService {
    @Override
    public boolean getuser(String username, String password) {
        /*
        * 使用dao生成获取username的的方法
        * 然后返回一个正确错误判断
        * */
        return true;
    }

    @Override
    public void logoutuser(HttpSession httpSession) {
        httpSession.setAttribute("welcomeuser",null);
        httpSession.setAttribute("isTeacher",null);
    }


}
