/*
Create a class Person with a member variable name. Save it in a file called Person.java. Create a class called Employee that will inherit the Person class. The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number. 
	Your class should have the necessary constructors and getter / setter methods.
	Create another class called TestEmployee containing a main method to fully test your class definition.
*/

public class TestEmployee
{
	public static void main(String[] args)
{
	Employee emp = new Employee("SAGAR BHATIA", 7000000, 2020,"18abd9023");
	System.out.println(emp);
}

}
