package com.liu.beans;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "updemo")
public class UpDemo {
    @Id
    @Column(nullable = false)
    private int id;
    @ManyToOne
    @Column(nullable = false)
    private int userid;
    @ManyToOne
    @Column
    private int checkerid;
    @Column
    private boolean ischeck;
    @Column
    private List<String> imgs;
    @Column
    private String filepath;
}
