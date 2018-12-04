package tutorial.interfaceDemo;

public interface iMyinterface {
     void showConfig();
//    public void showTest();
    default  void  test()
    {
        System.out.println("Method defined in interface - from Java 8");
    }

    static void staticMethod()
    {

    }
}


