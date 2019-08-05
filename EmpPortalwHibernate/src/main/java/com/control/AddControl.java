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
import com.frame.Hero;
@WebServlet("/AddControl")
/**
 * Servlet implementation class AddControl
 */
public class AddControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String n=request.getParameter("hn");
		int a=Integer.parseInt(request.getParameter("ha"));
		Hero p=new Hero();
		p.setAge(a);
		p.setName(n);
		HeroDao daoObj=new HeroDaoImpl();
		boolean r=daoObj.addHero(p);
		if(r) {
			System.out.println("hero added");
			out.println("hero added");
		}
		else {
			System.out.println("not added");
			out.println("not added");
		}
	}

}
