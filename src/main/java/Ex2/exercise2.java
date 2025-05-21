package Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 55, 44, 505, 404, 1992, 1256);

        String result = numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));

        System.out.println("Formatted numbers: " + result);
    }
}