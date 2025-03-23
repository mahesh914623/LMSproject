package com.project.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.web.Repositery.Courseinfo;
import com.project.web.Repositery.Professorinfo;
import com.project.web.Repositery.Userinfo;
import com.project.web.model.Course;
import com.project.web.model.Professor;
import com.project.web.model.User;

@Controller
public class Usercontroller {
	@Autowired
	Userinfo ob;
	@Autowired
	Professorinfo ob1;
	
	
	private String emailId;
	
   @GetMapping("/")
   public String getMethodName() {
       return "Home.jsp";
   }
   @PostMapping("/add")
   public String adddata(@ModelAttribute User ee) {
	   ob.save(ee);
       return "Registration.jsp";
   }
   @PostMapping("/add1")
   public String adddata1(@ModelAttribute Professor e) {
	   ob1.save(e);
       return "Registration.jsp";
   }
   @PostMapping("/log")
   public String login(@RequestParam String emailId,@RequestParam String password,Model model) {
	  User al= ob.findByEmailId(emailId);
	  Professor al1=ob1.findByEmailId(emailId);
	  System.out.println(al1);
	  if (al != null && al.getEmailId().equals(emailId) && al.getPassword().equals(password)) {
			List<User> ki = new ArrayList<>();
			this.emailId = al.getEmailId();
			ki.add(al);
			model.addAttribute("dat",ki);
			 return "Userfetch.jsp";
		} 
	  else if(al1 != null && al1.getEmailId().equals(emailId) && al1.getPassword().equals(password)) {
			List<Professor> li = new ArrayList<>();
			this.emailId = al1.getEmailId();
			li.add(al1);
			model.addAttribute("data", li);
			return "Professorfetch.jsp";
		}
		 return "Login.jsp";      
   }
    @RequestMapping("/edit/{id}")
    public String Updateprofdata(@PathVariable int id,@ModelAttribute Professor ee,Model m) {
 	    Professor object=ob1.findById(id);
 	    if (object!=null) {
			object.setId(ee.getId());
			object.setName(ee.getName());
			object.setEmailId(ee.getEmailId());
			object.setMobilenumber(ee.getMobilenumber());
			object.setDepartment(ee.getDepartment());
			ob1.save(object);
		}
 	    this.emailId=object.getEmailId();
 	   return "redirect:/showData";
 	 
    }
    @GetMapping("/showData")
    public String login1(Model model) {
 	  Professor al1=ob1.findByEmailId(emailId);
 	   if(al1 != null ) {
 			List<Professor> li = new ArrayList<>();
 			li.add(al1);
 			model.addAttribute("data", li);
 			return "Professorfetch.jsp";
 		}
 	  return "Professorfetch.jsp";    
    }
    
    @RequestMapping("/deleteProf/{id}")
    public String deleteprof(@PathVariable int id) {
    	ob1.deleteById(id);
    	 return "redirect:/showData2";
    }
    @GetMapping("/showData2")
    public String deleteprof1() {
    	 return "Registration.jsp";
    }
    
    
    @RequestMapping("/editUser/{id}")
    public String Updateuserdata(@PathVariable int id,@ModelAttribute User ee,Model m) {
 	    User object=ob.findById(id);
 	    if (object!=null) {
			object.setId(ee.getId());
			object.setName(ee.getName());
			object.setEmailId(ee.getEmailId());
			object.setMobilenumber(ee.getMobilenumber());
			object.setPassword(ee.getPassword());
			ob.save(object);
		}
 	    this.emailId=object.getEmailId();
 	   return "redirect:/showData1";
 	 
    }
    @GetMapping("/showData1")
    public String login2(Model model) {
 	  User al1=ob.findByEmailId(emailId);
 	   if(al1 != null ) {
 		  List<User> ki = new ArrayList<>();
			ki.add(al1);
			model.addAttribute("dat",ki);
			 return "Userfetch.jsp";
 		}
 	    return "Userfetch.jsp";   
    }
    @RequestMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable int id) {
    	ob.deleteById(id);
    	 return "redirect:/showData3";
    }
    @GetMapping("/showData3")
    public String deleteuser1() {
    	 return "Registration.jsp";
    }
    
   @Autowired
   Courseinfo  co;

    @PostMapping("/coursedata")
    public String saveCourseData(@ModelAttribute Course c) {
    	co.save(c);
    return "Registration.jsp";
    }
}
