package org.xiaoqiaotq.controller.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xiaoqiaotq.model.Classes;
import org.xiaoqiaotq.model.Student;
import org.xiaoqiaotq.model.Student.State;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2015年2月28日  
 */
@RequestMapping("/excel")
@Controller
public class ExcelExportController {
	
	private static String templateFileName = "D:/template/班级-学生一览.xls";

	@RequestMapping("/download")
	public void download(HttpServletResponse resp){
		Classes classes=new Classes();
		classes.setId(1);
		classes.setName("中二一班22");
		Student student1=new Student(1, "张三", 1, 98,State.Absent,new Date(),new Date());
		Student student2=new Student(2, "张dfs", 3, 8,State.Absent,new Date(),new Date());
		Student student3=new Student(2, "li三", 5, 5,State.Absent,new Date(),new Date());
		Student student4=new Student(2, "张df三", 2, 16,State.Absent,new Date(),new Date());
		Student student5=new Student(5, "张aa三", 4, 100,State.Absent,new Date(),new Date());
		Student student6=new Student(6, "eee三", 2, 44,State.Present,new Date(),new Date());
		Student student7=new Student(7, "eerae三", 45, 44,State.Present,new Date(),new Date());
		Student student8=new Student(7, "eeffg", 2, 44,State.Present,new Date(),new Date());
		Student student9=new Student(9, "55w三", 33, 44,State.Present,new Date(),new Date());
//		Student student10=new Student(9, "55w三", 2, 44,State.Present,new Date(),new Date());
		List list=Arrays.asList(new Student[]{student1,student2,student3,student4,student5,student6,student7,student8,student9,});
		classes.setStudents(new LinkedHashSet<Student>(list));
		Map map=new HashMap();
		map.put("classes", classes);
		//导出
	    XLSTransformer transformer = new XLSTransformer();
	    transformer.groupCollection("classes.students");
	    transformer.registerRowProcessor(new MyRowProcessor("classes.students",list.size()));
	    try {
			Workbook workbook=transformer.transformXLS(new BufferedInputStream(new FileInputStream(templateFileName)), map);
	        resp.setContentType("application/octet-stream; charset=utf-8");
	        resp.setHeader("Content-Disposition", "attachment; filename="+URLEncoder.encode("请假表.xls","utf-8"));
	        workbook.write(resp.getOutputStream());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
