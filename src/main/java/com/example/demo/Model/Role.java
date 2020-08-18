package com.example.demo.Model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Role {
	@Id
	@Generated("assigned")
	@Column
	private String adminId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String rolename; 
	@Column
	private String powerbiunits; 
	@Column
	private String isadmin; 
	@Column
	private String role;
	@Column
	private String password;
	@Column
	private String Conformpassword;
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getPowerbiunits() {
		return powerbiunits;
	}
	public void setPowerbiunits(String powerbiunits) {
		this.powerbiunits = powerbiunits;
	}
	public String getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformpassword() {
		return Conformpassword;
	}
	public void setConformpassword(String conformpassword) {
		Conformpassword = conformpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", rolename="
				+ rolename + ", powerbiunits=" + powerbiunits + ", isadmin=" + isadmin + ", role=" + role
				+ ", password=" + password + ", Conformpassword=" + Conformpassword + "]";
	}
	
	
	
}