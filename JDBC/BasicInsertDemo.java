package org.wolf.jdbcDemo;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import oracle.jdbc.driver.OracleDriver;

public class BasicInsertDemo {
	public static void main(String[] args) throws SQLException, ParseException {
		DriverManager.registerDriver(new OracleDriver());
		Scanner read = new Scanner(System.in);
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "vvreddy", "root")) {
			List<Object> custDetails = new ArrayList<>();
			System.out.println("Enter your details:");
			System.out.println("Enter your ID:");
			custDetails.add(read.nextLine());
			System.out.println("Enter your First Name:");
			custDetails.add(read.nextLine());
			System.out.println("Enter your Initials:");
			custDetails.add(read.nextLine());
			System.out.println("Enter your Last Name:");
			custDetails.add(read.nextLine());
			System.out.println("Enter your Gender:");
			custDetails.add(read.nextLine());
			System.out.println("Enter your Date of Birth(YYYY-MM-DD):");
			String dob = read.nextLine();
			java.sql.Date sDate = java.sql.Date.valueOf(dob);
			custDetails.add(sDate);

			System.out.println("Enter your Type of account (IND/CORP):");
			custDetails.add(read.nextLine());
			basicInsert(conn, custDetails);
		}
	}

	private static void basicInsert(Connection conn, List<Object> custDetails) throws SQLException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		try (PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_CUSTOMER VALUES(?,?,?,?,?,?,?)")) {
			pst.setInt(1, Integer.parseInt(custDetails.get(0).toString()));
			pst.setString(2, custDetails.get(1).toString());
			pst.setString(3, custDetails.get(2).toString());
			pst.setString(4, custDetails.get(3).toString());
			pst.setString(5, custDetails.get(4).toString());
			pst.setDate(6, (java.sql.Date) custDetails.get(5));
			pst.setString(7, custDetails.get(6).toString());
			int result = pst.executeUpdate();
			if (result > 0)
				System.out.println("Successfully added column:");
			else
				System.out.println("Error adding to db");

		} catch (Exception e) {
			System.out.println("Encountered an error while adding data to db");
			e.printStackTrace();
		}

	}
}
