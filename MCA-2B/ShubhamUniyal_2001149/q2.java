abstract class Person{  
    String person_name;
    int id;
    setDetails(String name, int id,double salary, int joining_year);{}
    
  Person(String pn ,int id2)
  {
    person_name = pn;
    id = id2;
  }

}  


class Employee extends Person{  
    
    double salary;
    int joining_year;
    
   void setDetails(String name, int id,double salary, int joining_year)
    {
        
        if(id<=0)
        {
            System.out.println("invalid id");
        }
        
        if(salary<1000 || salary>4000)
        {
            System.out.println("invalid salary");
        }
        int num,count=0;
        num=joining_year;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        
        if(count!=4)
        {
             System.out.println("Invalid year of joining");
        }
        else if( joining_year<1994 || joining_year > 2021)
        {
            System.out.println("Invalid year of joining");
        }
        
        
        
        
        
        
        
        
    }
    
    
 void updateSalary(int years)
 {
      System.out.println("Old salary is: "+salary);
    if(years>3)
    {
        salary = salary + (5*salary)/100;
        
    }
    
    if(years>5)
    {
        salary = salary + (9*salary)/100;
        
    }
    
    if(years>10)
    {
        
        salary = salary + (15*salary)/100;
    }
     System.out.println("New salary is: "+salary);
 }
    
    
}

public class Test{
public static void main(String args[]){  
    
    Person myObj = new Person("Shubham" , 2001149);
    Employee myObj2 = new Employee("Shubham2" , 2);
    myobj2.setDetails("Aman", 115,3000, 2019);
    myobj2.updateSalary(6);
  
}  

}  