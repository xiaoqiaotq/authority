package org.xiaoqiaotq.controller.th;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月18日
 */
@Controller
@RequestMapping("/test")
public class HelloController {
	@RequestMapping("hello")
	public String hello(){
		return "hello";
	}
	@RequestMapping("/response")
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public String response(){
		return "hello";
	}
}
