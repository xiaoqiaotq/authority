package org.xiaoqiaotq.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_role")
public class Role extends BaseEntity implements Checkable {
   private String roleName;
   private String roleDesc;
   @ManyToMany(mappedBy="roles")
   private Set<User> users;
   
   private boolean checked;
   
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	@Override
	public boolean isChecked() {
		return this.checked;
	}
	@Override
	public void setChecked(boolean checked) {
		this.checked=checked;
	}
   
}
