import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
public class Problem1 {
    public static void main(String[] args) {
        try { 
            File f1 = new File("one.txt");
            if (!f1.exists()) {
                f1.createNewFile();
                System.out.println("one.txt created sucessful");
            } else {
                System.out.println("file alredy exist");
            }
            PrintWriter p1 = new PrintWriter(f1);
            for (int j = 0; j < 5; j++) {
                p1.println("Deepak Tiwari one.txt  " + j);
            }
            p1.close();
            System.out.println("one.txt write sucessful ");
        } catch (Exception e) {
            System.out.println("an error has occured ");
        }
        
        try { 
            File f2 = new File("two.txt");
            if (!f2.exists()) {
                f2.createNewFile();
                System.out.println("two.txt created sucessful");
            } else {
                System.out.println("file alredy exist");
            }
            PrintWriter p2 = new PrintWriter(f2);
            for (int j = 0; j < 5; j++) {
                p2.println("Deepak Tiwari two.txt  " + j );
            }
            p2.close();
            System.out.println("two.txt write sucessful ");
        } catch (Exception e) {
            System.out.println("an error has occured ");
        }
        try {
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
        br1.close();
        br2.close();
        pw.close();
File file = new File("three.txt");
  
  BufferedReader br3 = new BufferedReader(new FileReader(file));
  
  String st;
  while ((st = br3.readLine()) != null)
    System.out.println(st);
        System.out.println("one.txt and two.txt are merged to three.txt");
        } catch (Exception e) {
            System.out.println(" error occoured");
        }
        
    }
}