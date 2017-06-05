package com.zker;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CountServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		int count;
        if (sc.getAttribute("count") == null) {
            count = 1;
        } else {
            count = Integer.parseInt(sc.getAttribute("count").toString());
            count++;
        }
		sc.setAttribute("count", count);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
