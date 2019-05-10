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

@WebServlet("/Class1")
public class Class1 extends HttpServlet {
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
		
		
		try {
			
			PreparedStatement pst = con.prepareStatement ("select password from login where username = ?") ;
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next() && password.equals(rs.getString(1)))
			{
				RequestDispatcher rd = request.getRequestDispatcher("home.html");
				rd.forward(request, response); }
			else {
				out.println("<h2>Login not successful</h2>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response); }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
