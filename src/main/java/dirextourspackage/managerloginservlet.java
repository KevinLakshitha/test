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


public class managerloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String managerID = request.getParameter("managerid");
		String nic = request.getParameter("nic");
		boolean isTrue;
		
		isTrue = managerDButil.validatee(managerID, nic);
		
	
		
		if(isTrue == true) {
			
			
			List<manager> cusDetails = managerDButil.getmanager(managerID);
			request.setAttribute("cusDetails", cusDetails);
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
			
			
		}else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		
			out.println("<script type = 'text/javascript'>");
			out.println("alart('please re enter');");
			out.println("location='adminlogin.jsp'");
			out.println("</script>");
			
		}
	}

}
