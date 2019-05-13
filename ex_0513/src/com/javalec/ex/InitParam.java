package com.javalec.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParam
 */
@WebServlet(urlPatterns={"/InitP"}, initParams={@WebInitParam(name="id", value="aaa"), @WebInitParam(name="pw", value="99999")})
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * String id = getInitParameter("id"); String pw = getInitParameter("pw");
		 * 
		 * System.out.println("id = " + id); System.out.println("pw = " + pw);
		 */
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
