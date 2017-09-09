package org.lanqiao.dao;

import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by LiuYuanhuai on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IUserDaoTest {
    @Autowired
    IUserDao userDao;

    @Test
    public void updateUserByCond() throws Exception {
        User user = new User();
        user.setId(1);
        user.setUsername("uname");
        user.setPassword("147258");
        userDao.updateUserByCond(user);
    }

    @Test
    public void getUserIn() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(10);
        List<User> userList = userDao.getUserIn(list);
        System.out.println(userList);
    }

}