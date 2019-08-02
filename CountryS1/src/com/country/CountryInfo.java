package com.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import proxies.CountryInfoService;
import proxies.CountryInfoServiceSoapType;

/**
 * Servlet implementation class CountryInfo
 */
@WebServlet("/CS")
public class CountryInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String c=request.getParameter("cntry");
	PrintWriter out=response.getWriter();
	
	CountryInfoService serviceImpl= new CountryInfoService();
	CountryInfoServiceSoapType service=serviceImpl.getCountryInfoServiceSoap();
	out.println(service.countryName(c));
	out.println(service.countryFlag(c));
	}

}
