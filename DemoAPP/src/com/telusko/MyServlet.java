package com.telusko;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out = response.getWriter();
		out.print("hi");
		ServletConfig cg = getServletConfig();
		
		ServletContext ctx =  getServletContext();
		String str = ctx.getInitParameter("name");
		//String str = ctx.getInitParameter("phone");
		out.print(str);
		
		
	}
	
}
