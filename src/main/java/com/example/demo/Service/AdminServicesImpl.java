package com.example.demo.Service;



import java.security.Security;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Admindao;
import com.example.demo.Dao.Rolesdao;
import com.example.demo.Dao.SupportAnalystdao;
import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.Role;
import com.example.demo.Model.SupportAnalyst;

@Service
@Component
public class AdminServicesImpl implements AdminServices {
	@Autowired
	private Admindao dao;
	@Autowired
	private Rolesdao rrdao;
	@Autowired
	private SupportAnalystdao supportDao;

	
	@Override
	public int CreateAd(Admin admin) {
		Admin a=dao.findByAdminId(admin.getAdminId());
		if(a==null) {
			Admin a1=dao.save(admin);
			if (a1 != null) {
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
	}
//	@Override
//	public int Addrole(Role rol) {
//		Role r=rrdao.findByAdminId(rol.getAdminId());//
//		if(r==null) {
//			Role a2=rrdao.save(rol);
//			if (a2 != null) {
//				return 1;
//			} else {
//				return 2;
//			}
//		}
//		return 0;
//	}

	@Override
	public int login(AdminLogin adminlogin) {
		Admin a =dao.findByAdminId(adminlogin.getUserId());
		 if(a==null)
		 {
		   return 1;
		 }
		 else
		 {
		 return 2;
		 }
}
	
	@Override
	public List<SupportAnalyst> listsupportanalyst() {
		// TODO Auto-generated method stub
		return null;
	}

	
	


	@Override
	public Admin getAdmin(String username) {
		
		return dao.findByAdminId(username);
	}

	@Override
	public int Addrole(Role rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Role getRolebyadminId(String adminId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Role> getAllAdminIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRole(String adminId) {
		Rolesdao.deleteByAdminId(adminId);
		return adminId;
	}

	

	@Override
	public Admin getAdminByContactNumber(String contactNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String adminId) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public void deleteRole(String adminId) {
		// TODO Auto-generated method stub
		
	}*/
	}
	

	
	