package com.frontend.catcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
@Controller
public class CategoryControl {
	
	@Autowired
	private CategoryDao obj;
		@RequestMapping(value = "addCategory", method = RequestMethod.POST)
		public String addCateg(@ModelAttribute Category cObj) {
		
			
			
			boolean b=obj.addCategory(cObj);
			if(b) {
				System.out.println("added");
			}
			else {
				System.out.println("not");
			}
			return "ViewCategory";
		}
		
		@RequestMapping(value = "viewCategory", method = RequestMethod.GET)
		public String getCateg(ModelMap map) {
			List<Category> l=obj.getAllCategories();
			map.put("l",l);
			return "ViewCategory";
		}
		

	}


