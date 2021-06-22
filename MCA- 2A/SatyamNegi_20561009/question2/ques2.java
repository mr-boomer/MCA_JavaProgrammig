 abstract class Person{  
	String person_name;
	int id;
   Person(){System.out.println("person created");}  
   abstract void setDetails();
   String name="satyam ";
   int id= 100;
   double salaray=54000.00;
   int jioning_year=2021;  
    
 }  

 class Employee extends Person{  
   double salaray=54000.00;
   int jioning_year=2021;  

 void setDetails(){System.out.println("salary"+salary+"date"+jioning_year);}  
 }  

 class TestAb{  
 public static void main(String args[]){  
  Person obj = new Employee();  
  obj.setDetails();  
  
   
 }  
}  
