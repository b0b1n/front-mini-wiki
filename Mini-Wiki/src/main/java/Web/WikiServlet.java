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

import org.apache.tomcat.util.digester.Digester;

import Model.JsonClient;
import jakarta.json.Json;
import jakarta.json.JsonArray;
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


@WebServlet(
		urlPatterns = {
				"/list",
				"/login",
				"/register",
				"/logout",
				"/rewatch",
				"/userPage",
				"/them"
		})
public class WikiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public WikiServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonClient jc = new JsonClient();
		JsonReader jr;
		try {
			//jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/users")));
			//JsonArray weaker = jr.readArray();
			//response.getWriter().append(weaker.toString());
			
			switch (request.getServletPath()) {
				case "/list":
					
					//request.setAttribute("weaker", weaker);
					this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
					//response.sendRedirect("/Front/View/index.jsp");
					break;
				case "/userPage":
					HttpSession szs = request.getSession();
					String elm =(String) szs.getAttribute("user");
//					response.getWriter().append(elm.toString());
					System.out.println("chof="+szs.getAttribute("user"));
					System.out.println("elm="+elm);
					
						jr = Json.createReader(new StringReader(jc.get("http://127.0.0.1:8000/api/user/"+elm)));
						JsonArray weaker = jr.readArray();
						System.out.println("weaker"+weaker);
						request.setAttribute("weaker", weaker);
						this.getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
					
						break;
				case"/register":
					this.getServletContext().getRequestDispatcher("/view/Register.jsp").forward(request, response);
					break;
				case"/them":
					String j =	jc.get("http://127.0.0.1:8000/api/them");
					jr = Json.createReader(new StringReader(j));
					JsonArray weker = jr.readArray();
					System.out.println("weker"+weker);
					request.setAttribute("weker", weker);
			
					this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request, response);	
					break;
				case"/login":
					this.getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
					break;
				case "/logout":
				
					HttpSession ss= request.getSession();
					String em =(String) ss.getAttribute("user");
					System.out.println(em);
					JsonObjectBuilder job = Json.createObjectBuilder();
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					job.add("Date",dtf.format(LocalDateTime.now()));
					job.add("EstConnecté", false);
					jc.put("http://127.0.0.1:8000/api/session/"+em, job.build().toString());
					ss.invalidate();
					response.sendRedirect("list");
					break;
				case"/rewatch":
					this.getServletContext().getRequestDispatcher("/view/Rematch.jsp").forward(request, response);
					break;
					
			}
		} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			JsonReader jr;
			JsonClient jc = new JsonClient();
			switch(request.getServletPath()) {
			case "/register":
				System.out.println("----->"+ request.getParameter("username"));
				if(request.getParameter("username") != null  && request.getParameter("email") != null && request.getParameter("password") != null) {
				PrintWriter out = response.getWriter();			
				System.out.println(request.getParameter("email"));
				String jj =	jc.get("http://127.0.0.1:8000/api/user/"+request.getParameter("email"));
				System.out.println(jj);
				if(jj.equals("[]")) {
					JsonObjectBuilder job = Json.createObjectBuilder();
					job.add("username", request.getParameter("username"));
					job.add("email", request.getParameter("email"));
					job.add("password", request.getParameter("password"));
					job.add("estAdmin", false);
					jc.post("http://127.0.0.1:8000/api/register", job.build().toString());
					response.sendRedirect("login");
				}else {
//					PrintWriter out = response.getWriter();			
//					//out.println("");
//					request.setAttribute("msg", "empty inputs!");
//						out.println("");
						request.setAttribute("msg", "Email already exist!");
						this.getServletContext().getRequestDispatcher("/view/Register.jsp").forward(request, response);
						}
				}
				break;
			case "/them":
				
				if(request.getParameter("ids") != null && request.getParameter("sous") != null && request.getParameter("color") != null ) {			
				String a =	request.getParameter("sous");
				System.out.println(a); 
					if((request.getParameter("ids") == "")) {
						String aqqq =	request.getParameter("sous");
						String and = aqqq.substring(0, 1).toUpperCase() + a.substring(1);
						String chof = and.replaceAll(" ", "%20");
						System.out.println("->---"+chof);
						String jj =	jc.get("http://127.0.0.1:8000/api/them/"+chof);
						System.out.println(jj);
						if(jj.equals("[]")){
						JsonObjectBuilder job = Json.createObjectBuilder();
						job.add("NomThematique", and);
						job.add("Color", request.getParameter("color"));
						jc.post("http://127.0.0.1:8000/api/add", job.build().toString());
						response.sendRedirect("them");
						
						}else {
						//PrintWriter out = response.getWriter();	
						String j =	jc.get("http://127.0.0.1:8000/api/them");
						jr = Json.createReader(new StringReader(j));
						JsonArray weker = jr.readArray();
						System.out.println("weker"+weker);
						request.setAttribute("weker", weker);
						request.setAttribute("msg", "Thematiques already exist!");
						this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request, response);
							}
				}else {
						String aqqq =	request.getParameter("sous");
						String and = aqqq.substring(0, 1).toUpperCase() + a.substring(1);
						String chof = and.replaceAll(" ", "%20");
						System.out.println("->---"+chof);
						String j =	jc.get("http://127.0.0.1:8000/api/suzie/"+chof);
						//System.out.println(and);
						if(j.equals("[]")){
							JsonObjectBuilder job = Json.createObjectBuilder();
							job.add("SousThematique", and);
							job.add("NomThematique",request.getParameter("ids") );
							job.add("Color", request.getParameter("color"));
							jc.post("http://127.0.0.1:8000/api/add", job.build().toString());
							response.sendRedirect("them");
						}else {
							//PrintWriter out = response.getWriter();	
							String ja =	jc.get("http://127.0.0.1:8000/api/them");
							jr = Json.createReader(new StringReader(ja));
							JsonArray weker = jr.readArray();
							System.out.println("weker"+weker);
							request.setAttribute("weker", weker);
							request.setAttribute("msg", "Sous Thematiques already exist!");
							this.getServletContext().getRequestDispatcher("/view/Thematique.jsp").forward(request, response);
						}
					}
				}
				
				
				break;
			case "/login":
				if(request.getParameter("login") != null && request.getParameter("password") != null){
				String jj =	jc.get("http://127.0.0.1:8000/api/login/"+request.getParameter("login")+"/"+request.getParameter("password"));
				System.out.println(request.getParameter("login"));
				System.out.println("----->"+jj);
				if(jj.equals("")) {
					request.setAttribute("msg", "Email or Password are wrong!");
					this.getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
				}else {
					HttpSession ss = request.getSession();
					ss.setAttribute("user",request.getParameter("login") );
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					JsonObjectBuilder job = Json.createObjectBuilder();
					job.add("Date",dtf.format(LocalDateTime.now()));
					job.add("EstConnecté", true);
					
					jc.put("http://127.0.0.1:8000/api/session/"+request.getParameter("login"), job.build().toString());
					
					response.sendRedirect("userPage");
					}
			}else {
				response.sendRedirect("login");
			}
				break;
			case "/rewatch":
				if(request.getParameter("email") != null && request.getParameter("password") != null){
					PrintWriter out = response.getWriter();
					System.out.println(request.getParameter("email"));
					String jj =	jc.get("http://127.0.0.1:8000/api/user/"+request.getParameter("email"));
					System.out.println(jj);
					if(jj.equals("[]")) {
//						out.println("");
						request.setAttribute("msg", "email not found!");
						this.getServletContext().getRequestDispatcher("/view/Rematch.jsp").forward(request, response);
					
						
				}else {
					
					JsonObjectBuilder job = Json.createObjectBuilder();
					job.add("password", request.getParameter("password"));
					jc.put("http://127.0.0.1:8000/api/rewatch/"+request.getParameter("email"), job.build().toString());
					response.sendRedirect("login");
				}
				}
				break;
			
			}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


