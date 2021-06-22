import java.io.*;

public class Q1
{
	public static void main(String[] args) throws IOException
	{


		PrintWriter writerThree = new PrintWriter("three.txt");
	    
    PrintWriter writerOne = new PrintWriter("one.txt");
		writerOne.println("line11"); 
    writerOne.println("line21"); 
    writerOne.println("line31"); 
    writerOne.println("line41"); 
    writerOne.println("line51"); 
    writerOne.close(); 
		    
		    
    PrintWriter writerTwo = new PrintWriter("two.txt");
    writerTwo.println("line1"); 
    writerTwo.println("line2"); 
    writerTwo.println("line3"); 
    writerTwo.println("line4"); 
    writerTwo.println("line5"); 
    writerTwo.close(); 
	    
		BufferedReader br1 = new BufferedReader(new FileReader("one.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("two.txt"));
		
		String line1, line2;
		while ((line1=br1.readLine())!=null && (line2=br2.readLine())!=null) {
      writerThree.println(line1);
      writerThree.println(line2);
		}
		
    BufferedReader	br = new BufferedReader(new FileReader("three.txt"));
		String line = br.readLine();
		
		while(line != null) {
			writerThree.println(line);
			line = br.readLine();
		}
		
		writerThree.flush();
		br.close();
		writerThree.close();
		System.out.println("done");
	}
}