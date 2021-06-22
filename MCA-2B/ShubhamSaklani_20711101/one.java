import java.io.*; 
  
class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    
    {
		File f1=new File("one.txt");
		f1.createNewFile();
		File f2=new File("two.txt");
		f2.createNewFile();
 		File f3=new File("three.txt");
		f3.createNewFile();
		 PrintWriter pw = new PrintWriter(f1);
		 pw.println("A");
 		pw.println("B");
 		pw.println("C");
 		pw.println("D");
 		pw.println("E");
		    
		PrintWriter pw2 = new PrintWriter(f2);
		pw2.println("1");
		pw2.println("2");
		pw2.println("3");
		pw2.println("4");
		pw2.println("5");
		    
     
        PrintWriter pw3 = new PrintWriter(f3); 
          
        BufferedReader br1 = new BufferedReader(new FileReader("one.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("two.txt")); 
          
          
        String line1 = br1.readLine(); 
        String line2 = br2.readLine(); 
          
       
        while (line1 != null || line2 !=null) 
        { 
            if(line1 != null) 
            { 
                pw3.println(line1); 
                line1 = br1.readLine(); 
            } 
              
            if(line2 != null) 
            { 
                pw3.println(line2); 
                line2 = br2.readLine(); 
            } 
        } 
      
        pw3.flush(); 
     	br1.close(); 
        br2.close(); 
        f1.close(); 
	f2.close();
	f3.close();
   
    } 
}