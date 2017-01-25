# repo
package org.cherry.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
	PrintWriter pw = res.getWriter();
	pw.println("<html><body><h1>"+name+"  "+pass+"</h1></body></html>");
	
	}
}
.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>document</title>
</head>
<body>
<form action="form">
name:<input type="text" name="n1">
pass:<input type="password" name="p1">
<input type="submit" value="login">
</form>
</body>
</html>
