package com.liu.beans;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;

@Entity
public class user {

    private String userid;
    private String username;
    private int userrank;
    private String password;
}
