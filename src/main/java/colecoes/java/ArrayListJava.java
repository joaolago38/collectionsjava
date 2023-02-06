package colecoes.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("kpap");
        list.add("232323");
        list.add("joaodfdf");
        list.add("maria jose");
        System.out.println( list.stream().toArray().length);
        list.stream().limit(1).forEach(System.out::println);

    }
}
