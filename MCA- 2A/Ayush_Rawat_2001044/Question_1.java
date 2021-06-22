import java.io.*;
  
public class ques1 
{
    public static void main(String[] args) throws IOException 
    {
        	FileWriter one = new FileWriter("one.txt");
		      FileWriter two = new FileWriter("two.txt");
		      FileWriter three = new FileWriter("three.txt");
          PrintWriter pw = new PrintWriter("one.txt");
          
          for(int i =0;i< 5;i++)
          {
              pw.println("ayuaf af af af sh");

            }
            PrintWriter pw = new PrintWriter("one.txt");
            for(int i =0;i<5;i++)
              {
               pw.println("rawatsfasf  af a  fa ");

            }
          PrintWriter pw = new PrintWriter("three.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("one.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("two.txt"));
          
          
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
