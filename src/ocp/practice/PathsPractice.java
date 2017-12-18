package ocp.practice;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by iuliab on 30.10.2017.
 */
public class PathsPractice {

    public static void main(String[] args) {
        Path relative = Paths.get("zoo.txt");
        Path base1 = Paths.get("..", "..", "temp", "delete", "dictionary.txt");
        Path base2 = Paths.get("a", "b", "c", "d", "e");

        Path relativized1 = base1.relativize(relative);
        System.out.println("relativized1: " + relativized1);
        Path relativized2 = base2.relativize(relative);
        System.out.println("relativized2: " + relativized2);

        Path resolved1 = base1.resolve(relativized1).normalize();
        System.out.println("resolved1=" + resolved1);
        Path resolved2 = base2.resolve(relativized2).normalize();
        System.out.println("resolved2=" + resolved2);
        int n = 2;
        IntStream.rangeClosed(1, 10).map(i -> i * n).forEach(System.out::println);


        int n2 = 2;
        String[] strings = new String[n2];
        strings[0] = "Hacker";
        strings[1] = "Rank";
        Arrays.stream(strings).map(s -> {
                    char[] chars = s.toCharArray();
                    StringBuilder str = new StringBuilder();
                    for (int i = 0; i < chars.length; i += 2) {
                        str.append(chars[i]);
                    }
                    str.append(" ");
                    for (int i = 1; i < chars.length; i += 2) {
                        str.append(chars[i]);
                    }
                    return str;
                }
        ).peek(System.out::println).forEach(System.out::println);
    }
}
