
		package com.servlet;

		import java.io.IOException;
		import java.io.PrintWriter;

		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

         /**
         * Servlet implementation class OutcomeServlet
          */
		@WebServlet("/OutcomeServlet")
		public class OutcomeServlet extends HttpServlet 
		{
			public void service(HttpServletRequest req, HttpServletResponse res)
			{
				 try
				 {
					 res.setContentType("text/html");
					 
					 PrintWriter out = res.getWriter();
					 
					    out.println("<html>"
					    		+"<head>"
					    		+"<link href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css' rel='stylesheet'></link>"
					    		+ "<title>Bootstrap Vertical Form Layout</title>"
					    		+ "</head>"
					    		+ "<body>"
					    		
					    		+"<div class='m-4'>"
					    		
					    		+ "<form>"
					    		
					    		+"<div class='mb-3'>"
					    		+"<label class='form-label' for='inputEmail'>Email:</label>"
					    		+"<input type='email' class='form-control' id='inputEmail' placeholder='Email' required></input>"
					    		+ "</div>"
					    		
	                            +"<div class='mb-3'>"
	                            +"<label class='form-label' for='inputPassword'>Password:</label>"
                                +"<input type='password' class='form-control' id='inputPassword' placeholder='Password' required></input>"
                                + "</div>"
                                
                                +"<div class='mb-3'>"
                                +"<div class='form-check'>"
                                +"<input class='form-check-input' type='checkbox' id='checkRemember'>"
                                +"<label class='form-check-label' for='checkRemember'>Remember Me</label>"
                                + "</div>"
                                + "</div>"
                                
                                +"<button type='submit' class='btn btn-primary'>Sign In</button"
                                
					    		+ "</form>"
					    		
					    		+"</div>"
					    		
					    		+ "</body>"
					    		+ "</html>");
					    
					     out.close();
					 
				 }
				 
				 catch(Exception ee)
				 {
					 System.out.println("Exception Message is: "+ee);
				 }
				 
				 
			}
		
		}
