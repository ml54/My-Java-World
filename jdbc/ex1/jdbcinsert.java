package project2e;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//import com.mysql.cj.protocol.Resultset;

public class jdbcinsert {
	int id;
	String title;
	Connection con;
	Scanner s;

	jdbcinsert() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection Established");
	}

	public void jdbci() throws Exception {

//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver loaded");

		// Connection con = DriverManager.getConnection()
		con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
		System.out.println("Connection Established");

		Scanner s = new Scanner(System.in);
		System.out.println("enter id:");
		id = s.nextInt();

		s.nextLine();
		System.out.println("enter title:");
		String title = s.nextLine();

		System.out.println("enter body:");
		String body = s.nextLine();

		String sql = "Insert into posts values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, title);
		pst.setString(3, body);
		int i = pst.executeUpdate();
		System.out.println("rows affected:" + i);
	}

	public void jdbcdel() throws SQLException {
		s = new Scanner(System.in);
		System.out.println("enter id to delete:");
		id = s.nextInt();
		String Query = "delete from posts where id = " + id + " ";
		PreparedStatement pst = con.prepareStatement(Query);
		int res = pst.executeUpdate(Query);
		System.out.println("Rows affected" + res);
	}

	public void jdbcupdate() throws SQLException {
		s = new Scanner(System.in);
		System.out.println("enter title to Update:");
		title = s.nextLine();
		
		System.out.println("enter id to Update:");
		id = s.nextInt();
		
		String sq = "UPDATE posts SET title = ? where id = ? ";
		PreparedStatement ps = con.prepareStatement(sq);
		ps.setString(1, title);
		ps.setInt(2, id);
		// pst.setString(3, body);
		int i = ps.executeUpdate();
		System.out.println("rows affected:" + i);

	}

	public void fetch() throws Exception {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from posts");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " ," + rs.getString(3));
		}
	}
}
