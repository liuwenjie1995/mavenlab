package com.liu.service.Imp;

import com.liu.beans.User;
import com.liu.dao.UserDao;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getuser(int userid, String password) {
        try {
            User user = userDao.findUser(userid,password).get(0);
            return user;
        }catch (IndexOutOfBoundsException e)
        {
            return null;
        }
    }

    @Override
    public void logoutuser(HttpSession httpSession) {
        httpSession.setAttribute("username",null);
        httpSession.setAttribute("userid",null);
        httpSession.setAttribute("rank",null);
    }

    @Override
    public boolean saveuser(String username, String password, int rank) {
       User user  = new User(username,rank,password);
       this.userDao.save(user);
       return true;
    }
}
