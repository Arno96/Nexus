package com.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HeroDao;
import com.dao.HeroDaoImpl;
import com.frame.Hero;
@WebServlet("/ViewControl")

/**
 * Servlet implementation class ViewControl
 */
public class ViewControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HeroDao daoObj=new HeroDaoImpl();
		List<Hero> empsList=daoObj.getAllHeroes();
		request.setAttribute("elist", empsList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAllHeroes.jsp");
		rd.forward(request, response);
	}

}
