package com.javatpoint;  
  
import java.io.*;

public class PrintWriterExample 
{  
    public static void main(String[] args) throws Exception
 {   
      PrintWriter writer = new PrintWriter(System.out);    
      writer.write("File Created Succesfully. And Merged content of one.txt and Two.txt in three.txt. by line by line.");        
 writer.flush();  
      writer.close();  
   
      PrintWriter writer1 =null;      
         writer1 = new PrintWriter(new File("C:\\Users\\HP\\Desktop\\Viku_Java_Programming\\Ques-1\\one.txt"));  
         writer1.write("1.Hello, This a text into file name one.txt Line 1 \n 2. This is line 2 of one file. \n3. This is line 3 of one file. \n4.Line 4 of one. \n5.Line 5 of one");                                                   
                         writer1.flush();  
         writer1.close();  

	PrintWriter writer2 =null;      
         writer2 = new PrintWriter(new File("C:\\Users\\HP\\Desktop\\Viku_Java_Programming\\Ques-1\\two.txt"));  
         writer2.write("1.Hello, This a text into file name Two.txt Line 1 \n 2. This is line 2 of two file. \n3. This is line 3 of two file\n4.Line 4 of two. \n5.Line 5 of two");                                                   
                         writer2.flush(); 		
    
	 PrintWriter pw = new PrintWriter("C:\\Users\\HP\\Desktop\\Viku_Java_Programming\\Ques-1\\three.txt"); 
          
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Viku_Java_Programming\\Ques-1\\one.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Viku_Java_Programming\\Ques-1\\two.txt")); 
          
          
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
          
        System.out.println("Merged one.txt and two.txt into three.txt"); 

	
    } 
}
	 

