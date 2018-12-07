package tutorial.wrapper;

public class Wrapper {

    public static void wrapperDemo() {
//        wrapping
        int i = 245;
        Integer iObj = i;

//        unwrapping
        int j = iObj;

        System.out.println(j + 2);
    }
}
