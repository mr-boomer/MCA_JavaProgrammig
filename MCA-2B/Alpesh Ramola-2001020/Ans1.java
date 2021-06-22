/*ALPESH RAMOLA
MCA 2 B 
ROLL NO-2001020*/
import java.io.*;
import java.lang.*;
class LessBalanceException extends Exception
{
 LessBalanceException(double amt)
 {
 System.out.println("Withdrawing "+amt+" is invlaid");
 }
}
class Account
{
 static int count=0;
 int accno;
 double bal;
 String name;
 Account(double bal,String n,int accno)
 {
  System.out.println("\nNew Account opened....!!");
  this.bal=bal;
  count++;
  System.out.println("Account Holder Name : " + n);
  name=n;
  System.out.println("Your Account Number is : "+accno);
  this.accno=accno;
  System.out.println("Total number of accounts : "+count);
  
 }
 void deposit(double amt)
 {
  System.out.println("Availabe Balance : "+bal); 
  bal=bal+amt;
  System.out.println("Rs. : "+amt+" /- Created");
  System.out.println("Balance : "+bal);
 }
 void withdraw(double amt) throws LessBalanceException
 {
  System.out.println("\nAvailabe Balance : "+bal);
  bal-=amt;
  if(bal<500)
  {
   bal+=amt;
   throw new LessBalanceException(amt);
  }
  System.out.println("Rs. : "+amt+ "/-Debited");
  System.out.println("Balacne : "+bal);
 }
 void balance()
 {
  System.out.println("\nCustomer information");
  System.out.println("============================================");
  System.out.println("Customer Name : "+name);
  System.out.println("Account Number : "+accno);
  System.out.println("Balance : "+bal);
 }
}
class AccountDemo
{
 static int i=0;
 public static void main(String args[]) throws IOException
 {
  Account ob[]=new Account[10];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  double amt;
  String name;
  int ch,accno,k;
  boolean t=false;
  while(true)
  {
   System.out.println("\n*** Bank Transaction ***");
   System.out.println("1.Open new Account\n2.Deposit");   
   System.out.println("3.Withdraw\n4.Balance\n5.Exit");
   System.out.print("Enter your choice : ");
   ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
   case 1:
   System.out.println("Opening New Account : ");
   System.out.print("Enter your name : ");
   name=br.readLine();
   System.out.print("\nEnter Account Number : ");
   accno=Integer.parseInt(br.readLine());
   System.out.print("\nEnter initial amount(to be >=500) : ");
   amt=Double.parseDouble(br.readLine());
   if(amt<500)
   System.out.println("You cannot create an account with less than Rs.500/-");
   else
   {
    ob[i]=new Account(amt,name,accno);
    i++;
   }
   break;

   case 2:
   System.out.print("\nEnter Account number : ");
   accno=Integer.parseInt(br.readLine());
   for(k=0;k<i;k++)
   if(accno==ob[k].accno)
   {
    t=true;
    break;
   }
    
   if(t)
   {
    System.out.print("\nEnter the Amount for Deposit : ");
    amt=Double.parseDouble(br.readLine());
    ob[k].deposit(amt);
   }
   else
   System.out.println("Invalid Account Number...!!!");
   t=false;
   break;

   case 3:
   System.out.print("\nEnter Account number : ");
   accno=Integer.parseInt(br.readLine());
   for(k=0;k<i;k++)
   if(accno==ob[k].accno)
   {
    t=true;
    break;
   }
   
   if(t)
   {
    System.out.print("\nEnter the Amount for Withdraw : ");
    amt=Double.parseDouble(br.readLine());
    try
    {
     ob[k].withdraw(amt);
    }
    catch(LessBalanceException e)
    {}
   }
   else
   System.out.println("Invalid Account Number...!!!");
   t=false;
   break;

   case 4:
   System.out.print("\nEnter Account number : ");
   accno=Integer.parseInt(br.readLine());
   for(k=0;k<i;k++)
   if(accno==ob[k].accno)
   {import java.io.*; 
  
class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    
    {
		
		  PrintWriter out = new PrintWriter("/home/mrlpha/Documents/javaprac/file1.txt");
		   out.println("line1"); 
		   out.println("line2"); 
		   out.println("line3"); 
		   out.println("line4"); 
		   out.println("line5"); 
		    out.close(); 
		    
		      PrintWriter out2 = new PrintWriter("/home/mrlpha/Documents/javaprac/file2.txt");
		   out.println("line11"); 
		   out.println("line22"); 
		   out.println("line33"); 
		   out.println("line44"); 
		   out.println("line55"); 
		    out2.close(); 
		    
      
        PrintWriter pw = new PrintWriter("/home/mrlpha/Documents/javaprac/file3.txt"); 
          
        BufferedReader br1 = new BufferedReader(new FileReader("/home/mrlpha/Documents/javaprac/file1.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("/home/mrlpha/Documents/javaprac/file2.txt")); 
          
          
        String line1 = br1.readLine(); 
        String line2 = br2.readLine(); 
          
       
        while (line1 != null || line2 !=null) 
        { 
            if(line1 != null) 
            { 
                pw.println(line1); 
                line1 = br1.readLine(); 
            } 
              
            if(line2 != null) 
            { 
                pw.println(line2); 
                line2 = br2.readLine(); 
            } 
        } 
      
        pw.flush(); 
          
     
        br1.close(); 
        br2.close(); 
        pw.close(); 
          
        System.out.println("Merged file1.txt and file2.txt into file3.txt"); 
    } 
}
    t=true;
    break;
   }
   
   if(t)
   {
    //System.out.println(accno +" asdfsdf " +ob[k].accno);
    ob[k].balance();
   }
   else
   System.out.println("Invalid Account Number...!!!");
   t=false;
   break;
   
   case 5:
   System.exit(1);
   default: System.out.println("Invalid Choice !!!");
   }
  }
 }
}