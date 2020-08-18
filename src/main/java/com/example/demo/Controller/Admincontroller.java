package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Dao.Admindao;
import com.example.demo.Dao.Rolesdao;
import com.example.demo.Dao.SupportAnalystdao;
import com.example.demo.Dao.dashdao;
import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.Dashboard;
import com.example.demo.Model.Role;
import com.example.demo.Model.SupportAnalyst;
import com.example.demo.Service.AdminServices;

@Controller
public class Admincontroller {
	@Autowired
	private Admindao dao;
	@Autowired
	private SupportAnalystdao sdao;
	@Autowired
	private Rolesdao rdao;
	@Autowired
	private dashdao ddao;
    @Autowired
    private AdminServices adminservices;
    
    @GetMapping("/role")  
    private List<Role> getAllAdminID()   
    {  
    return adminservices.getAllAdminIDs();  
    }  
    
	@GetMapping(value="/admin")
	 public String admin(Model model) {
		 model.addAttribute("admin",new Admin());
		 return "Admin";
	 }
	@PostMapping(value="/adminreg")
	public String adminreg(@ModelAttribute("admin") Admin adminreg,Model model) {
		Admin ar= dao.save(adminreg);
		if(ar!=null) {
			model.addAttribute("message","Your details are submitted successfully.");
			return "Admin";
		}else {
			model.addAttribute("message","Something went wrong.");
			return "failure";
		}		
	}	
	@GetMapping(value="/adminlogin")
	public String adminlogin(Model model) {
		model.addAttribute("adminlogin", new AdminLogin());
		return "AdminLogin";
	}
	
	@PostMapping(value="/loginverify")
	public String loginverify(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model,HttpSession session)
	{
		Optional<Admin> al=dao.findById(adminlogin.getUserId());
		if(al.isPresent())
			
		{
			Admin a1=al.get();
			if(a1.getPassword().equals(adminlogin.getPassword()))
			{
				session.setAttribute("name", a1.getAdminId());
				return "AdminHome";
			}		
		}
		
		model.addAttribute("message", "Invalid userId or password");
		return "AdminLogin";
		
	}	
	
	@GetMapping(value="/adminlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("/adminLogout")
	public String adminLogOut(HttpSession session)
	{
		session.invalidate();	
		return "redirect:/";
	}
	
	
	@GetMapping("/role1")
	public String role1(Model model)
	{
		List<Role> ro=rdao.findAll();
        model.addAttribute("rll", ro);
        System.out.println(ro);
	
		return "Role";
		
	}
	@GetMapping("/dash1")
	public String dash1(Model model)
	{
		List<Role> ro=rdao.findAll();
        model.addAttribute("rll", ro);
        System.out.println(ro);
        
	
		return "Dashboard";
		
	}
	@GetMapping("/dash2")
	public String dash2(Model model)
	{
		List<Dashboard> da=ddao.findAll();
        model.addAttribute("das", da);
        System.out.println(da);
        
	
		return "Updatefordash";
		
	}
	
	

	

	
	
	@GetMapping(value="/rol")
	 public String rol(Model model) {
		 model.addAttribute("rol",new Role());
		 return "NewRole";
	 }
	@PostMapping(value="/role")
	public String radd(@ModelAttribute("rol") Role radd,Model model) {
		Role ra= rdao.save(radd);
		if(ra!=null) {
			model.addAttribute("message","submitted successfully.");
			return "NewRole";
		}else {
			model.addAttribute("message","Something went wrong.");
			return "failure";
		}	}		
	
	
	
	@GetMapping("/user1")
	public String user1(Model model)
	{
            List<SupportAnalyst> sa=sdao.findAll();
            model.addAttribute("sup", sa);
            System.out.println(sa);
            List<Admin> a=dao.findAll();
            model.addAttribute("ad", a);
            System.out.println(a);
		return "User";
	}
	
	
	
	

	@GetMapping(value="/upd")
	 public String upd(Model model) {
		 model.addAttribute("upd",new Role());
		 return "Update";
	 }
	@PostMapping(value="/updt")
	public String updt(@ModelAttribute("upd") Role updt,Model model) {
		List<Role> up=rdao.findAll();
        model.addAttribute("upp", up);
        System.out.println(up);
		Role ra= rdao.save(updt);
		if(ra!=null) {
			model.addAttribute("message","submitted successfully.");
			return "Update";
		}else {
			model.addAttribute("message","Something went wrong.");
			return "failure";
		}	}		

	


	@GetMapping(value="/upd1")
	 public String upd1(Model model) {
		 model.addAttribute("upd1",new Role());
		 return "Updatefordash";
	 }
	@PostMapping(value="/updt1")
	public String updt1(@ModelAttribute("upd1") Role updt1,Model model) {
		
		
		Role ra= rdao.save(updt1);
		if(ra!=null) {
			model.addAttribute("message","submitted successfully.");
			return "Updatefordash";
		}else {
			model.addAttribute("message","Something went wrong.");
			return "failure";
		}	}		
	
//	@GetMapping(value="/del")
//	 public String del(Model model) {
//		 model.addAttribute("del",new Role());
//		 return "Delete";
//	 }
	
	//@DeleteMapping(value="/delete")
	@RequestMapping(value = "del/{adminId}", method= RequestMethod.GET)
	public String delete(@PathVariable("adminId") String adminId,Map<String, Object> map) {
		adminservices.delete(adminId);
		return "redirect:/rol";
	}
  
	@GetMapping("walmart1")
	public String walmart()
	{

		return "wrpt1";
	}
	@GetMapping("walmart2")
	public String walmarts()
	{

		return "wrpt2";
	}
	@GetMapping("trpt1")
	public String trpt()
	{

		return "trpt1";
	}
	@GetMapping("trpt2")
	public String trpt1()
	{

		return "trpt2";
	}
	
   }
