package list.creation;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);
        System.out.println("===========================");
        list.stream().sorted().forEach(System.out::println);
    }
}

