package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by LiuYuanhuai on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IClassDaoTest {

    @Autowired
    IClassDao classDao;
    @Test
    public void getAllClassInfo() throws Exception {
        System.out.println(classDao.getAllClassInfo());
    }
    @Test
    public void getClassInfoById() throws Exception {
        System.out.println(classDao.getClassInfoById(3));
    }

}