package org.lanqiao.service.impl;

import org.apache.log4j.Logger;
import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuYuanhuai on 2017/8/30.
 */
//告诉spring这是一个service,同时把这个类注册到spring
@Service
public class UserServiceImpl implements IUserService {
//创建logger对象
    Logger logger=Logger.getLogger(UserServiceImpl.class);
    @Autowired   //让spring注入一个dao Autowired会根据类型去匹配相应的对象
    private IUserDao userDao;

    public List<User> getAllUser() {
        logger.info("进入了getAllUser()方法");
        return userDao.getAllUser();
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUserById(User user) {
        return userDao.updateUserById(user);
    }

    public int delUserById(int id) {
        return userDao.delUserById(id);
    }

    public List<User> getUserByCondition(User user) {
        return userDao.getUserByCondition(user);
    }

    public List<User> findUserByCondition(User user) {
        return userDao.findUserByCondition(user);
    }


}
