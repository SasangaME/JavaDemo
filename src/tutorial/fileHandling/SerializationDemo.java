package tutorial.fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {

    public static void demo(){
        SerializationDemo obj = new SerializationDemo();
        obj.serialization();
        obj.getSerializedObject();
    }
    public  void serialization(){
        try{
            Save obj = new Save();
            obj.i = 4;

            File f = new File("files/serialization_demo.txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void getSerializedObject(){
        try {
            File f = new File("files/serialization_demo.txt");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Save obj = (Save) ois.readObject();
            System.out.println(obj.i);
        }
        catch (Exception e){
            System.out.println("Value of object " + e.getMessage());
        }
    }


}

class Save implements Serializable {
    int i;
}
