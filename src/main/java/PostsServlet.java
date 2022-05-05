
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonReader;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Accueil
 */
@WebServlet(
	/*	urlPatterns = {"/home","/articles" }*/
	"Posts"	
		)


public class PostsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PostsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		JsonClient jc = new JsonClient();
		JsonReader jr;
		
		try {
			
				String thematique=request.getParameter("thematique");
				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/pages?search="+thematique)));
				JsonArray articles = jr.readArray();
				response.getWriter().append(articles.toString());
				
		
				HttpSession session= request.getSession();
				session.setAttribute("pages",articles);
				
					//request.setAttribute("pages", articles);
					
					this.getServletContext().getRequestDispatcher("Articles.jsp").forward(request, response);
			}
		 catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


}
