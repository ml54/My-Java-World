package pac5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con; 
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		

			
			PreparedStatement pst;
			try {
				pst = con.prepareStatement ("Insert into login values (?,?)");
				pst.setString(1, username);
				pst.setString(2, password);
				int rs = pst.executeUpdate();
				System.out.println("the rows affected are "+rs);
			
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
				out.println("<h2>Registration is Completed please login to proceed.</h2>");
			}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


