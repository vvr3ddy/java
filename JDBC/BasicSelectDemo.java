package org.wolf.jdbcDemo;

/*
 * Step 1: Import sql packages
 */
import java.sql.*;

public class BasicSelectDemo {
	public static void main(String[] args) throws SQLException {

		// Step 2: Register driver

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		// Step 3: Establish a connection

		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "vvreddy", "root")) {
			// Step 4: Process Query
			basicSelect(conn);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void basicSelect(Connection conn) throws SQLException {
		try (Statement st = conn.createStatement()) {
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_CUSTOMER");
			System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s%n", "CUST_ID", "CUST_FNAME", "INITIALS",
					"CUST_LNAME", "CUST_SEX", "CUST_DOB", "CUST_TYPE");
			while (rs.next()) {
				System.out.printf("%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s\t%-20s%n", rs.getInt("CUST_ID"),
						rs.getString("CUST_FNAME"), rs.getString("INITIALS"), rs.getString("CUST_LNAME"),
						rs.getString("CUST_SEX"), rs.getDate("CUST_DOB"), rs.getString("CUST_TYPE"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
