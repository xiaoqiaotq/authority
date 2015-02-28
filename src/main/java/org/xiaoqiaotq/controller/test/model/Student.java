package org.xiaoqiaotq.controller.test.model;

import java.util.Date;
import java.util.Set;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2015年2月26日  
 */
public class Student {
	public Student(Integer id, String name, int age, int score, State state,Date startDate,Date endDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.state = state;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String  name;
	private  int age;
	private   int  score;
	private State  state;
	private Date startDate;
	private Date endDate;
	private Classes classes;
	public static enum State{
		Present,Absent;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
