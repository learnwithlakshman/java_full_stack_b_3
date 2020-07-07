package com.lwl.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/viewcolor.do"})
public class ViewColorServlet extends HttpServlet {

	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String color = req.getParameter("color");
			resp.setContentType("text/html");
			StringBuilder sb = new StringBuilder();
			sb.append("<html><head><title>Colors Exampls</title></head>");
			sb.append("<body>");
			sb.append("<a href='index.html'>Home</a>");
			sb.append("<h3>Your selected color :"+color+"</h3>");
			sb.append("</body>");
			sb.append("</html>");
			PrintWriter out = resp.getWriter();
			out.print(sb.toString());
			
		}
}
