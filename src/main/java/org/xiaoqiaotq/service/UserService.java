package org.xiaoqiaotq.service;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xiaoqiaotq.dao.UserDao;
import org.xiaoqiaotq.domain.User;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;
	public void save(User user){
		userDao.save(user);
	}
	public boolean isExist(Integer openid){
		return userDao.find(openid)!=null;
	}
	public List<User> findAll(){
		return userDao.findAll();
	}
	public User find(Integer id){
		return userDao.find(id);
	}
	public void remove(Integer id){
		 userDao.removeById(id);
	}
}