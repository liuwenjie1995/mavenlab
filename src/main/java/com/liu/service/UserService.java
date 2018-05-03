package com.liu.service;

import com.liu.beans.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public interface UserService {
    void logoutuser(HttpSession httpSession);
    User getuser(int userid, String password);
    boolean saveuser(String username,String password,int rank);
}
