package org.lanqiao.dao;

import org.lanqiao.bean.Classes;
import org.lanqiao.bean.Student;

import java.util.List;

/**
 * Created by LiuYuanhuai on 2017/9/4.
 */
public interface IClassDao {
    /**
     * 查询所有的班级信息,包含班级老师的信息
     * @return
     */
    List<Classes> getAllClassInfo();

    /**
     * 根据班级id查询班级学生信息
     * @return
     */
    List<Student> getClassInfoById(int classId);
}
