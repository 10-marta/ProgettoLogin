package demo;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=Logger.getLogger(HomeServlet.class.getName());
	final String DEFAULT_USERNAME="Pluto";
	final String DEFAULT_PASSWORD="password";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super(); 
        logger.info("Costruisco HomeServlet");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Ricevuta get");
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		if(DEFAULT_USERNAME.equals(user)&& DEFAULT_PASSWORD.equals(pass)) {
			response.sendRedirect("admin.html");
		}else {
			response.getWriter()
			.append("<p>Credenziali sbagliate")
			.append("\nTorna indietro")
			.append("\n<a href=\"login.html\">Accedi</a>")
			.append("</p>");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Ricevuta post");
		response.getWriter().append("Operazione non prevista");
	}

}
