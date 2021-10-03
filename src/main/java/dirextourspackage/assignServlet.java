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
 * Servlet implementation class assignServlet
 */
public class assignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public assignServlet(){
		super();
		}


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String managerID = request.getParameter("managerID");
		String nic = request.getParameter("nic");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String section = request.getParameter("section");
		boolean isTrue;
		isTrue = adminLoginDBUtil.addmanager(managerID, nic, name, email, phoneno, section);
		if(isTrue == true) {
		RequestDispatcher dis = request.getRequestDispatcher("manageManagers.jsp");
		dis.forward(request, response);
		}
		else {
		RequestDispatcher dis2 = request.getRequestDispatcher("manageManagers.jsp");
		dis2.forward(request, response);
		}

		}



	

}
