package com.example.demo.Service;

import java.util.List;
import com.example.demo.Model.Role;


public interface AdminServices {

	public void create(Role role) ;
	public void update(Role role) ;
	public Role edit(String adminId) ;
	public void delete(String adminId) ;
	public List<Role> getAll() ;
	public Role find(String admind);
}