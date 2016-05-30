package org.york.gamified.modelling;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet(description = "Main Class for Gamified Modelling", urlPatterns = { "/Validation" })
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validation() {
		super();
		// TODO Auto-generated constructor stub
	}

	// /**
	// * @see Servlet#init(ServletConfig)
	// */
	// public void init(ServletConfig config) throws ServletException {
	// super();
	// }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// String filename = getServletContext().getRealPath("/");
			// response.getWriter().append(filename);
			//
			// Eol eol = new Eol();
			// eol.execute();

			StringBuilder stringBuilder = new StringBuilder();
			String result;
			while ((result = request.getReader().readLine()) != null) {
				stringBuilder.append(result);
			}

			String json = stringBuilder.toString();
			if (json != null && json.length() > 0) {
				response.setContentType("application/json");
				response.getWriter().append(json);
				response.getWriter().flush();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
