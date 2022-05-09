package Web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import Model.JsonClient;
import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonReader;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = { "/list", "/login", "/register", "/logout", "/rewatch", "/userPage", "/replist", "/edit",
		"/add", "/edit/*", "/search", "/them", "/report", "/search/*" , "/contact" , "/about","/getUser","/search1"})
public class WikiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WikiServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JsonClient jc = new JsonClient();
		JsonReader jr;
		try {
			// jr = Json.createReader(new
			// StringReader(jc.get("http://127.0.0.1:8000/api/users")));
			// JsonArray weaker = jr.readArray();
			// response.getWriter().append(weaker.toString());

			switch (request.getServletPath()) {
			case "/list":

				// request.setAttribute("weaker", weaker);
				String mesPosts = jc.get("http://127.0.0.1:8000/accueil");
				String mesThematiques = jc.get("http://127.0.0.1:8000/api/them");

				JsonReader Preader = Json.createReader(new StringReader(mesPosts));
				JsonReader Treader = Json.createReader(new StringReader(mesThematiques));

				JsonArray arrJson1 = Preader.readArray().asJsonArray();
				JsonArray arrJson2 = Treader.readArray().asJsonArray();

				request.setAttribute("posts", arrJson1);
				request.setAttribute("thematiques", arrJson2);
				// System.out.println(arrJson.);

				this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
				// response.sendRedirect("/Front/View/index.jsp");
				break;
			case "/userPage":
				HttpSession szs = request.getSession();
				String elm = (String) szs.getAttribute("user");
//					response.getWriter().append(elm.toString());
				System.out.println("elm=" + elm);

				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/" + elm)));
				JsonArray weaker = jr.readArray();
				System.out.println("weaker" + weaker);
				request.setAttribute("weaker", weaker);
				// request.setAttribute("weaker", weaker);
				String mesPosts2 = jc.get("http://127.0.0.1:8000/accueil");
				String mesThematiques2 = jc.get("http://127.0.0.1:8000/api/them");

				JsonReader Preader2 = Json.createReader(new StringReader(mesPosts2));
				JsonReader Treader2 = Json.createReader(new StringReader(mesThematiques2));

				JsonArray arrJson12 = Preader2.readArray().asJsonArray();
				JsonArray arrJson22 = Treader2.readArray().asJsonArray();

				request.setAttribute("posts", arrJson12);
				request.setAttribute("thematiques", arrJson22);
				// System.out.println(arrJson.);

				this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
				break;
			case "/register":
				this.getServletContext().getRequestDispatcher("/view/Register.jsp").forward(request, response);
				break;
			case "/replist":
				HttpSession iaas = request.getSession();
				String mkdir = (String) iaas.getAttribute("user");
				System.out.println("rm=" + mkdir);
				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/" + mkdir)));
				JsonArray re = jr.readArray();
				System.out.println("re" + re);
				request.setAttribute("re", re);
				String a = jc.get("http://127.0.0.1:8000/api/all");
				if (a.equals("[]")) {
					request.setAttribute("msg", "No reports Found!");
					this.getServletContext().getRequestDispatcher("/view/replist.jsp").forward(request, response);
				} else {
					jr = Json.createReader(new StringReader(a));
					JsonArray rek = jr.readArray();
					System.out.println("rek" + rek);
					request.setAttribute("rek", rek);
					this.getServletContext().getRequestDispatcher("/view/replist.jsp").forward(request, response);
				}
				break;
			case "/login":
				this.getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
				break;
			case "/them":
				HttpSession saas = request.getSession();
				String el = (String) saas.getAttribute("user");
//					response.getWriter().append(elm.toString());
				System.out.println("el=" + el);

				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/" + el)));
				JsonArray weaer = jr.readArray();
				System.out.println("weaker" + weaer);
				request.setAttribute("wer", weaer);
				String j = jc.get("http://127.0.0.1:8000/api/them");
				jr = Json.createReader(new StringReader(j));
				JsonArray weker = jr.readArray();
				System.out.println("weker" + weker);
				request.setAttribute("weker", weker);
				this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request, response);
				break;
			case "/report":
				HttpSession paas = request.getSession();
				String rm = (String) paas.getAttribute("user");
				System.out.println("rm=" + rm);
				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/" + rm)));
				JsonArray rep = jr.readArray();
				System.out.println("rep" + rep);
				request.setAttribute("rep", rep);
				if (request.getParameter("id") != null) {
					String id = request.getParameter("id");
					System.out.println("id" + id);
					request.setAttribute("id", id);
				}
				this.getServletContext().getRequestDispatcher("/view/report.jsp").forward(request, response);
				break;
			case "/logout":

				HttpSession ss = request.getSession();
				String em = (String) ss.getAttribute("user");
				System.out.println(em);
				JsonObjectBuilder job = Json.createObjectBuilder();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				job.add("Date", dtf.format(LocalDateTime.now()));
				job.add("EstConnecté", false);
				jc.put("http://127.0.0.1:8000/api/session/" + em, job.build().toString());
				ss.invalidate();
				response.sendRedirect("list");
				break;
			case "/rewatch":
				this.getServletContext().getRequestDispatcher("/view/Rematch.jsp").forward(request, response);
				break;
			case "/edit":
				String id = request.getPathInfo().toString().substring(1, request.getPathInfo().length());
				System.out.println(id);

				// request.setAttribute("weaker", weaker);
				String mesPosts1 = jc.get("http://127.0.0.1:8000/accueil");

				JsonReader reader1 = Json.createReader(new StringReader(mesPosts1));
				JsonArray arrJson11 = reader1.readArray().asJsonArray();

				for (int i = 0; i < arrJson11.size(); i++) {
					if (arrJson11.getJsonObject(i).getString("_id").equals(id)) {
						request.setAttribute("post", arrJson11.getJsonObject(i));
					}
				}
				this.getServletContext().getRequestDispatcher("/view/ModifierPage.jsp").forward(request, response);
				break;
			case "/add":
				this.getServletContext().getRequestDispatcher("/view/AddPage.jsp").forward(request, response);
				break;
			case "/search1":
				String rechAq=request.getParameter("recherche");

				System.out.println(rechAq);
				String mesPostssq = jc.get("http://127.0.0.1:8000/api/searchpg/"+rechAq);
				String mesThematiquessq = jc.get("http://127.0.0.1:8000/api/them");

				JsonReader Preadersm = Json.createReader(new StringReader(mesPostssq));
				JsonReader Treadersm = Json.createReader(new StringReader(mesThematiquessq));

				JsonArray arrJson1s2 = Preadersm.readArray().asJsonArray();
				JsonArray arrJson2s2 = Treadersm.readArray().asJsonArray();

				request.setAttribute("posts", arrJson1s2);
				request.setAttribute("thematiques", arrJson2s2);
				this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);

				break;
				
			case "/search":
				String rechA = request.getPathInfo().toString().substring(7, request.getPathInfo().length());

				System.out.println(rechA);
				String mesPostss = jc.get("http://127.0.0.1:8000/api/searchpg/" + rechA);
				String mesThematiquess = jc.get("http://127.0.0.1:8000/api/them");

				JsonReader Preaders = Json.createReader(new StringReader(mesPostss));
				JsonReader Treaders = Json.createReader(new StringReader(mesThematiquess));

				JsonArray arrJson1s = Preaders.readArray().asJsonArray();
				JsonArray arrJson2s = Treaders.readArray().asJsonArray();

				request.setAttribute("posts", arrJson1s);
				request.setAttribute("thematiques", arrJson2s);
				this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);

				break;
			case "/about":
				this.getServletContext().getRequestDispatcher("/view/About.jsp").forward(request, response);
				break;
			case "/contact":
				this.getServletContext().getRequestDispatcher("/view/Contact.jsp").forward(request, response);
				break;
			case "/getUser":
				
				HttpSession Caas = request.getSession();
				String rmdir = (String)Caas.getAttribute("user");
				System.out.println("rm=" + rmdir);
				jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/" + rmdir)));
				JsonArray rea = jr.readArray();
				System.out.println("re" + rea);
				request.setAttribute("rae", rea);
				String ab =	jc.get("http://127.0.0.1:8000/api/getuser");
				if(ab.equals("[]")) {
					request.setAttribute("msg", "No users Found!");
					this.getServletContext().getRequestDispatcher("/view/ListUser.jsp").forward(request, response);
				}else {				
				jr = Json.createReader(new StringReader(ab));
				JsonArray rickk = jr.readArray();
				System.out.println("rick"+rickk);
				request.setAttribute("rick", rickk);
				this.getServletContext().getRequestDispatcher("/view/ListUser.jsp").forward(request, response);
				}
				break;
				
				
			}
		} catch (IOException | InterruptedException e) {

			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			JsonClient jc = new JsonClient();

			JsonReader jr;
			switch (request.getServletPath()) {
			case "/register":
				System.out.println("----->" + request.getParameter("username"));
				if (request.getParameter("username") != null && request.getParameter("email") != null
						&& request.getParameter("password") != null) {
					PrintWriter out = response.getWriter();
					System.out.println(request.getParameter("email"));
					String jj = jc.get("http://127.0.0.1:8000/api/user/" + request.getParameter("email"));
					System.out.println(jj);
					if (jj.equals("[]")) {
						JsonObjectBuilder job = Json.createObjectBuilder();
						job.add("username", request.getParameter("username"));
						job.add("email", request.getParameter("email"));
						job.add("password", request.getParameter("password"));
						job.add("estAdmin", false);
						jc.post("http://127.0.0.1:8000/api/register", job.build().toString());
						response.sendRedirect("login");
					} else {
//					PrintWriter out = response.getWriter();			
//					//out.println("");
//					request.setAttribute("msg", "empty inputs!");
//						out.println("");
						request.setAttribute("msg", "Email already exist!");
						this.getServletContext().getRequestDispatcher("/view/Register.jsp").forward(request, response);
					}
				}
				break;
			case "/report":
				System.out.println("----->" + request.getParameter("page"));
				if (request.getParameter("username") != null && request.getParameter("page") != null
						&& request.getParameter("contenu") != null) {
					PrintWriter out = response.getWriter();
					String aqqq = request.getParameter("page");
					String chof = aqqq.replaceAll(" ", "%20");
					String jj = jc
							.get("http://127.0.0.1:8000/api/rapp/" + request.getParameter("username") + "/" + chof);
					System.out.println(jj);
					if (jj.equals("[]")) {
						JsonObjectBuilder job = Json.createObjectBuilder();
						job.add("Utilisateur", request.getParameter("username"));
						job.add("Page", request.getParameter("page"));
						job.add("Contenu", request.getParameter("contenu"));
						jc.post("http://127.0.0.1:8000/api/rapp", job.build().toString());
						request.setAttribute("msg", "Reported");
						this.getServletContext().getRequestDispatcher("/view/report.jsp").forward(request, response);
					} else {
//					PrintWriter out = response.getWriter();			
//					//out.println("");
//					request.setAttribute("msg", "empty inputs!");
//						out.println("");
						request.setAttribute("msg", "You have reported this page");
						this.getServletContext().getRequestDispatcher("/view/report.jsp").forward(request, response);
					}
				}
				break;
			case "/login":
				if (request.getParameter("login") != null && request.getParameter("password") != null) {
					String jj = jc.get("http://127.0.0.1:8000/api/login/" + request.getParameter("login") + "/"
							+ request.getParameter("password"));
					System.out.println(request.getParameter("login"));
					System.out.println("----->" + jj);

					if (jj.equals("")) {
						request.setAttribute("msg", "Email or Password are wrong!");
						this.getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
					} else {
						HttpSession ss = request.getSession();
						ss.setAttribute("user", request.getParameter("login"));
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						JsonObjectBuilder job = Json.createObjectBuilder();
						job.add("Date", dtf.format(LocalDateTime.now()));
						job.add("EstConnecté", true);

						jc.put("http://127.0.0.1:8000/api/session/" + request.getParameter("login"),
								job.build().toString());

						response.sendRedirect("userPage");
					}
				} else {
					response.sendRedirect("login");
				}
				break;
			case "/rewatch":
				if (request.getParameter("email") != null && request.getParameter("password") != null) {
					PrintWriter out = response.getWriter();
					System.out.println(request.getParameter("email"));
					String jj = jc.get("http://127.0.0.1:8000/api/user/" + request.getParameter("email"));
					System.out.println(jj);
					if (jj.equals("[]")) {
//						out.println("");
						request.setAttribute("msg", "email not found!");
						this.getServletContext().getRequestDispatcher("/view/Rematch.jsp").forward(request, response);

					} else {

						JsonObjectBuilder job = Json.createObjectBuilder();
						job.add("password", request.getParameter("password"));
						jc.put("http://127.0.0.1:8000/api/rewatch/" + request.getParameter("email"),
								job.build().toString());
						response.sendRedirect("login");
					}
				}
				break;
			case "/add":

				if (request.getParameter("Titre") != null && request.getParameter("Thematique") != null
						&& request.getParameter("Description") != null && request.getParameter("Contenu") != null) {
					JsonObjectBuilder job1 = Json.createObjectBuilder();
					job1.add("Titre", request.getParameter("Titre"));
					job1.add("Thematique", request.getParameter("Thematique"));
					job1.add("Description", request.getParameter("Description"));
					job1.add("Contenu", request.getParameter("Contenu"));
					job1.add("Media", request.getParameter("Media"));
					System.out.println(job1.build().toString());
					jc.post("http://127.0.0.1:8000/api/pages/", job1.build().toString());

					response.sendRedirect("list");
				}

				break;
			case "/edit":
				System.out.println("toto");
				if (request.getParameter("Titre") != null && request.getParameter("Thematique") != null
						&& request.getParameter("Description") != null && request.getParameter("Contenu") != null) {
					System.out.println("toto11");
					JsonObjectBuilder job = Json.createObjectBuilder();
					job.add("_id", request.getParameter("id"));
					job.add("Titre", request.getParameter("Titre"));
					job.add("Thematique", request.getParameter("Thematique"));
					job.add("Description", request.getParameter("Description"));
					job.add("Contenu", request.getParameter("Contenu"));
					job.add("Media", request.getParameter("Media"));
					System.out.println(job.build().toString());
					jc.put("http://127.0.0.1:8000/api/pages/" + request.getParameter("id"), job.build().toString());

					this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
					// response.sendRedirect("/list");
				}

				break;
			case "/them":

				if (request.getParameter("ids") != null && request.getParameter("sous") != null
						&& request.getParameter("color") != null) {
					String a = request.getParameter("sous");
					System.out.println(a);
					if ((request.getParameter("ids") == "")) {
						String aqqq = request.getParameter("sous");
						String and = aqqq.substring(0, 1).toUpperCase() + a.substring(1);
						String chof = and.replaceAll(" ", "%20");
						System.out.println("->---" + chof);
						String jj = jc.get("http://127.0.0.1:8000/api/them/" + chof);
						System.out.println(jj);
						if (jj.equals("[]")) {
							JsonObjectBuilder job = Json.createObjectBuilder();
							job.add("NomThematique", and);
							job.add("Color", request.getParameter("color"));
							jc.post("http://127.0.0.1:8000/api/add", job.build().toString());
							response.sendRedirect("them");

						} else {
							// PrintWriter out = response.getWriter();
							String j = jc.get("http://127.0.0.1:8000/api/them");
							jr = Json.createReader(new StringReader(j));
							JsonArray weker = jr.readArray();
							System.out.println("weker" + weker);
							request.setAttribute("weker", weker);
							request.setAttribute("msg", "Thematiques already exist!");
							this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request,
									response);
						}
					} else {
						String aqqq = request.getParameter("sous");
						String and = aqqq.substring(0, 1).toUpperCase() + a.substring(1);
						String chof = and.replaceAll(" ", "%20");
						System.out.println("->---" + chof);
						String j = jc.get("http://127.0.0.1:8000/api/suzie/" + chof);
						// System.out.println(and);
						if (j.equals("[]")) {
							JsonObjectBuilder job = Json.createObjectBuilder();
							job.add("SousThematique", and);
							job.add("NomThematique", request.getParameter("ids"));
							job.add("Color", request.getParameter("color"));
							jc.post("http://127.0.0.1:8000/api/add", job.build().toString());
							response.sendRedirect("them");
						} else {
							// PrintWriter out = response.getWriter();
							String ja = jc.get("http://127.0.0.1:8000/api/them");
							jr = Json.createReader(new StringReader(ja));
							JsonArray weker = jr.readArray();
							System.out.println("weker" + weker);
							request.setAttribute("weker", weker);
							request.setAttribute("msg", "Sous Thematiques already exist!");
							this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request,
									response);
						}
					}
				}
				break;
			case "/search":

				String rechA = request.getPathInfo().toString().substring(7, request.getPathInfo().length());

				System.out.println(rechA);
				String mesPostss = jc.get("http://127.0.0.1:8000/api/searchpg/" + rechA);
				String mesThematiquess = jc.get("http://127.0.0.1:8000/api/them");

				JsonReader Preaders = Json.createReader(new StringReader(mesPostss));
				JsonReader Treaders = Json.createReader(new StringReader(mesThematiquess));

				JsonArray arrJson1s = Preaders.readArray().asJsonArray();
				JsonArray arrJson2s = Treaders.readArray().asJsonArray();
				
				request.setAttribute("posts", arrJson1s);
				request.setAttribute("thematiques", arrJson2s);
				this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);

				break;

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
