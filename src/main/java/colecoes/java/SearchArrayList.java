package colecoes.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class SearchArrayList {
    public static void main(String[] args)
    {
        List<String> list = LongStream.range(0, 16)

                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));
        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list);
        stringsToSearch.forEach(System.out::println);
    }
}
