import java.io.*; 
  
class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    
    {
		
		  PrintWriter out = new PrintWriter("D:\\one.txt");
		   out.println("line1"); 
		   out.println("line2"); 
		   out.println("line3"); 
		   out.println("line4"); 
		   out.println("line5"); 
		    out.close(); 
		    
		      PrintWriter out2 = new PrintWriter("D:\\two.txt");
		   out.println("line11"); 
		   out.println("line22"); 
		   out.println("line33"); 
		   out.println("line44"); 
		   out.println("line55"); 
		    out2.close(); 
		    
      
        PrintWriter pw = new PrintWriter("/D:three.txt"); 
          
        BufferedReader br1 = new BufferedReader(new FileReader("D:\\one.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\two.txt")); 
          
          
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