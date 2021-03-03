package Main01;

import java.util.*;

public class Source {
	public static void main(String[] args) throws Exception {
		Employee e = new Employee(null, null);
		ExceptionCheck ex = new ExceptionCheck();
		ex.validateEmployee(e);
	}
}

class Employee {
	String employeeName;
	Integer employeeID;
	String status;

	public Employee(Integer id, String name) {
		this.employeeName = name;
		this.employeeID = id;
	}

}

class ExceptionCheck {
	public String validateEmployee(Employee employee) throws Exception {

		try {
			if (employee.employeeName == null || employee.employeeName.length() < 3) {
				throw new InvalidEmployeeException("Employee name invalid");
			} if (employee.employeeID == null || employee.employeeID <= 100) {
				throw new InvalidEmployeeException("Employee id invalid");
			} else if (employee.employeeName.length() > 3 && employee.employeeID > 100) {
				employee.status = "success";
			}
		} catch (InvalidEmployeeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("unknown exception occurred");
			throw e;
		}
		return employee.status;
	}
}

class InvalidEmployeeException extends Exception {
	InvalidEmployeeException(String msg) {
		super(msg);
	}
}
