package com.liu.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "updemo")
public class UpDemo {

    public UpDemo() {
    }

    public UpDemo(int userid, int checkerid, String title, String subtitle, String instruction, String filepath, String img1, String img2, String img3, String img4) {
        this.userid = userid;
        this.checkerid = checkerid;
        this.title = title;
        this.subtitle = subtitle;
        this.instruction = instruction;
        this.filepath = filepath;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
    }

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int userid;
    @Column
    private int checkerid;
    @Column
    private String  title;
    @Column
    private String subtitle;
    @Column
    private String instruction;
    @Column
    private boolean ischeck;
    @Column
    private boolean ispass;
    @Column
    private String filepath;
    @Column
    private String img1;
    @Column
    private String img2;
    @Column
    private String img3;
    @Column
    private String img4;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getCheckerid() {
        return checkerid;
    }

    public void setCheckerid(int checkerid) {
        this.checkerid = checkerid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public boolean isIscheck() {
        return ischeck;
    }

    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public boolean isIspass() {
        return ispass;
    }

    public void setIspass(boolean ispass) {
        this.ispass = ispass;
    }
}
