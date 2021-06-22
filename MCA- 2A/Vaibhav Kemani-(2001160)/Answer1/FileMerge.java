import java.io.*; 
  
class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    
    {
		
		  PrintWriter a1 = new PrintWriter("/home/vaibhav/Desktop/MCA/JAVA/practicals/Mid-Sem Practical/Answer1/one.txt");
		   a1.println("line1\nl2\nl3"); 
		   a1.println("line2"); 
		   a1.println("line3"); 
		   a1.println("line4"); 
		   a1.println("line5"); 
		    a1.close(); 
		    
		      PrintWriter a2 = new PrintWriter("/home/vaibhav/Desktop/MCA/JAVA/practicals/Mid-Sem Practical/Answer1/two.txt");
		   a2.println("line11"); 
		   a2.println("line22"); 
		   a2.println("line33"); 
		   a2.println("line44"); 
		   a2.println("line55"); 
		    a2.close(); 
		    
      
        PrintWriter pw = new PrintWriter("/home/vaibhav/Desktop/MCA/JAVA/practicals/Mid-Sem Practical/Answer1/three.txt"); 
          
        BufferedReader br1 = new BufferedReader(new FileReader("/home/vaibhav/Desktop/MCA/JAVA/practicals/Mid-Sem Practical/Answer1/one.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("/home/vaibhav/Desktop/MCA/JAVA/practicals/Mid-Sem Practical/Answer1/two.txt")); 
          
          
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