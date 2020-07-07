package com.lwl.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lwl.web.domain.Course;
import com.lwl.web.domain.CourseService;

@WebServlet("/course.do")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final CourseService courseService;
	
	public CourseServlet() {
		this.courseService = new CourseService();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Course> cList = courseService.getCourses();
			request.setAttribute("clist", cList);
			RequestDispatcher rd = request.getRequestDispatcher("/course.jsp");
			rd.forward(request, response);
	}
	

}
