package org.xiaoqiaotq.controller.th;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月18日
 */
@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping("hello")
	public String hello(){
		return "hello";
	}
}
