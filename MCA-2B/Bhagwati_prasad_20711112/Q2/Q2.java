Person.java
public class Person{
public String name;
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public Person(String name){
this.name=name;
}
}
------------------------------------------------------------------------
import java.util.Scanner;
class Employee extends Person
{
double annualSalary;
int doj;
int insurance;
public void setAnnualSalary(double as)
{
Name : Bhagwati Prasad
Roll No. : 2001046
Course : MCA B
annualSalary=as;
}
public double getAnnualSalary()
{
return annualSalary;
}
public void setDoj(int d)
{
doj=d;
}
public int getDoj()
{
return doj;
}
public void setInsurance(int insu)
{
insurance=insu;
}
public int getInsurance(){
return insurance;
}
Employee(String name,double annualSalary,int doj,int
insurance) {
super(name);
this.annualSalary=annualSalary;
this.doj=doj;
this.insurance=insurance;
}
void display()
{
System.out.println("Employee name:"+super.name);
System.out.println("Employee Annual
Salary:"+getAnnualSalary());
System.out.println("Employee Yoj:"+getDoj());
System.out.println("Employee Insurance:"+getInsurance()); }
}
class TestEmployee{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee name:");
String name=sc.nextLine();
System.out.println("Enter Employee Annual Salary:");
double salary=sc.nextDouble();
System.out.println("Enter Employee Year of Joining(YOJ):");
int doj=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee National Insurance:");
int insurance=sc.nextInt();
sc.nextLine();
Employee e=new Employee(name,salary,doj,insurance);
e.display();
}
}
