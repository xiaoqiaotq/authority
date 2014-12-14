package org.xiaoqiaotq.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_resource")
public class Resource extends BaseEntity{
	private String resourceName;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
}
