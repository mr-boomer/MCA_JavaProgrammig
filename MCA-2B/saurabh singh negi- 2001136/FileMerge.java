package com.company;

import java.io.*;
public class FileMerge
{
    public static void printDATA()
    {
        BufferedReader br = null;
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try {
            br = new BufferedReader(new FileReader("one.txt"));
            br1 = new BufferedReader(new FileReader("two.txt"));
            br2 = new BufferedReader(new FileReader("three.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        String line = null;
        String line1 = null;
        String line2 = null;


        try {
            while((line = br.readLine())!= null) {

                while((line1 = br1.readLine())!= null){
                    while((line2 = br2.readLine())!= null)
                    {
                        System.out.println("Content of one.txt file : " + line);
                        System.out.println("Content of two.txt file : " + line1);
                        System.out.println("Content of three.txt file : " + line2);
                    }
                }

            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("three.txt");

        BufferedReader br = new BufferedReader(new FileReader("one.txt"));


        String line = br.readLine();

        while (line != null)
        {
            pw.print(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("two.txt"));

        line = br.readLine();

        while(line != null)
        {
            pw.print(line);
            line = br.readLine();



            pw.flush();


            br.close();
            pw.close();

            System.out.println("Copied the contents of one.txt and two.txt into three.txt file");
            System.out.println(" ");
        }
        printDATA();
    }

}