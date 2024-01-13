package streams;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Java example to create list from stream
 */
public class StreamsToList {

    public static void main(String[] args) {

        // old way of creating list from stream, this has additional, allocation and copying logic
        // returns mutable list
        List<String> normalList = Stream.of("A", "C", "B").collect(Collectors.toList());
        System.out.println(normalList);
        // applying operations
        normalList.add("D");
        System.out.println(normalList);
        Collections.sort(normalList);
        System.out.println(normalList);

        // old way of creating list from stream, this has additional, allocation and copying logic
        // returns immutable list
        List<String> unmodifiableList = Stream.of("A", "C", "B").collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList);
        // not allowed
        // unmodifiableList.add("D");
        // Collections.sort(unmodifiableList);

        // new way of creating list from directly stream, more efficient
        // returns immutable list
        List<String> streamList = Stream.of("A", "B", "C").toList();
        System.out.println(streamList);
        // not allowed operations
        // streamList.add("D");
        // Collections.sort(streamList);

    }
}
