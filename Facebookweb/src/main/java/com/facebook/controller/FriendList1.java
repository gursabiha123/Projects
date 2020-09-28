package com.facebook.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Facbookweb.Utilitys.Servicefactory;
import com.facebookweb.entity.facebookwebUser;
import com.facebookweb.service.facebookServiceInterface;


public class FriendList1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name=request.getParameter("username");
		
		HttpSession ss=request.getSession(true);
		String name=ss.getAttribute("userid").toString();
		
		System.out.println(name);
		
		facebookwebUser fe=new facebookwebUser();
		fe.setName(name);
		
		facebookServiceInterface fs=Servicefactory.createObject("adminservice");
		List<facebookwebUser> i=fs.friendProfile(fe);
		//facebookServiceInterface fs=Servicefactory.createObject("adminservice");
		//boolean i=fs.loginProfile(fe);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		
		if(i.size()>0) {
			for(facebookwebUser ff:i) {
				out.println(ff.getName());
			}
		}
		else {
			out.println("no friend found");
		}
		
		out.println("</body></html>");
	}

}
