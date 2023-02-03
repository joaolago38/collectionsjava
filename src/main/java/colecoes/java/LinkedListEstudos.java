package colecoes.java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEstudos {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        List list = Collections.synchronizedList(cars);
        list.forEach(System.out::println);
    }
}
