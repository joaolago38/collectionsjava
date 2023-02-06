package colecoes.java;

import java.util.*;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class SearchingUnsortedListPredicate {
    public class SearchArrayListPredicate {
        List<String> list = LongStream.range(0, 16)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));
        List<String> stringsToSearch = new ArrayList<>(list);


        Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));

        List<String> result = new ArrayList<>();
        Iterator<String> it = stringsToSearch.iterator();
//        while (it.hasNext() {
//            String s = it.next();
//            if (matchingStrings.contains(s)) {
////                result.add(s);
//            }
//        }

      }
}
