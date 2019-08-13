package com.vinayak.ShoppingBackEnd;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
import com.vinayak.model.Product;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
    	  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	  CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
          ProductDao objp=context.getBean("productDao",ProductDao.class);
          Category c = null;
	      System.out.println("enter category or product");
	     Scanner sc=new Scanner(System.in);
    	 String name = sc.next();
    	 if(name.equals("category")) {
    		 c=new Category();
    		 System.out.println("enter add or view");
    		 String name1 = sc.next();
    	
    	 
    		 	if(name1.equals("add")) {
    		 		System.out.println("enter cat id");
    	 
    		 		c.setCategoryId(sc.next());
    		 		System.out.println("enter cat name");
    		 		c.setCategoryName(sc.next());
    		 		System.out.println("enter cat desc");
    		 		c.setDescription(sc.next());
    		 		obj.addCategory(c);
    		 		System.out.println("Category Added");
    		 	}
    		 	else if(name1.equals("view")) {
    		  
    		 		List<Category> categories=obj.getAllCategories();
    		 		for(Category cObj:categories) {
    	        	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName());
    	        }
    		 }
    	 }
    	 
    	 else if(name.equals("product")) {
    		 Product p=new Product();
    		 System.out.println("enter add or view");
    		 String name2 = sc.next();
    		 	if(name2.equals("add")) {
    		 
    		 		System.out.println("enter prod id");
    		 		p.setProductId(sc.next());
    		 		System.out.println("enter prod name");
    		 		p.setProductName(sc.next());
    		 		System.out.println("enter prod desc");
    		 		p.setProdesc(sc.next());
    		 		System.out.println("enter cat id");
    		 		Category cn=new Category();
    		 		cn.setCategoryId(sc.next());
    		 		p.setCat(cn);
    		 		objp.addProduct(p);
    		 		System.out.println("Product Added");
    		 	}
    		 	else if(name2.equals("view")) {
    		 		List<Product> prods=objp.getAllProducts();
    		 		for(Product pObj:prods) {
    	        	System.out.println(pObj.getProductId()+" "+pObj.getProductName());
    	        }
    	 }
      
       
        
    	 }
        
      
      
        
      
        
        
    }
}
