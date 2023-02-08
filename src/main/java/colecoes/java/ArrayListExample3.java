package colecoes.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample3 {
    public static void main(String args[]){
        List<Integer> list1 = List.of(1, 2, 3, 4, 3, 2, 1);
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Grapes");
        list1.stream().distinct().forEach(x -> System.out.println("Processing " + list1));
        list.forEach(System.out::println);
        //Traversing list through for-each loop
        for(String fruit:list)
            System.out.println(fruit);

    }
}
