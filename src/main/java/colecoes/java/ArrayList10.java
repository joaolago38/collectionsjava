package colecoes.java;

import java.util.ArrayList;

public class ArrayList10 {
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("==================");
        al.stream().forEach(System.out::println);
        System.out.println("==================");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
    }
}
