import java.io.*;

class File3 {
    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter("C:\\Users\\BHARTENDU PANT\\IdeaProjects\\college/one.txt");
        out.println("line1");
        out.println("line2");
        out.println("line3");
        out.println("line4");
        out.println("line5");
        out.close();

        PrintWriter out2 = new PrintWriter("C:\\Users\\BHARTENDU PANT\\IdeaProjects\\college/two.txt");
        out.println("line11");
        out.println("line22");
        out.println("line33");
        out.println("line44");
        out.println("line55");
        out2.close();


        PrintWriter pw = new PrintWriter("/C:\\Users\\BHARTENDU PANT\\IdeaProjects\\college/three.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\BHARTENDU PANT\\IdeaProjects\\college/one.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\BHARTENDU PANT\\IdeaProjects\\college/two.txt"));


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
    }

}
