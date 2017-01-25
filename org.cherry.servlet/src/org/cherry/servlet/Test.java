package org.cherry.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test extends GenericServlet 
{
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	System.out.println("servlet program");
	String name=req.getParameter("n1");
	String pass=req.getParameter("p1");
	//System.out.println(name+" "+pass);
//	Enumeration<String> keys = req.getParameterNames();
//	while(keys.hasMoreElements())
//	{
//		String key= keys.nextElement();
//		String value_2 = req.getParameter(key);
//		System.out.println(value_2);
//	}
	PrintWriter pw = res.getWriter();
	pw.println("<html><body><h1>"+name+"  "+pass+"</h1></body></html>");
	
	}
}