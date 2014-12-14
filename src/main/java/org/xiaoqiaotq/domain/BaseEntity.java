package org.xiaoqiaotq.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue
	private Integer id;
	
	public boolean isNew(){
		return id==null;
	}

	public Integer getId() {
		return id;
	}
}
