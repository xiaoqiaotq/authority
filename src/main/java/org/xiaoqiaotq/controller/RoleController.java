package org.xiaoqiaotq.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xiaoqiaotq.domain.Role;
import org.xiaoqiaotq.service.RoleService;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月11日
 */
@Controller
@RequestMapping("/role")
public class RoleController {
  @Autowired	
  private RoleService roleService;
  
  @RequestMapping("/home")
  public String home(Map map){
	  List<Role> roles=roleService.findAll();
	  map.put("roles", roles);
	  return "role/role_list";
  }
  @RequestMapping("/save")
  public String save(Role role){
	roleService.save(role);
	return "redirect:/role/home";
  }
  @RequestMapping("/show_add")
  public String show_add(Role role){
	  return "role/role_add";
  }
  @RequestMapping("/show_modify/{id}")
  public String show_modify(@PathVariable int id,Map map){
	  Role role=roleService.find(id);
	  map.put("role", role);
	  return "role/role_modify";
  }
  @RequestMapping("/del/{id}")
  public String del(@PathVariable int id){
	  roleService.remove(id);
	  return "redirect:/role/home"; 
  }
}
