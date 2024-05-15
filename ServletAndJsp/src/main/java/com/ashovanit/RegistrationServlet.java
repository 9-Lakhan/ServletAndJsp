package com.ashovanit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String NAME = request.getParameter("name");
		String EMAIL = request.getParameter("email");
		String MOBILE = request.getParameter("mobile");
		long Mobile = Long.parseLong(MOBILE);
		String COLLAGE = request.getParameter("collage");
		String CITY = request.getParameter("city");
		String USERID= request.getParameter("userid");
		String PASSWORD = request.getParameter("password");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("Name : "+NAME);
		out.print("<br><br>");
		out.print("Email : "+EMAIL);
		out.print("<br><br>");
		out.print("Mobile : "+MOBILE);
		out.print("<br><br>");
		out.print("Collage : "+COLLAGE);
		out.print("<br><br>");
		out.print("City : "+CITY);
		out.print("<br><br>");
		out.print("Userid : "+USERID);
		out.print("<br><br>");
		out.print("Password : "+PASSWORD);
		

		DBConnection.getConnection(NAME, EMAIL, Mobile, COLLAGE, CITY, USERID, PASSWORD);
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
