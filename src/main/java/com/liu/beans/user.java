package com.liu.beans;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "user.withNameAndPasswordNameQuery",
            query ="select p from user p where p.name=?1 and p.password=?2")
public class user {
    @Id
    @GeneratedValue
    private String userid;
    private String username;
    private int userrank;
    private String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public user(String username, int userrank, String password) {
        this.username = username;
        this.userrank = userrank;
        this.password = password;
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

    public int getUserrank() {
        return userrank;
    }

    public void setUserrank(int userrank) {
        this.userrank = userrank;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
