

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append(" <form action = \"MyServlet\" method = \"POST\">\r\n" + 
				"         First Name: <input type = \"text\" name = \"first_name\">\r\n" + 
				"         <br />\r\n" + 
				"         Last Name: <input type = \"text\" name = \"last_name\" />\r\n" + 
				"         <input type = \"submit\" value = \"Submit\" />\r\n" + 
				"      </form>");
	}

	/*
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("My name is: " + request.getParameter("first_name") + " ");
		response.getWriter().append(request.getParameter("last_name"));

	}

}
//You are close on this one. I can see you have your servlet all set up. One thing I would like to see if you use form data 
//passed into the Servlet. This is usually done using a parameter in your servlet. Here is more information: 
//	https://www.tutorialspoint.com/servlets/servlets-form-data.htm
