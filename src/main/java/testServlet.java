

import jakarta.json.Json;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class testServlet
 */
@WebServlet(
		urlPatterns ={"/TestServlet","/view/edit","/edit"})
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("khdeem");
		response.sendRedirect("view/ModifierPage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		switch(request.getServletPath()) {
		case "/view/edit":
			String id = request.getParameter("id");
			String Titre = request.getParameter("Titre");
			String Thématique = request.getParameter("Thématique");
			String Description = request.getParameter("Description");
			String Contenu = request.getParameter("Contenu");
			
			
			
			System.out.println("totoo1");
		}
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch(request.getServletPath()) {
		case "/view/edit":
			String id = request.getParameter("id");
			String Titre = request.getParameter("Titre");
			String Thematique = request.getParameter("Thematique");
			String Description = request.getParameter("Description");
			String Contenu = request.getParameter("Contenu");
			
	/*		String JsonString = "{\"id\" : " + id
				    + ", \"Titre\" :" + Titre
				    + ", \"Thematique\" :" + Thematique
				    + ", \"Description\" :" + Description
				    + ", \"Contenu\" :"+ Contenu
				+"}";
				
		*/		
			System.out.println("totoo2");
//			response.getWriter().append("toto1");
			break;
		case "/edit":	
			String id = request.getParameter("id");
			String Titre = request.getParameter("Titre");
			String Thematique = request.getParameter("Thematique");
			String Description = request.getParameter("Description");
			String Contenu = request.getParameter("Contenu");
			
			System.out.println("toto3");
			response.getWriter().append("toto2");
			break;
	}
		
	
	}

}
