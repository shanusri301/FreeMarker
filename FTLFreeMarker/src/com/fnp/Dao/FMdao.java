package com.fnp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FMdao {

	private static String uname;
	private static String pwd;
	private static String URL;
	private static String driver;
	static Connection connection;
	static PreparedStatement ps = null;

	public static ArrayList demo() {
		FMbean fm = null;
		//Map<String,Object> model=null;
		ArrayList<FMbean>list= new ArrayList<>();
		try {
			Connection con = getConnection();
			String query = "Select * from person";
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			//model = new HashMap<>();
			while (rs.next()) {
				fm = new FMbean();
				fm.setFirstName(rs.getString("FirstName"));
				fm.setLastName(rs.getString("LastName"));
				fm.setEmail(rs.getString("Email"));
				fm.setDob(rs.getString("BirthDate"));
				fm.setMobile(rs.getString("Mobile"));
				fm.setAddress(rs.getString("Address"));
				fm.setQualification(rs.getString("Qualification"));
				fm.setGender(rs.getString("Gender"));
				fm.setIntrests(rs.getString("Intrest"));
				list.add(fm);
				System.out.println("records"+list);
			}
			//model.put("persondata", list);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return list;
	}

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			URL = "jdbc:mysql://localhost:3306/ajax-json";
			uname = "root";
			pwd = "root";
			connection = DriverManager.getConnection(URL, uname, pwd);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
