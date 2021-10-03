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
 * Servlet implementation class TourguideDelete
 */
@WebServlet("/packageDelete")
public class managerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public managerDelete() {
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
		System.out.println(managerID);
		
		boolean isTrue = false;
		if(managerID.isEmpty()) {
			System.out.println("Fields are empty");
		}else {
			isTrue = managerDButil.deleteTourguide(managerID);
		}
		if(isTrue == true) {
			HttpSession session = request.getSession();
			session.setAttribute("delete_status", "success");
			response.sendRedirect("manageManagers.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("delete_status", "unsuccess");
			response.sendRedirect("updateManagers.jsp");
		}
	}

}
