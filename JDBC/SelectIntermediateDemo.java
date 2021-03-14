package org.wolf.jdbcDemo;

import java.sql.*;
import java.util.*;

public class SelectIntermediateDemo {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Scanner read = new Scanner(System.in);
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "vvreddy", "root")) {
			System.out.println("Enter your customer id:");
			intermediateSelect(conn, read.nextInt());
		}
	}

	private static void intermediateSelect(Connection conn, int custID) throws SQLException {
		try (PreparedStatement pst = conn
				.prepareStatement("SELECT * FROM BANK_CUSTOMER WHERE BANK_CUSTOMER.CUST_ID = ?")) {
			pst.setInt(1, custID);

			System.out.println("Fetched " + pst.executeUpdate() + " rows.");

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				System.out.println("Your details are:");
				System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s%n", rs.getInt("CUST_ID"),
						rs.getString("CUST_FNAME"), rs.getString("INITIALS"), rs.getString("CUST_LNAME"),
						rs.getString("CUST_SEX"), rs.getDate("CUST_DOB"), rs.getString("CUST_TYPE"));
			}

		}

	}
}
