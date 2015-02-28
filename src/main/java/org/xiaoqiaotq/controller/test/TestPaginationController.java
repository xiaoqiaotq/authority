package org.xiaoqiaotq.controller.test;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xiaoqiaotq.domain.User;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2015年1月6日
 */
@Controller
@RequestMapping("/pagination")
public class TestPaginationController {
	@RequestMapping(value="/init")
	public String init(){
		return "test/pagination";
	}
	@RequestMapping(value="/test",produces="application/json")
	@ResponseBody
	public User test(){
		User u=new User();
		u.setAge(11);
		u.setDate(new Date());
		return u;
	}
}
