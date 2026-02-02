package com.employeemanagementsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		System.out.println("================ Employee Management System ===============\n");
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Ram", 25, "Male", "Technical", 2022, 40000.0),
				new Employee(102, "Priya", 24, "Female", "HR", 2020, 60000.0),
				new Employee(103, "Rajeev", 23, "Male", "Sales", 2023, 50000.0),
				new Employee(104, "Alexa", 25, "Female", "Technical", 2024, 40000.0),
				new Employee(105, "Aniket", 26, "Male", "Executive", 2019, 90000.0),
				new Employee(106, "Sneha", 25, "Female", "Executive", 2022, 90000.0),
				new Employee(107, "Vikas", 24, "Male", "Sales", 2023, 50000.0),
				new Employee(108, "Amit", 21, "Male", "Product Development", 2025, 40000.0),
				new Employee(109, "Bob", 26, "Male", "HR", 2019, 60000.0),
				new Employee(110, "Ananya", 28, "Female", "HR", 2014, 60000.0)
				);
		
		// Number of Male and Female Employee
		System.out.print("Gender Count :");
		Map<String, Long> genderCount = employees.stream()
				                                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);
		System.out.println("------------------------------------------------------------------\n");
		
		
		// Name of the Departments
		System.out.println("Name of All Departments :");
	    employees.stream()
	             .map(Employee::getDepartment)
	             .distinct()
	             .forEach(System.out::println);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    
	    //Average Age of male and female employees
	    System.out.print("Average age of male and female employee : ");
	    Map<String, Double> avgAge = employees.stream()
	    		                              .collect(Collectors.groupingBy(Employee::getGender, 
	    		                            		  Collectors.averagingInt(Employee::getAge)));
	    System.out.println(avgAge);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    
	    //Highest Paid employee in the organization
	    System.out.print("Highest Paid Salary : ");
	    Optional<Employee> highestPaidEmployee = employees.stream()
	    		                                          .max(Comparator.comparingDouble(Employee::getSalary));
	    System.out.println(highestPaidEmployee);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    
	    // Name all employee who have joined after 2015
	    System.out.print("Name of the Employee who Joined after 2015 :");
	    employees.stream()
	             .filter(e -> e.getYearOfJoining() > 2015)
	             .forEach(System.out::println);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    
	    //Number of all employees in each department
	    System.out.print("Number of all employees of each department :");
	    Map<String, Long> numberOfEmployee = employees.stream()
	    		                                      .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
	    System.out.println(numberOfEmployee); 
	    System.out.println("------------------------------------------------------------------\n");
	    
	    
	    // Average Salary of each Department
	    System.out.print("Average Salary of each department :");
	    Map<String, Double> avgSalary = employees.stream()
	    		                                 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	    System.out.println(avgSalary);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    // youngest male employee
	    System.out.println("Youngest Male Employee in the product development department : ");
	    Optional<Employee> youngestMale = employees.stream()
	    		                                   .filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
	    		                                   .min(Comparator.comparingInt(Employee::getAge));
	    System.out.println(youngestMale);
	    System.out.println("------------------------------------------------------------------\n");
	    
	    //Most Working Experienced Employee in the Organization
	    System.out.println("Most Working Experienced Employee in the Organization : ");
	    Optional<Employee> mostExperienced =  employees.stream()
	             .min(Comparator.comparingInt(Employee::getYearOfJoining));
	    System.out.println(mostExperienced);
	    
	}

}
