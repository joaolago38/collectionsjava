package streams.java8;

import java.util.List;

public class Java8Streamdistinct{

    public static void main(String args[]){
        List<Integer> list = List.of(1, 2, 3, 4, 3, 2, 1);
        list.stream().distinct().forEach(x -> System.out.println("Processing " + x));
    }

 }
