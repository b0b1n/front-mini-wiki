
import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

/**
 * Servlet implementation class WikiServlet
 */
@WebServlet("/Accueil")
public class WikiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public WikiServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest hr = HttpRequest.newBuilder().uri(URI.create("http://127.0.0.1:8000/accueil"))
					.header("Content-type", "application/json").build();
			HttpResponse<String> hrep;
			hrep = client.send(hr, BodyHandlers.ofString());
			String mesPosts = hrep.body();

			//System.out.println(mesPosts);

			JsonArrayBuilder job = Json.createArrayBuilder();
			job.add(mesPosts);
			request.setAttribute("posts", job.build());

			this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);

		} catch (IOException | InterruptedException e) {
			System.out.println("Erreur !! Lors de récuperation des données");
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
