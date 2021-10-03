package dirextourspackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TourguideUpdate
 */
@WebServlet("/packageUpdate")
public class managerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public managerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String managerID = request.getParameter("managerID");
		String nic = request.getParameter("nic");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String section = request.getParameter("section");

		
		
		
		boolean isTrue = false;
		if(managerID.isEmpty() || nic.isEmpty()  || name.isEmpty() || email.isEmpty() || phoneno.isEmpty() || section.isEmpty()) {
			System.out.println("Fields are empty");
		}else {
			isTrue = managerDButil.updatetourguide(managerID, nic, name, email , phoneno, section);
		}
		if(isTrue == true) {
			HttpSession session = request.getSession();
			session.setAttribute("status", "success");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("status", "unsuccess");
		}
		manager manager = managerDButil.getTourguideById(managerID);
		request.setAttribute("manager", manager);
		RequestDispatcher dis = request.getRequestDispatcher("updateManagers.jsp");
		dis.forward(request, response);	
	}

}
