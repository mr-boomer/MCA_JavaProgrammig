package lab;

abstract class Person {
	  private String person_name;
	  private int id;
	  public abstract void setDetails(int id, String name,  double salary, int joiningYear);
	}

	class Employee extends Person {
	    double salary;
	    int joiningYear;
	    int id;
	    String name;
	    
	  Employee(int id, String name, double salary, int joiningYear){
	    setDetails(id, name, salary, joiningYear);
	  }
	  

	  public void setDetails(int id, String name,  double salary, int joiningYear) {
	    if(id <=0) {
	        
	    }
	    
	    if(salary < 1000 || salary > 4000) {
	        
	    }
	    
	    if(joiningYear <1994 || joiningYear > 2021) {
	        
	    }
	    this.id = id;
	    this.name = name;
	    this.salary = salary;
	    this.joiningYear = joiningYear;
	  }
	  

	  public void updateSalary(int years) {
	      if(2021 - joiningYear > 10) {
	          this.salary = ((15 / 100) * this.salary ) + this.salary;
	      } else if(2021 - joiningYear > 5) {
	          this.salary = ((5 / 100) * this.salary ) + this.salary;
	      } else if(2021 - joiningYear > 3) {
	          this.salary = ((3 / 100) * this.salary ) + this.salary;
	      }
	  }
	  
	  
	}

	class Main {
	  public static void main(String[] args) {
	    Employee emp = new Employee(1, "Ankit", 20000, 2010);
	    
	    System.out.println(emp.id);
	    System.out.println(emp.name);
	    System.out.println(emp.salary);
	    System.out.println(emp.joiningYear);
	  }
	}
