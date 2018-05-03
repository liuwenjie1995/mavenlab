package com.liu.dao;

import com.liu.beans.UpDemo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DemoDao extends CrudRepository<UpDemo,Integer> {

    @Query("select  o from UpDemo o where o.id=?1")
    List<UpDemo> finddemo(int demoid);

    @Query("select  o from UpDemo o where o.ischeck=0")
    List<UpDemo> findjudge();


    @Query("select  o from UpDemo o where o.ischeck=1 and o.ispass=1")
    List<UpDemo> findAllpass();
}
