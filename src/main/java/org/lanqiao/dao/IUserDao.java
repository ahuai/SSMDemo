package org.lanqiao.dao;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by LiuYuanhuai on 2017/8/30.
 */
public interface IUserDao {
    /**
     * 查询所有用户
     *
     * @return 用户集合
     */
    List<User> getAllUser();

    /**
     * 添加用户
     *
     * @return 添加的条数
     */
    int addUser(User user);

    /**
     * 根据id查询用户
     *
     * @return 某个用户信息
     */
    User getUserById(int id);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int updateUserById(User user);

    /**
     * 根据id删除用户信息
     *
     * @param id
     * @return
     */
    int delUserById(int id);

    /**
     * 根据条件查询用户
     *
     * @param user
     * @return
     */
    List<User> getUserByCondition(User user);

    /**
     * 根据条件查询用户
     *
     * @param user
     * @return
     */
    List<User> findUserByCondition(User user);

    /**
     * 根据条件修改用户信息
     *
     * @param user
     * @return
     */
    int updateUserByCond(User user);

    /**
     * 根据条件查询多个用户信息
     *
     * @param list
     * @return
     */
    List<User> getUserIn(List<Integer> list);

}
