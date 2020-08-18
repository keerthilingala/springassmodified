package com.example.demo.Model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dash")
public class Dashboard {
	@Id
	@Generated("assigned")
	@Column
	private String adminId;
	@Column
	private String reportname;
	@Column
	private String powerbiunits;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getReportname() {
		return reportname;
	}
	public void setReportname(String reportname) {
		this.reportname = reportname;
	}
	public String getPowerbiunits() {
		return powerbiunits;
	}
	public void setPowerbiunits(String powerbiunits) {
		this.powerbiunits = powerbiunits;
	}
	@Override
	public String toString() {
		return "Dashboard [adminId=" + adminId + ", reportname=" + reportname + ", powerbiunits=" + powerbiunits + "]";
	}
	

}