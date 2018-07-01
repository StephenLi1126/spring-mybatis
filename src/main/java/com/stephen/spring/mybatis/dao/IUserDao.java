package com.stephen.spring.mybatis.dao;

import com.stephen.spring.mybatis.model.User;

public interface IUserDao {

	User findUser(int id);
}
