package colecoes.java;

import java.util.*;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class SearchArrayListPredicate {
        public static void main(String[] args)
        {
        Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));
        List<String> stringsToSearch = new ArrayList<>(matchingStrings);
        List<String> result = stringsToSearch
                .stream()
                .filter(matchingStrings::contains)
                .collect(toCollection(ArrayList::new));
        stringsToSearch.forEach(System.out::println);
    }
}
