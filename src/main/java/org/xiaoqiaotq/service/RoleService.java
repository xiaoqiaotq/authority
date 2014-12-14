package org.xiaoqiaotq.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xiaoqiaotq.dao.RoleDao;
import org.xiaoqiaotq.dao.UserDao;
import org.xiaoqiaotq.domain.Role;
import org.xiaoqiaotq.domain.User;

@Service
@Transactional
public class RoleService {
	@Autowired
	private RoleDao roleDao;
	public void save(Role role){
		roleDao.save(role);
	}
	public boolean isExist(Integer openid){
		return roleDao.find(openid)!=null;
	}
	public List<Role> findAll(){
		return roleDao.findAll();
	}
	public Role find(Integer id){
		return roleDao.find(id);
	}
	public Set<Role> find(Integer... ids) {
		Role[] roles=roleDao.find(ids);
		return new HashSet<Role>(Arrays.asList(roles));
	}
	public void remove(Integer id){
		 roleDao.removeById(id);
	}
	
}