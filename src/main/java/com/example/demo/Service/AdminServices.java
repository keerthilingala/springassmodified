package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.Role;
import com.example.demo.Model.SupportAnalyst;


public interface AdminServices {
	
	public int CreateAd(Admin admin);
	public int Addrole(Role rol);
	public int login(AdminLogin adminlogin);
	public List<SupportAnalyst> listsupportanalyst();
	public List<Role> getAllAdminIDs();
	public Admin getAdminByContactNumber(String contactNumber);
	public Admin getAdmin(String username);
	public boolean updateRole(Role role);
	public Object findAll();
	//public String delete(String adminId);
	public Role getRolebyadminId(String adminId);
	public String delete(String adminId);
	public String deleteRole(String adminId);
}
