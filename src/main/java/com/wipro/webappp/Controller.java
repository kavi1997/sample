package com.wipro.webappp;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		String trigerFrom = req.getParameter("Button");
		if (trigerFrom.equals("generate power")) {
		String a= req.getParameter("num");
		String b= req.getParameter("num1");
		int res=power(Integer.parseInt(a),Integer.parseInt(b)); 
		out.println("<h1>"+a+" to the power of "+b+" = "+ res +" "+"</h1>");
		out.close();
		
			}
	}
		public int power(int p,int q){
			int res=1;
			for(int i=1;i<=q;i++){
        		res=res*p;
			}
			return res;
   		 }
				
	

}
