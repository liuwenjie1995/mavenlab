package com.liu.controller;

import com.liu.beans.UpDemo;
import com.liu.beans.User;
import com.liu.dao.DemoDao;
import com.liu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import com.liu.beans.Demomsg;

@Controller
public class LinkController {
    @Autowired
    DemoDao demoDao;
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/main")
    public String main() { return "/main/main"; }

    @RequestMapping(value = "/stuupload" )
    public String stuupload() { return "/student/upload"; }

    @RequestMapping(value = "/stuupload2")
    public String stuupload2(){return "/student/uploadpic";}

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String welcome() {
        return "/welcome";
    }

    @RequestMapping(value = "/login")
    public String Login()
    {
        return "/login";
    }

    @RequestMapping(value = "/register")
    public String Register(){return "/register";}

    @RequestMapping(value = "/judge")
    public String Judge(Map<String,Object> map){
        Iterator<UpDemo> it = demoDao.findjudge().iterator();
        ArrayList<Demomsg> demolist= new ArrayList<>();
        while (it.hasNext())
        {
            UpDemo demo = it.next();

//            this.demoid = demoid;
//            this.userid = userid;
//            this.username = username;
//            this.title = title;
//            this.demourl = demourl;
            String username = userDao.getName(demo.getUserid()).get(0).getUsername();
            if (username==null)
            {
                username="匿名";
            }

            Demomsg demomsg = new Demomsg(  String.valueOf(demo.getId()),
                                            String.valueOf(demo.getUserid()),
                                            username ,
                                            String.valueOf(demo.getTitle()),
                                            "www");
            demolist.add(demomsg);
        }

//        request.setAttribute("demolist",demolist);
        map.put("demolist",demolist);
        return  "/teacher/judge";
    }

    @RequestMapping(value = "/scanusers")
    public String scan(Map<String,Object> map){
        Iterator<UpDemo> it = demoDao.findAllpass().iterator();
        ArrayList<Demomsg> demolist= new ArrayList<>();
        while (it.hasNext())
        {

            UpDemo demo = it.next();
            String username = userDao.getName(demo.getUserid()).get(0).getUsername();
            if(username==null)
                username="匿名";
            Demomsg demomsg = new Demomsg(  String.valueOf(demo.getId()),
                    String.valueOf(demo.getUserid()),
                    username ,
                    String.valueOf(demo.getTitle()),
                    "www");
            demolist.add(demomsg);
        }

//        request.setAttribute("demolist",demolist);
        map.put("demolist",demolist);
        return  "/show/scanusers";
    }

}


