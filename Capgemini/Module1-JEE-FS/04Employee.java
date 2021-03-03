class Employee {
	String empName;
	String empID;
	String empDept;
	int salary;

	public Employee(String empN, String empI, String empD, int sal) {
		this.empName = empN;
		this.empID = empI;
		this.empDept = empD;
		this.salary = sal;
	}
}

class EmployeeDetails {
	public Employee getEmployeeInfo(String str) {
		String[] s1 = str.split("ID");
		String t1 = String.join(" ", s1);
		s1 = t1.split("DT");
		t1 = String.join(" ", s1);
		s1 = t1.split("CTC");
		t1 = String.join(" ", s1);
		String[] res = t1.split(" ");
		String s = res[3];
		String[] salS = s.split("");
		String salary = salS[0]+"00000";
		int sal = Integer.valueOf(salary);
			
		Employee e = new Employee(res[0], res[1], res[2], sal);
		return e;
	}

	public String getEmployeeTaxSlab(Employee e) {
		int Sal = e.salary;
		if (Sal > 1000000) {
			return "High";
		} else if (Sal <= 1000000 && Sal >= 800000) {
			return "Medium";
		} else if (Sal >= 500000 && Sal <= 800000) {
			return "Low";
		}
		else {
			return "None";
		}
	}
}
