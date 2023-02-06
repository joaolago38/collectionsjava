package colecoes.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toCollection;
public class RemoveElementsArrayList {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(
                IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new))
        );
        Collections.reverse(list);

        list.remove(0);
        list.remove(Integer.valueOf(1));
        list.remove(Integer.valueOf(4));
        list.forEach(System.out::println);
   }
}
