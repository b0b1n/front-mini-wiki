

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringReader;

/**
 * Servlet implementation class Thematique
 */
public class ThemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ThemaServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JsonClient jc = new JsonClient();
		JsonReader jt;
		jt = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/thematiques")));
		JsonArray thematiques = jt.readArray();
		response.getWriter().append(thematiques.toString());
		request.setAttribute("thematiques", thematiques);
		
		this.getServletContext().getRequestDispatcher("Searchbar.jsp").forward(request, response);
	}
	
	}

	

}
