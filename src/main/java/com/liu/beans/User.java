package com.liu.beans;


import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User implements Serializable{

    public User(){}

    public User(String username, int rank, String password) {
        super();
        this.username = username;
        this.rank = rank;
        this.password = password;
    }
    @Id
    @Column(name = "userid",nullable = false)
    @GeneratedValue
    private int userid;
    @Column
    private String username;
    @Column
    private int rank;
    @Column
    private String password;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", rank=" + rank +
                ", password='" + password + '\'' +
                '}';
    }
}
