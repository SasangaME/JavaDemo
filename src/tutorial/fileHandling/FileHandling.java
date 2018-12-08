package tutorial.fileHandling;

import java.io.*;

public class FileHandling {

    public static void fileDemo(){
        try{
            File f = new File("demo.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            String msg = "Sasanga Madhumal Edirisnghe";
            dos.writeUTF(msg);

            FileInputStream fis = new FileInputStream("demo.txt");
            DataInputStream dis = new DataInputStream(fis);
            String str = dis.readUTF();
            System.out.println(str);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
