package org.xiaoqiaotq.controller.test.model;

import java.util.Set;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2015年2月26日  
 */
public class Classes {
	private Integer id;
	private String  name;
	private Set<Student> students;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
