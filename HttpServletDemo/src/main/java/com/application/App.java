package com.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet {
	private String mymsg;
	public void init() throws ServletException{
		mymsg = "Welcome Sagnik!";
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>"+mymsg+"</h1>");
		out.printf("<p> Hello World! </p>");
	}
}
