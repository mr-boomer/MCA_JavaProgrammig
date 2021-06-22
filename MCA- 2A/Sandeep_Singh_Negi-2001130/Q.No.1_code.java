 import java.io.FileWriter;
		  import java.io.IOException;
		  import java.io.PrintWriter;

		  public class AppendFileDemo
		  {
		      public static void main(String[] args) throws IOException
		      {
		          // Open the file in append mode.
		          FileWriter fone = new FileWriter("C:\\one.txt");
		          PrintWriter outone = new PrintWriter(fone);

		          // Append the name of ocean to the file
		          outone.println("Portugal");
		          outone.println("Brazil");
		          outone.println("Germany");
		          outone.println("Francce");
		           outone.println("Japan");


		          // Close the file.
		          outone.close();

		           FileWriter ftwo= new FileWriter("C:\\two.txt");
				  	PrintWriter outtwo = new PrintWriter(ftwo);

				  		          // Append the name of ocean to the file
				  		          outtwo.println("USA");
				  		          outtwo.println("Pakistan");
				  		          outtwo.println("China");
				  		          outtwo.println("Argentina");
				  		          outtwo.println("Mexico");


				  		          // Close the file.
		          outtwo.close();

		      }
}
[11:37, 6/22/2021] Rohit Mca: import java.io.*;
 class CopyDataFiletoFile
 {
              public static void main(String args[])throws IOException
         {
               FileInputStream Fread =new FileInputStream("c:\\one.txt");
               FileOutputStream Fwrite=new FileOutputStream("c:\\three.txt") ;
               System.out.println("File is Copied");
               int c;
               while((c=Fread.read())!=-1)
               Fwrite.write((char)c);
               Fread.close();
               Fwrite.close();
          }
 }