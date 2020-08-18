package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Admin;
import com.example.demo.Model.Role;


@Repository
public interface Rolesdao extends CrudRepository<Role, String> {
	public Role findByAdminId(String AdminId);
	
	public List<Role> findAll();

	public static void deleteByAdminId(String adminId) {
		// TODO Auto-generated method stub
		
	}

	
}
