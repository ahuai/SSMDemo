package org.lanqiao.bean;

import java.util.List;

/**
 * Created by LiuYuanhuai on 2017/9/2.
 */
public class UserList {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "userList=" + userList +
                '}';
    }
}
