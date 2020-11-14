/**
 * 
 */
package com.sj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;
/**
 * @author skamsani2
 *
 */
@WebServlet("/welcome")

	public class ControllerServlet extends HttpServlet{
		
	
		
		public ControllerServlet() {
			super();
		}
		
		
		protected void doGet(HttpServlet request,HttpServletResponse response)throws ServletException,IOException{
			
			int id=Integer.parseInt(request.getInitParameter("id"));
			String title=request.getInitParameter("title");
			String description=request.getInitParameter("description");
			String domain=request.getInitParameter("domain");
			Project p=new Project(id,title,description,domain);
			ProjectDAO pdao=new ProjectDAO();
			boolean b=pdao.insertProject(p);
			if(b==true)
				((ServletRequest) request).getRequestDispatcher("sucess.jsp").include((ServletRequest) request,response);
		}
	}
	
	
	
	
	
	
	
	
	
	
	


