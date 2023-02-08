package colecoes.java;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        //accessing the element
        System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        al.set(1,"Dates");
        al.set(2,"java");
        //Traversing list
        for(String fruit:al)
            System.out.println(fruit);
    }
}