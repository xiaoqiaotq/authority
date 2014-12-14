package org.xiaoqiaotq.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xiaoqiaotq.domain.Role;
import org.xiaoqiaotq.domain.User;
import org.xiaoqiaotq.service.RoleService;
import org.xiaoqiaotq.service.UserService;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月11日
 */
@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired	
  private UserService userService;
  @Autowired
  private RoleService roleService;
  
  
  @RequestMapping("/home")
  public String home(Map map){
	  List<User> users=userService.findAll();
	  map.put("users", users);
	  return "user/user_list";
  }
  @RequestMapping("/save")
  public String save(User user){
	userService.save(user);
	return "redirect:/user/home";
  }
  @RequestMapping("/show_add")
  public String show_add(User user){
	  return "user/user_add";
  }
  @RequestMapping("/show_modify/{id}")
  public String show_modify(@PathVariable int id,Map map){
	  User user=userService.find(id);
	  map.put("user", user);
	  return "user/user_modify";
  }
  @RequestMapping("/del/{id}")
  public String del(@PathVariable int id){
	  userService.remove(id);
	  return "redirect:/user/home"; 
  }
  @RequestMapping("/showRole/{id}")
  public String showRole(@PathVariable int id,Map map){
	  List<Role> roles=roleService.findAll();
	  map.put("roles", roles);
	  map.put("userId", id);
	  return "user/role_list";
  }
  @RequestMapping("/saveRole/{userId}")
  public String saveRole(@PathVariable int userId,Integer[] check){
	  Set<Role> roles=roleService.find(check);
	  User user=userService.find(userId);
	  user.setRoles(roles);
	  userService.save(user);
	  return "redirect:/user/home";
  }
}
