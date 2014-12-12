package org.xiaoqiaotq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月12日
 */
@Entity
public class Role {
  @Id
  @GeneratedValue
  private Integer id;
  public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
private String roleName;
  private String desc;
}
