package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LinkController {
    @RequestMapping("/main")
    public String main() { return "/main/main"; }

    @RequestMapping("/scanusers")
    public String scanusers() { return "show/scanusers"; }

    @RequestMapping("/stuupload")
    public String stuupload() { return "/student/upload"; }

    @RequestMapping("/stuupload2")
    public String stuupload2(){return "/student/uploadpic";}
    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    @RequestMapping("/login")
    public String Login()
    {
        return "login";
    }

}
