package colecoes.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;

public class ListIteratorJava {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(
                IntStream.range(0, 1000).boxed().collect(toCollection(ArrayList::new))
        );

        ListIterator<Integer> it = list.listIterator(list.size());
        List<Integer> result = new ArrayList<>(list.size());
        while (it.hasPrevious()) {
            result.add(it.previous());
        }
        list.removeIf( n -> n % 2 == 0);
//        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
