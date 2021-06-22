import java.io.*;
  
public class Q1
{
    public static void main(String[] args) throws IOException 
    {
        
        PrintWriter pr = new PrintWriter("D:\\java\\NikhileshBhatt2001094\\three.txt");
        BufferedReader a1 = new BufferedReader(new FileReader("D:\\java\\NikhileshBhatt2001094\\one.txt"));
        BufferedReader a2 = new BufferedReader(new FileReader("D:\\java\\NikhileshBhatt2001094\\two.txt"));
  
        String line1 = a1.readLine();
        String line2 = a2.readLine();
          
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pr.println(line1);
                line1 = a1.readLine();
            }
              
            if(line2 != null)
            {
                pr.println(line2);
                line2 = a2.readLine();
            }
        }
      
        pr.flush();
          
        
        a1.close();
        a2.close();
        pr.close();
          
        System.out.println("written one.txt file and two.txt file text into third file ");
        
  
           
    }
}