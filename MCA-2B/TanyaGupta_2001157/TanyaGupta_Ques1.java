import java.io.*;
class Ques1
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw1 = new PrintWriter(new File("C:\\Users\\LENOVO\\Desktop\\one.txt")); 
		PrintWriter pw2 = new PrintWriter(new File("C:\\Users\\LENOVO\\Desktop\\two.txt")); 
		PrintWriter pw3 = new PrintWriter(new File("C:\\Users\\LENOVO\\Desktop\\three.txt")); 
		pw1.write("LINE 1 OF FILE 1 \n LINE 2 OF FILE 1 \n LINE 3 OF FILE 1 \n LINE 4 OF FILE 1 \n LINE 5 OF FILE 1");
		pw1.flush();  
        pw1.close(); 
		pw2.write("LINE 1 OF FILE 2 \n LINE 2 OF FILE 2 \n LINE 3 OF FILE 2 \n LINE 4 OF FILE 2 \n LINE 5 OF FILE 2");
		pw2.flush();  
        pw2.close(); 
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\one.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\two.txt")); 
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
        pw3.close(); 
		System.out.println("DATA OF THIRD FILE IS SHOEN BELOW : "); 
		FileReader fr=new FileReader("C:\\Users\\LENOVO\\Desktop\\three.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
	}
}
