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
 * Servlet implementation class SearchGuide
 */


@WebServlet("/Searchpayment")
public class paymentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public paymentservlet() {
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
		
		String paymentid = request.getParameter("paymentid");
		System.out.println(paymentid);
		payment payment = null;
		boolean isTrue = false;
		if(paymentid.isEmpty()) {
			System.out.println("Fields are empty");
		}else {
	
			payment = paymentDBUtil.getTourguidById(paymentid);
			if(payment != null) {
				isTrue = true;
			}
		}
		if(isTrue == true) {
			request.setAttribute("payment", payment);
			RequestDispatcher dis = request.getRequestDispatcher("Finance.jsp");
			dis.forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("search_status", "unsuccess");
			response.sendRedirect("Finance.jsp");
		}
	}

}
