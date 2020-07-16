package core_java_c_examples;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Employee {
	private int empno;
	private String ename;
	private float salary;

	public Employee(int empno, String ename, float salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empno != other.empno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}

}

public class SetEmployeeTest {

	@Test
	public void checkUniqueEmployees() throws IOException {

		Set<Employee> set = Files.readAllLines(Paths.get("resources/employee.txt")).stream().map(l -> convert(l))
				.collect(Collectors.toSet());
		Assertions.assertEquals(4, set.size());
	}

	private Employee convert(String l) {
		String[] arr = l.split(",");
		int empno = Integer.parseInt(arr[0]);
		String ename = arr[1];
		float salary = Float.parseFloat(arr[2]);
		return new Employee(empno, ename, salary);
	}

}
