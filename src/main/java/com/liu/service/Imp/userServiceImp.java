package com.liu.service.Imp;

import com.liu.beans.User;
import com.liu.dao.UserDao;
import com.liu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Service("userService")
public class userServiceImp implements userService {
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
        httpSession.setAttribute("welcomeuser",null);
        httpSession.setAttribute("isTeacher",null);
    }

    @Override
    public boolean saveuser(String username, String password, int rank) {
       User user  = new User(username,rank,password);
       this.userDao.save(user);
       return true;
    }
}
