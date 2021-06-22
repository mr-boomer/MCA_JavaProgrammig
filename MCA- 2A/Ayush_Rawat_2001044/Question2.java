public abstract class Person {
	private String person_name;
	private int id;
	public Person(String a, int b){
		person_name = a;
		id = b;
	}
	abstract void setDetails(String name, int id, double salary, int joining_year);
}

public class Employee inherits Person {
	private double salary;
	private int joining_year;
	public Employee(double a, int b){
		salary = a;
		joining_year = b;
	}
	public void setDetails(String name, int id, double salary, int joining_year){
		if(id <= 0){
			System.out.println("Invalid id");
			System.exit(0);
		}
		if(salary < 1000 || salary > 4000){
			System.out.println("Invalid salary");
			System.exit(0);
		}
		if(joining_year <1994 || joining_year > 2021){
			System.out.println("Invalid year of joining");
			System.exit(0);
		}
		this.joining_year = joining_year;
		this.salary = salary;
	}

	public void updateSalary(int years){
		
	}
}
