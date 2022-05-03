
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(urlPatterns = { "/testServlet", "/view/edit"})

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TestServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		switch (request.getServletPath()) {
		case "/testServlet":
			response.sendRedirect("view/ModifierPage.jsp");
			break;
		default:
			response.getWriter().append(" Voici la methode du requete :   " + request.getMethod());

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String Titre = request.getParameter("Titre");
		String Thematique = request.getParameter("Thématique");
		String Description = request.getParameter("Description");
		String Contenu = request.getParameter("Contenu");
		
		String JsonString = "{\"id\" : " + id
				+ ", \"Titre\" :" + Titre
				+ ", \"Thematique\" :" + Thematique
				+ ", \"Description\" :" + Description
				+ ", \"Contenu\" :"+ Contenu
				+"}";

		switch (request.getServletPath()) {
		case "/view/edit":
			
			//Données récupérés sous format Json Mais de Type String
			System.out.println(JsonString);
			//System.out.println("La méthode POST est appelé");
			response.getWriter().append(JsonString);
			break;

		}
	}



}
