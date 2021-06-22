abstract class Person {
	
	String person_name;
	int id;
	
	public Person(String person_name, int id) {
		
		this.person_name = person_name;
		this.id = id;
	}
	
	abstract void setDetails(String name, int id, double salary, int joining_year);
}
class InvlaidID extends Exception {
	
}
class InvalidSalary extends Exception {
	
}
class InvalidJoin extends Exception {
	
}

class Employee extends Person {
	double salary;
	int joining_year;
	
	Employee(double salary, int joining_year) {
		super(null, 0);
		this.salary = salary;
		this.joining_year = joining_year;
	}
	
	void setDetails(String name, int id, double salary, int joining_year) {
		try {
			if(id < 0 || id == 0) {
				throw new InvlaidID();
			} else {
				this.id = id;
			}
			if(salary < 1000 || salary > 4000) {
				throw new InvalidSalary();
			}
		} catch(InvlaidID e) {
			System.out.println("Invalid ID");
		} catch(InvalidSalary e) {
		    System.out.println("InvalidSalary");
		}
	}
}

public class EmployeeMain {
	public static void main(String args[]) {
		Employee emp1 = new Employee(2000, 1221);
		emp1.setDetails("Abh", 1, 2000, 5000);
	}
}