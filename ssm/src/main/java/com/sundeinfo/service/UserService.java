package com.sundeinfo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundeinfo.dao.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	UserService(){
	  System.out.println("สตภýปฏ");	
	}
	
	public void doSomething() {
		Map<String, Object> Object_ = this.userDao.queryUser(1);
		System.out.println(Object_);
	}
	
}
