package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.dao.UserDao;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	 public List<User> findAll(){
		 List<User> list = userDao.select();
		 return list;
	 }
	
	public boolean register(User user) {
		// TODO Auto-generated method stub
		
		return userDao.insert(user);
	}
}
