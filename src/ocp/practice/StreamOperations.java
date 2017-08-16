package ocp.practice;

import javax.swing.*;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by iuliab on 15.08.2017.
 */
public class StreamOperations {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word);

        TreeSet<String> set = stream.collect(() -> new TreeSet<String>(), (s1, s2) -> s1.add(s2), (s1, s2) -> s1.addAll(s2));
    }
}
