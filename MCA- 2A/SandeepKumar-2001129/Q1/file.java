import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {

        try
        {

        
        File fd = new File("Demo");
        fd.mkdir();
        File f = new File(fd, "abc.txt");
        if (f.exists())
            System.out.println("File already exist");
        else
        {
            f.createNewFile();
            FileWriter fw = new FileWriter("abc.txt");
            fw.write(100);
            fw.write("I love my india");
            fw.flush();
            System.out.println("data entered in file");
            fw.close();
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    }
}
