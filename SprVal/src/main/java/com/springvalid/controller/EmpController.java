package com.springvalid.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springvalid.model.Employee;



@Controller
public class EmpController {
	
	@RequestMapping(value="/empForm",method=RequestMethod.GET)
	public ModelAndView getEmployeeForm(){
		ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("empObj",new Employee());
		
		
		return mv;
	}
	
	@RequestMapping(value="/empView",method=RequestMethod.GET)
	public ModelAndView getAllEmp(@Valid @ModelAttribute(name="empObj") Employee empObj,BindingResult result){
		//nameValidator.validate(empObj,result);
		if(result.hasErrors()) {
			ModelAndView mv=new ModelAndView("EmployeeForm");
			
			return mv;
		}
		ModelAndView mv=new ModelAndView("ViewEmployee");
			mv.addObject("empObj",empObj);
			return mv;

}
}
