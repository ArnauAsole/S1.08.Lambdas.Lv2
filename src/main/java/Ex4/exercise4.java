package Ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "echo", "3", "22", "grape", "ear");

        // Sort alphabetically by first character
        list.sort((a, b) -> Character.compare(a.charAt(0), b.charAt(0)));
        System.out.println("Sorted by first character: " + list);

        // Sort strings that contain "e" first
        list.sort((a, b) -> a.contains("e") ? -1 : 1);
        System.out.println("Strings with 'e' first: " + list);

        // Replace 'a' with '4'
        List<String> replaced = list.stream()
                .map(s -> s.replace("a", "4"))
                .collect(Collectors.toList());
        System.out.println("Replaced 'a' with '4': " + replaced);

        // Filter and print only numeric strings
        List<String> onlyNumbers = list.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println("Only numeric values: " + onlyNumbers);
    }
}