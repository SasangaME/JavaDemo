package tutorial.stringOperations;

public class StringTut {

    public static void demo()
    {
        System.out.println(findLength("Sasanga Madhumal Edirisinghe"));
        System.out.println(concatenation("Sasanga", " will rock"));
    }

    public static int findLength(String str)
    {
        return str.length();
    }

    public static  String concatenation(String str1, String str2)
    {
        return  str1.concat(str2);
    }
}
