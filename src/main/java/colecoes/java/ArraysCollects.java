package colecoes.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toSet;

public class ArraysCollects {
    public static void main(String[] args) {
        Collection<Integer> numbers
                = IntStream.range(0, 10).boxed().collect(toSet());

        List<Integer> list = new ArrayList<>(numbers);
        list.contains(9);
        if(list.contains(29)){
            System.out.println("Contem o numero  numero 9 +++> " + list.get(9));
        }
        list.forEach(System.out::println);

    }
}
