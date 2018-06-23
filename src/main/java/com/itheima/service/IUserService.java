package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * Copyright (C), 2018, 传智播客教育科技股份有限公司
 * FileName: IUserService
 * Author:   黑马程序员
 * Description:
 */

public interface IUserService {

    List<User> findAll();

   User findById(Integer id);

    void update(User user);
}
