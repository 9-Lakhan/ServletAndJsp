package com.ashovanit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginSevlet")
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Userid =request.getParameter("userid");
		String Password = request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("Userid : "+Userid);
		out.print("<br><br>");
		out.print("Password : "+Password);
		out.print("<br><br>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
