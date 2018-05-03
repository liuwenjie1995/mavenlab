package com.liu.controller;

import com.liu.beans.UpDemo;
import com.liu.dao.DemoDao;
import com.liu.model.NorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.Map;


@Controller
public class JudgeController {
    @Autowired
    DemoDao demoDao;

    @ResponseBody
    @RequestMapping(value = "/passdemo.do")
    public NorResponse<String> passdemo(@RequestParam Map<String,Object> params)
    {
        String demoid = (String) params.get("demoid");
        System.out.println("demoid");
        System.out.println("demoid");
        System.out.println("demoid");
        System.out.println("demoid");
        System.out.println("demoid");
        System.out.println(demoid);
        Iterator<UpDemo> iterator= demoDao.finddemo(Integer.parseInt(demoid)).iterator();
        UpDemo upDemo = iterator.next();
        upDemo.setIscheck(true);
        upDemo.setIspass(true);
        demoDao.save(upDemo);

        return new NorResponse<>(1,"pass","1");

    }

    @ResponseBody
    @RequestMapping(value = "/nopassdemo.do")
    public NorResponse<String> nopassdemo(@RequestParam Map<String,Object> params) {
        String demoid = (String) params.get("demoid");
        Iterator<UpDemo> iterator= demoDao.finddemo(Integer.parseInt(demoid)).iterator();
        UpDemo upDemo = iterator.next();
        upDemo.setIscheck(true);
        upDemo.setIspass(false);
        demoDao.save(upDemo);

        return new NorResponse<>(1,"pass","1");
    }


}
