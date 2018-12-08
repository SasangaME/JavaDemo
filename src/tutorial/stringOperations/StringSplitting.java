package tutorial.stringOperations;

public class StringSplitting {

    public static void splittingDemo() {
        String str = "Sasanga, Madhumal, Edirisinghe";
        String[] arr = str.split(",");
        for(String item : arr)
        {
            System.out.println(item);
        }
    }
}
