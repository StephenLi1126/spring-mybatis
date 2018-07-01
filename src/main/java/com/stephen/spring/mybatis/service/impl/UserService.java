package com.stephen.spring.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stephen.spring.mybatis.dao.IUserDao;
import com.stephen.spring.mybatis.model.User;
import com.stephen.spring.mybatis.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUser(int id) {
		return this.userDao.findUser(id);
	}

}
