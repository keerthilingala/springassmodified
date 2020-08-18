package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Admin;
import com.example.demo.Model.Role;
@Repository("admindao")
public class Admindaoimpl implements Admindao{
	@Autowired 
	SessionFactory sessionfactory;
	
	protected Session currentSession() {
		return sessionfactory.getCurrentSession();
	}

	@Override
	public void create(Role role) {
		currentSession().save(role);
		}

	@Override
	public void update(Role role) {
		currentSession().update(role);
	}

	@Override
	public Role edit(String adminId) {
		return find(adminId);
	}

	@Override
	public void delete(String adminId) {
		currentSession().delete(adminId);
		
	}
	@Override
	public Role find(String adminId) {
		return (Role)currentSession().get(Role.class, adminId);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(Role.class).list();
	}
	
	
	
}
