package ocp.practice;

import javax.swing.*;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by iuliab on 15.08.2017.
 */
public class StreamOperations {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

//        TreeSet<String> set = stream.collect(() -> new TreeSet<String>(), (s1, s2) -> s1.add(s2), (s1, s2) -> s1.addAll(s2));

        Stream.iterate("", s -> s + "1")
                .peek(System.out::println)
                .limit(2)
                .map(x -> x + "2")
                .forEach(System.out::println);

        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> streamDash = Stream.iterate("-", s -> s + s);
        Stream<String> streamDash2 = Stream.iterate("-", s -> s + s);
        boolean b1 = streamDash.noneMatch(predicate);
        boolean b2 = streamDash2.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
        Stream.iterate("-", s -> s + s)
                .limit(3)
                .forEach(System.out::println);
    }
}
