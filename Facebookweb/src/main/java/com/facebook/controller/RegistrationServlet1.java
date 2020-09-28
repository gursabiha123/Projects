package com.facebook.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Facbookweb.Utilitys.Servicefactory;
import com.facebookweb.entity.facebookwebUser;
import com.facebookweb.service.facebookServiceInterface;

public class RegistrationServlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		facebookwebUser fe=new facebookwebUser();
		fe.setName(name);
		fe.setAddress(address);
		fe.setEmail(email);
		fe.setPassword(password);
	
		facebookServiceInterface fs=Servicefactory.createObject("adminservice");
		int i=fs.createprofileService(fe);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		if(i>0) {
			
			out.println("Registration successful   <a href=login.html>Contunue...</a>");
				
			out.println("Your Name is "+name);
			out.println("<br>Your Password is "+password);
			
		}
		out.println("</body></html>");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}}
