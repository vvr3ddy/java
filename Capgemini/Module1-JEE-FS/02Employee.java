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
			if (employee.employeeName.length() < 3 || employee.employeeName.isEmpty()) {
				throw new InvalidEmployeeException("Employee name invalid");
			}
			if (employee.employeeID <= 100 || String.valueOf(employee.employeeID).isEmpty()) {
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
