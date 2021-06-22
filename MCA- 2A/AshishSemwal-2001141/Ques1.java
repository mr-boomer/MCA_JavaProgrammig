import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class Ques1 {
    public static void main(String[] args) throws IOException 
    {
        // PrintWriter object for file3.txt
        PrintWriter out = new PrintWriter("file1.txt");
        out.println("1"); 
        out.println("2"); 
        out.println("3"); 
        out.println("4"); 
        out.println("5"); 
         out.close(); 
         
        var out2 = new PrintWriter("file2.txt");
        out.println("6"); 
        out.println("7"); 
        out.println("8"); 
        out.println("9"); 
        out.println("10"); 
         out2.close(); 
         
   
     PrintWriter pw = new PrintWriter("three.txt"); 
          
        // BufferedReader object for file1.txt
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
          
          
        String line1 = br1.readLine();
        String line2 = br2.readLine();
          
        // loop to copy lines of 
        // file1.txt and file2.txt 
        // to  file3.txt alternatively
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
          
        // closing resources
        br1.close();
        br2.close();
        pw.close();
          
        System.out.println("Merged file1.txt and file2.txt alternatively into file3.txt");
        br1 = new BufferedReader(new FileReader("three.txt"));
  
           String st;
           while ((st = br1.readLine()) != null)
             System.out.println(st);
    }
}
