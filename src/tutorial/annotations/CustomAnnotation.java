package tutorial.annotations;

import java.lang.annotation.Annotation;

public class CustomAnnotation {
    public static void demo()
    {
        NokiaASeries obj = new NokiaASeries("Fire", 6);
        // fetching values of annotation
        Class c = obj.getClass();
        Annotation a = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)a;
        System.out.println(s.os());
        System.out.println(s.version());
    }
}

@SmartPhone(os = "Pie", version = 9)
class NokiaASeries
{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
