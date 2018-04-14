package com.liu.beans;

import javax.persistence.*;

@Entity
@Table()
public class Images {


    public Images() {

    }

    public Images(int demoid, String imagepath) {
        this.demoid = demoid;
        this.imagepath = imagepath;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id=" + id +
                ", demoid=" + demoid +
                ", imagepath='" + imagepath + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false, name = "picture_id")
    private int id;
    @Column(nullable = false)
    private int demoid;
    @Column()
    private String imagepath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDemoid() {
        return demoid;
    }

    public void setDemoid(int demoid) {
        this.demoid = demoid;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
