package com.liu.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "updemo")
public class UpDemo {

    public UpDemo() {
    }

    public UpDemo(int userid, int checkerid, boolean ischeck, String filepath) {
        this.userid = userid;
        this.checkerid = checkerid;
        this.ischeck = ischeck;
        this.filepath = filepath;
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
    private boolean ischeck;
    @Column
    private String filepath;

    @Override
    public String toString() {
        return "UpDemo{" +
                "id=" + id +
                ", userid=" + userid +
                ", checkerid=" + checkerid +
                ", ischeck=" + ischeck +
                ", filepath='" + filepath + '\'' +
                '}';
    }

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
}
