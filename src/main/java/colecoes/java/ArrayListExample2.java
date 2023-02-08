package colecoes.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListExample2 {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Banana");
        list.add("Grapes");
        list.add("Grapes");
        list.stream().distinct().collect(Collectors.toList());
        //Traversing list through Iterator
        Iterator itr=list.iterator();//getting the Iterator

        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
    }
}
