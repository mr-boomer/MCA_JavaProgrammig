
import java.io.*;

public class File1
{
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("file1.txt");
        FileWriter fw1=new FileWriter("file2.txt");
        fw.write("hello anjali");
        fw1.write("dandriyal");
        fw.flush();
        fw.close();
        fw1.flush();
        fw1.close();
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("file2.txt"));
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