import java.io.*;
class Merging
{
public static void main(String[] args) throws IOException {
PrintWriter pw=new PrintWriter("three.txt");
BufferedReader br=new BufferedReader(new
FileReader("one1.txt"));
String l=br.readLine();
while (l!=null) {
pw.println(l);
l=br.readLine();
}
br=new BufferedReader(new FileReader("two.txt"));
l=br.readLine();
while (l!=null) {
pw.println(l);
l=br.readLine();
}
pw.flush();
pw.close();
br.close();
System.out.println("Content of file one.txt and two.txt is
merged in three.txt");
}
}