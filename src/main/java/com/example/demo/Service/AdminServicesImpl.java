 package com.example.demo.Service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import com.example.demo.Dao.Admindao;
import com.example.demo.Model.Role;

@Service("adminservices")
//@Transactional(propagation= Propagation.SUPPORTS, rollbackFor=Exception.class)

public class AdminServicesImpl implements AdminServices {
	@Autowired
	 Admindao admindao;

	@Override
	public void create(Role role) {
		admindao.create(role);
		
	}

	@Override
	public void update(Role role) {
		admindao.update(role);
		
	}

	@Override
	public Role edit(String adminId) {
		return admindao.edit(adminId);
	}

	@Override
	public void delete(String adminId) {
		admindao.delete(adminId);
		
	}

	@Override
	public List<Role> getAll() {
		return admindao.getAll();
	}

	@Override
	public Role find(String admind) {
		// TODO Auto-generated method stub
		return admindao.find(admind);
	}

	
	
	
}