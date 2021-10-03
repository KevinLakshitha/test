package dirextourspackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String adminID = request.getParameter("adminid");
		String adminPw = request.getParameter("adminPw");
		boolean isTrue;
		
		isTrue = adminLoginDBUtil.validate(adminID, adminPw);
		
	
		
		if(isTrue == true) {
			
			
			List<admin> cusDetails = adminLoginDBUtil.getadmin(adminID);
			request.setAttribute("cusDetails", cusDetails);
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("Adminhome.jsp");
			dis.forward(request, response);
			
			
		}else {
			
		
			out.println("<script type = 'text/javascript'>");
			out.println("alart('please re enter');");
			out.println("location='adminlogin.jsp'");
			out.println("</script>");
			
		}
	}

}
