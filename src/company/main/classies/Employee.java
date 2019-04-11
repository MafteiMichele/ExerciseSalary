package company.main.classies;

import java.util.Set;

import company.main.classies.WorkingRole.Role;

public class Employee {

	protected int id;
	private String name;
	private String surname;
	private WorkingRole.Role role;
	private float salary;
	private float monthlySale;
	private Set<Employee> subordinates;

	public Employee(String name, WorkingRole.Role role, float salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public Employee(String name, WorkingRole.Role role, float salary, float monthlySale) {
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.monthlySale = monthlySale;
	}

	public Employee(String name, WorkingRole.Role role, float salary, Set<Employee> subordinates) {
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.subordinates = subordinates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public WorkingRole.Role getRole() {
		return role;
	}

	public void setRole(WorkingRole.Role role) {
		this.role = role;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getMonthlySale() {
		return monthlySale;
	}

	public void setMonthlySale(float monthlySale) {
		this.monthlySale = monthlySale;
	}

	private Set<Employee> getSubordinates() {
		return subordinates;
	}

	private void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	
	private float getTotalSubordinates() {
		float result = 0;
		for (Employee employee : subordinates) {
			result += employee.salaryCalculation();
		}
		return result;
	} 

	public float salaryCalculation() {

		float result = 0;
		
		if (this.role == Role.Sellers) {
			result = (this.salary + (this.monthlySale * 0.1f));
		}
		
		if (this.role == Role.Technician) {
			result = (this.salary);
		}
		
		if (this.role == Role.Manager) {
			result = (this.salary + (getTotalSubordinates() * 0.005f));
		}
		return result;
			
	}

}
