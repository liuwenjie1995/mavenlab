package com.liu.service;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public interface userService {
    void logoutuser(HttpSession httpSession);
    boolean getuser(int userid,String password);
    boolean saveuser(String username,String password,int rank);
}
