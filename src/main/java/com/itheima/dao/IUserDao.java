package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Copyright (C), 2018, 传智播客教育科技股份有限公司
 * FileName: IUserDao
 * Author:   黑马程序员
 * Description:
 */

public interface IUserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findById(Integer id);

    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void update(User user);
}
