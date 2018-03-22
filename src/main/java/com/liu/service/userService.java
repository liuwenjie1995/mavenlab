package com.liu.service;

import com.liu.beans.user;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public interface userService {
    public void logoutuser(HttpSession httpSession);
    public boolean getuser(String username,String password);
}
