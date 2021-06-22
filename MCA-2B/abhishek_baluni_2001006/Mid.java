import java.io.*;
class Mid
{
	public static void main(String[] args) throws IOException
	{
	PrintWriter as=new PrintWriter("three.txt");

		BufferedReader br1=new BufferedReader(new FileReader("one.txt")); 
		BufferedReader br2=new BufferedReader(new FileReader("two.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null && line2!=null)
		{
		as.println(line1);
		as.println(line2);
		line1=br1.readLine();
		line2=br2.readLine(); 
		}
		as.flush();
		br1.close();
		as.close();
		System.out.println("Merged ");
	FileReader pq=new FileReader("three.txt");
			int k=pq.read();
			while(k!=-1) {
				System.out.print((char)k);
				k=pq.read();
			}	
}
}
