package org.xiaoqiaotq.controller.test;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xiaoqiaotq.domain.User;

/**
 * @author xiaoqiaotq@gmail.com
 * @date    2014年12月27日
 * 
 */
@Controller
@RequestMapping("/upload")
public class TestAjaxFileuploadController {
	@RequestMapping(value="/init")
	public String init(){
		return "test/uploadtest";
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
