package com.example.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Dao.Admindao;

import com.example.demo.Model.Role;
import com.example.demo.Service.AdminServices;

@Controller
@RequestMapping("/role")
public class Admincontroller {
	@Autowired
	private Admindao admindao;
	
    @Autowired
    AdminServices adminservices;
   
    @RequestMapping(value ="/register", method= RequestMethod.GET)
    public String register(Map<String, Object>map)
    {
    	map.put("role", new Role());
    	return "role/register";
    	
    }
    @RequestMapping(value ="/create", method= RequestMethod.POST)
    public String create(Role role,Map<String, Object>map) {
    	adminservices.create(role);
    	return "redirect:/role/details/" + role.getAdminId();
    	
    }
    
    @RequestMapping(value ="/details", method= RequestMethod.GET)
    public String details(@PathVariable("adminId") String adminId, Map<String, Object>map) {
    	Role role =adminservices.find(adminId);
    map.put("adminId", role.getAdminId());
    map.put("firstName", role.getFirstName());
    map.put("lastName", role.getLastName());
    map.put("rolename", role.getRolename());
    map.put("powerbiunits", role.getPowerbiunits());
    map.put("isadmin", role.getIsadmin());
    map.put("role", role.getRole());
    map.put("password", role.getPassword());
    map.put("Conformpassword", role.getConformpassword());
    return "role/details";
   }
}
