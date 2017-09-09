package org.lanqiao.controller;

import org.lanqiao.bean.RtnObj;
import org.lanqiao.bean.User;
import org.lanqiao.bean.UserList;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LiuYuanhuai on 2017/9/1.
 */
//@WebServlet(value = "/UserServlet")//Servlet的路径
@Controller    //告诉spring,这个类是一个controller
@RequestMapping("/user")  //请求的地址
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/all.do")
    @ResponseBody
    public List<User> getAllUser() {
        System.out.println("进入UserServlet");
        List<User> userList = userService.getAllUser();
//        ModelAndView modelAndView = new ModelAndView("show");
//        modelAndView.addObject("userList", userList);
//        return modelAndView;
        return userList;
    }

    @RequestMapping("/user.do")
    @ResponseBody
    public User getUserById(int id) {
        System.out.println("进入UserServlet");
        User user = userService.getUserById(id);
//        ModelAndView modelAndView = new ModelAndView("show");
//        modelAndView.addObject("userList", userList);
//        return modelAndView;
        return user;
    }

//    @RequestMapping("/reg.do")
//    @ResponseBody  该注解指的是将内容或对象作为Http相应正文返回
//    public String addUser(User user) {
//        System.out.println(user);
//        int i = userService.addUser(user);
//        System.out.println(i);
//        return "show";
//        return "forward:/user/all.do";
//    }

    //根据条件查询
    @RequestMapping("/condition.do")
    @ResponseBody
    public ModelAndView getUserByCondition(User user) {
        System.out.println("进入Condition:" + user);
        List<User> userList = userService.getUserByCondition(user);
        System.out.println(userList);
        Map map = new HashMap();
        map.put("userList", userList);
        return new ModelAndView("show", map);
    }

    //根据条件查询
    @RequestMapping("/cond.do")
    public ModelAndView findUserByCondition(User user) {
        List<User> userList = userService.findUserByCondition(user);
        System.out.println(userList);
        Map map = new HashMap();
        map.put("userList", userList);
        return new ModelAndView("show", map);
    }


    //        自定义混合对象
    @RequestMapping("/myFixObj.do")
    @ResponseBody
    public String myFixObj(RtnObj rtnObj) {
        return rtnObj.toString();
    }

    @RequestMapping("/userList.do")
    @ResponseBody
    public String myList(UserList userList) {
        return userList.toString();
    }


    //以REST方式根据id查询用户信息
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    //以REST方式根据id删除用户信息
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public int delUserById(@PathVariable Integer id) {
        return userService.delUserById(id);
    }

    //以REST方式更新用户信息
    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseBody
    public int updateUserById(@RequestBody User user) {
        return userService.updateUserById(user);
    }

    //以REST方式添加用户信息
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}