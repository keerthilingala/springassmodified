package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Admin;
import com.example.demo.Model.Role;

public interface Admindao {
	
	public void create(Role role) ;
	public void update(Role role) ;
	public Role edit(String adminId) ;
	public void delete(String adminId) ;
	public List<Role> getAll() ;
	public Role find(String admind);
}
