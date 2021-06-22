import java.io.*;

class FileTest{
	public static void main(String args[]) throws IOException
	{
		PrintWriter pw=new PrintWriter("three.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("one.txt"));
		BufferedReader br1=new BufferedReader(new FileReader("two.txt"));
		
		String line=br.readLine();
		String line1=br1.readLine();
		
		while(line!=null && line1!=null)
		{
		pw.println(line);
		pw.println(line1);
		line=br.readLine();
		line1=br1.readLine();
		}
		
		pw.flush();
		br.close();
		pw.close();
		
		System.out.println("Merged one.txt and two.txt into three.txt");
	}
}