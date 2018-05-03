package com.liu.beans;

public class Demomsg{

    //            <th>项目id</th>
//            <th>用户id</th>
//            <th>用户名</th>
//            <th>项目名称</th>
//            <th>项目详情</th>
    private String demoid;
    private String userid;
    private String username;
    private String title;
    private String demourl;

    private String imgurl;

    public Demomsg() {
    }

    public Demomsg(String demoid, String userid, String username, String title, String demourl, String imgurl) {
        this.demoid = demoid;
        this.userid = userid;
        this.username = username;
        this.title = title;
        this.demourl = demourl;
        this.imgurl = imgurl;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDemoid() {
        return demoid;
    }

    public void setDemoid(String demoid) {
        this.demoid = demoid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDemourl() {
        return demourl;
    }

    public void setDemourl(String demourl) {
        this.demourl = demourl;
    }
}