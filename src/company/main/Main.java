package company.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import company.main.classies.Employee;
import company.main.classies.WorkingRole;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee vittorio = new Employee("Vittorio", WorkingRole.Role.Sellers, 500.00f, 15000.00f);
		Employee teresa = new Employee("Teresa", WorkingRole.Role.Technician, 1400.00f);
		Employee virna = new Employee("Virna", WorkingRole.Role.Sellers, 500.00f, 17000.00f);
		Employee mario = new Employee("Mario", WorkingRole.Role.Manager, 1500.00f, (Set<Employee>) new HashSet<Employee>(Arrays.asList(vittorio, teresa)));
		Employee maria = new Employee("Maria", WorkingRole.Role.Manager, 1500.00f, (Set<Employee>) new HashSet<Employee>(Arrays.asList(mario, virna)));
		
		float totalSalary = 0;
		totalSalary += vittorio.salaryCalculation();
		totalSalary += teresa.salaryCalculation();
		totalSalary += virna.salaryCalculation();
		totalSalary += mario.salaryCalculation();
		totalSalary += maria.salaryCalculation();
		
		System.out.println("Total Company salary = " + totalSalary);
	}

}
