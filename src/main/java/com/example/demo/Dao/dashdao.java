package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Dashboard;
import com.example.demo.Model.Role;


@Repository
public interface dashdao extends CrudRepository<Dashboard, String> {
	public Dashboard findByAdminId(String AdminId);
	public List<Dashboard> findAll();
}
