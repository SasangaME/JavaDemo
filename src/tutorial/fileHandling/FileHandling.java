package tutorial.fileHandling;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class FileHandling {

    public static void fileDemo(){
        try{
            File f = new File("files/demo.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter content: ");
            String msg = sc.nextLine();
            dos.writeUTF(msg);

            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            String str = dis.readUTF();
            System.out.println(str);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //property files
    public static void propertyDemo()
    {
        try{
            Properties prop = new Properties();
            File f = new File("files/dataConfig.properties");
            OutputStream os = new FileOutputStream(f);

            prop.setProperty("url", "localhost:3306/myDb");
            prop.setProperty("username", "sasanga");
            prop.setProperty("password", "password");

            prop.store(os, null);



        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // read from property file
    public static void fetchProps(){
        try{
            File f = new File("files/dataConfig.properties");
            Properties prop = new Properties();
            InputStream is = new FileInputStream(f);
            prop.load(is);

            System.out.println("url: " + prop.getProperty("url"));
            System.out.println("username: " + prop.getProperty("username"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
