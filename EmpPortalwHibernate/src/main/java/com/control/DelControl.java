package com.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HeroDao;
import com.dao.HeroDaoImpl;
@WebServlet("/DelControl")

/**
 * Servlet implementation class DelControl
 */
public class DelControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int i=Integer.parseInt(request.getParameter("hi"));
		
	    HeroDao daoObj=new HeroDaoImpl();
	    boolean r=daoObj.deleteHero(i);
	    if(r) {
	    	out.println("hero deleted");
	    	
	    }
	    else {
	    	out.println("not deleted");
	    }
	}

}
