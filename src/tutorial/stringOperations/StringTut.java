package tutorial.stringOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringTut {

    public static void demo()
    {
        try
        {
            scannerDemo();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    public static int findLength(String str)
    {
        return str.length();
    }

    public static  String concatenation(String str1, String str2)
    {
        return  str1.concat(str2);
    }

    public void toStringDemo()
    {
        Student st = new Student(199004140, "Sasanga Madhumal Edirisinghe");
        System.out.println(st.toString());

    }

    public static void  readFromStream() throws  Exception{
        int i = System.in.read();
        System.out.println(i);
    }

    public static void bufferReaderDemo() throws Exception{

        System.out.println("Enter a number");

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
    }

    public static  void scannerDemo() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int i = sc.nextInt();
        System.out.println("You have entered " + i);
    }

    class Student // inner class
    {
        int rollNo;
        String sname;

        public Student(int rollNo, String sname) {
            this.rollNo = rollNo;
            this.sname = sname;
        }

        @Override
        public String toString(){
            return this.rollNo + " - " + this.sname;
        }

    }
}
