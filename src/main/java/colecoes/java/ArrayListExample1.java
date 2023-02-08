package colecoes.java;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        if(list.contains("Banana")){
            System.out.println("=======================");
            System.out.println("Existem banana na lista");
            list.remove("Banana");
            System.out.println("Banana foi retirada da lista");
            System.out.println("=======================");
        }
           list.forEach(System.out::println);
    }
}
