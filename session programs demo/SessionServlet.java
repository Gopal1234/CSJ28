package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set content type as text/html
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("t1");
		HttpSession session=request.getSession(true);
		//session.setMaxInactiveInterval(20000);
		if(session.isNew())
		{
			
			response.sendRedirect("signUp.jsp");
		}
		else
		{
			session.setAttribute("uname", name);
			pw.println("<h2>"+new Date(session.getCreationTime()) +"</h2><br>");
			pw.println("<h2>"+session.getId()+"</h2><br>");
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.include(request, response);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
