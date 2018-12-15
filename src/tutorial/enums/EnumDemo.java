package tutorial.enums;

public class EnumDemo {
    public static void demo()
    {
        int i = Mobile.OnePlus.ordinal();
        System.out.println(i);
    }
}

enum Mobile
{
    Apple(100), Samsung(80), OnePlus(60);

    int price;

    Mobile(int p)
    {
        price = p;
    }

    public int getPrice()
    {
        return price;
    }
}