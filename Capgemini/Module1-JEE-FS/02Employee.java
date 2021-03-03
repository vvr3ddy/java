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
			if (String.valueOf(employee.employeeID).isEmpty()||employee.employeeID <= 100 ||) {
				throw new InvalidEmployeeException("Employee id invalid");
			if (employee.employeeName.isEmpty()||employee.employeeName.length() < 3) {
				throw new InvalidEmployeeException("Employee name invalid");
			}
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
