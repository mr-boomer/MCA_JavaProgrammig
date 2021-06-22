import java.util.*;
abstract class Person
{
	String person_name;
	int id;
	abstract void setDetails(String person_name,int id,double salary,int joining_year);
	Person(String person_name,int id)
	{
		this.person_name=person_name;
		this.id=id;
	}
}
 class Employee extends Person {
     double Salary;
     int JY;

    public Employee(String person_name, int id, double salary, int JY) {
        super(person_name, id);
        Salary = salary;
        this.JY = JY;
    }

    void setDetails(String name, int id, double salary, int jy) {
        if (id <= 0) {
            System.out.println("Invalid Id");
        }
        if (salary < 1000 || salary > 4000) {
            System.out.println("Invalid Salary");
        }
        int x=jy;
        int count=0;
        while(x>0)
        {
            x/=10;
            count++;
        }
        if(count!=4||jy<=1994||jy>=2021)
        {
            System.out.println("Invalid year of Joining");
        }
        super.person_name=name;
        super.id=id;
        Salary=salary;
        JY=jy;
    }
    void updateSalary(int y){
        if(y==4) {
            this.Salary = this.Salary + this.Salary * 0.05;
            System.out.println("New salary is"+this.Salary);
        }
        if (y>5&&y<10) {
            this.Salary = this.Salary + this.Salary * 0.09;
            System.out.println("New salary is"+this.Salary);
        }if(y>10) {
            this.Salary = this.Salary + this.Salary * 0.15;
            System.out.println("New salary is"+this.Salary);
        }
    }

    public static void main(String[] args)throws Exception
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the person name");
        String name=sc.nextLine();
        System.out.println("Enter person id");
        int id=sc.nextInt();
        System.out.println("Enter Salary");
        double s=sc.nextDouble();
        System.out.println("Enter year of joining");
        int yj=sc.nextInt();
        System.out.println("Enter total years");
        int y=sc.nextInt();
        Employee e=new Employee(name,id,s,yj);
        e.setDetails(name,id,s,yj );
        e.updateSalary(y);
    }
}