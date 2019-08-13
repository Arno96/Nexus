package com.frontend.catcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
@Controller
public class CategoryControl {
	
	@Autowired
	private CategoryDao obj;
	@RequestMapping(value="/categoryForm",method=RequestMethod.GET)
	public ModelAndView getCategoryForm(){
		/*ModelAndView is a class which can encapsulate View name to be 
		 * rendered and data that we want to share from Controller to the
		 * View*/
		
		/*Here CategoryForm  is the View*/
		ModelAndView mv=new ModelAndView("CategoryForm");
		
		//This is the data we want to share
		mv.addObject("cObj",new Category());
		mv.addObject("btnLabel","Add Category");
		mv.addObject("frmLabel","Add Category Form");
		return mv;
	}
		@RequestMapping(value = "/submitCategory", method = RequestMethod.POST)
		public String addCateg(@ModelAttribute Category cObj,ModelMap map) {
			if(cObj.getCategoryId()==null){
				obj.addCategory(cObj);
				map.addAttribute("msg","Category Added Succesfully");
			}
			else {
				obj.updateCategory(cObj);
				map.addAttribute("msg","Category Updated Succesfully");
			}
			List<Category> categoryList=obj.getAllCategories();
			map.addAttribute("categories",categoryList);
			return "ViewCategory";
			
		}
		
		@RequestMapping(value = "viewCategory", method = RequestMethod.GET)
		public String getCateg(ModelMap map) {
			List<Category> categoryList=obj.getAllCategories();
			map.addAttribute("categories",categoryList);
			return "ViewCategory";
		}
		
		@RequestMapping(value="/deleteCategory/{catId}",method=RequestMethod.GET)
		public String deleteCategory(@PathVariable String catId,ModelMap map){
			obj.deleteCategory(catId);
			map.addAttribute("msg","Category Deleted Succesfully");
			List<Category> categoryList=obj.getAllCategories();
			map.addAttribute("categories",categoryList);
			return "ViewCategory";
		
		}
		
		@RequestMapping(value="/updateCategory/{catId}",method=RequestMethod.GET)
		public String updateCategoryForm(@PathVariable String catId,ModelMap map){
			Category cObj=obj.getCategory(catId);
			map.addAttribute("cObj",cObj);
			map.addAttribute("btnLabel","Update Category");
			map.addAttribute("frmLabel","Update Category Form");
			
			return "CategoryForm";
		
		}
		
	}


