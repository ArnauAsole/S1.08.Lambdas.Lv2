package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ada", "Alex", "Bob", "Al", "Ann");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .collect(Collectors.toList());

        System.out.println("Names that start with 'A' and have 3 letters: " + result);
        names.forEach(System.out::println);
    }
}