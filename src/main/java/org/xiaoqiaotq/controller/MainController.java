/**
 * 
 */
package org.xiaoqiaotq.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xiaoqiaotq.domain.User;
import org.xiaoqiaotq.domain.User.Habit;

/**
 * @author xiaoqiaotq@gmail.com	
	
 * 
 */
@Controller
@RequestMapping("/test")
public class MainController {
	@RequestMapping(value="/{username}/{age}")
	public String test(HttpServletRequest request, Map map,ModelMap map2,@Valid User u){
		System.err.println(request.getRequestURI());
		System.err.println("map: "+map);
		System.err.println("map2: "+map2); 	
		System.err.println(map==map2);
//		Enumeration<String> enumeration=request.getAttributeNames();
//		while (enumeration.hasMoreElements()) {
//			String string = (String) enumeration.nextElement();
//			System.err.println(string+":"+request.getAttribute(string));
//		}
	
		System.err.println("-------------------------------");
		return "redirect:/test/main";
	}
	@RequestMapping(value="/test2")
	@ResponseBody
	public User test2(@RequestBody(required=false) User u){
		System.err.println(u);
		User user=new User();
		user.setAge(3);
		Date date=new Date();
		System.err.println(date.getTime());
		user.setDate(date);
		return user;
	}
	
//	@ModelAttribute("habits")
//	private List<String> getHabits(){
//		return Arrays.asList("篮球","跑步","乒乓");
//	}
	@ModelAttribute("habits")
	private Habit[] getHabits(){
		return Habit.values();
	}
	
	@RequestMapping(value="/main")
	public String returnUser(Map map,ModelMap map2,Model map3,String d,AA aa){
		System.err.println(map.getClass());
		System.err.println(map2);
		System.err.println(map3);
		System.err.println(map==map2);
		return "main";
	}
	@RequestMapping(value="/getPara/{a}")
	public String getPara( @PathVariable String a,Map map){
		System.err.println(map);
		return "main";
	}
	@RequestMapping(value="/model/{username}")
	public String getModel(  User u,Map map,@PathVariable String username){
		System.err.println(map);
		return "main";
	}
//	@ModelAttribute("a")
//	String f(){
//		return "apple";
//	}
	
}
class AA{
	int id;
}
