package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
public class LinkController {
    @RequestMapping(value = "/main")
    public String main() { return "/main/main"; }

    @RequestMapping(value = "/scanusers")
    public String scanusers() { return "show/scanusers"; }

    @RequestMapping(value = "/stuupload" )
    public String stuupload() { return "/student/upload"; }

    @RequestMapping(value = "/stuupload2")
    public String stuupload2(){return "/student/uploadpic";}

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/login")
    public String Login()
    {
        return "login";
    }
}
