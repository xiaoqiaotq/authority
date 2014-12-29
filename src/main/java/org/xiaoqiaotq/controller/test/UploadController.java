package org.xiaoqiaotq.controller.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.xiaoqiaotq.domain.test.UploadResponse;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月26日
 */
@Controller
@RequestMapping("/upload")
public class UploadController {
	@RequestMapping()
	public String init() throws IOException{
		return "test/upload_test";
	}
	@RequestMapping(value="/photo",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public UploadResponse<String> photo(MultipartFile image,String name,MultipartFile apple,HttpServletRequest req) throws IOException{
		if(!image.isEmpty()){
//			System.err.println(apple.getName());
			String context=req.getServletContext().getRealPath("/");
			Calendar calendar=Calendar.getInstance();
			int year=calendar.get(Calendar.YEAR);
			int month=calendar.get(Calendar.MONTH)+1;
			int date=calendar.get(Calendar.DATE);
			//保存路径
			String dir2=year+File.separator+month+date;
			File dir=new File(context,dir2);
			if(!dir.exists()){
				dir.mkdirs();
			}
			byte[] bytes=image.getBytes();
			System.err.println(dir+"/"+image.getOriginalFilename());
			image.transferTo(new File(dir,image.getOriginalFilename()));
			UploadResponse<String> resp=new UploadResponse<String>(200, "success");
			resp.setData(image.getOriginalFilename());
			return resp;
		}
		return new UploadResponse<String>(500,"error");
	}
}
