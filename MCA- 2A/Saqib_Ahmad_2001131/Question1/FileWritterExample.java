import java.io.*;

public class FileWriterExample
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("Three.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("one.txt"));
		
		String line = br.readLine();
		
		while (line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		br = new BufferedReader(new FileReader("two.txt"));
		
		line = br.readLine();
		
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		pw.flush();
		
		br.close();
		pw.close();
		
		System.out.println("Merged file1.txt and file2.txt into file3.txt");
	}
}
