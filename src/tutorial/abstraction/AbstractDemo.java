package tutorial.abstraction;

public class AbstractDemo {

    public static void abstraction()
    {
        MyNextPhone objPhone = new MyNextPhone();
        config(objPhone);
        // we can define a method parameter in abstract class and pass the object of sub class.
    }

    public static void config(MyPhone phone)
    {

    }
}
