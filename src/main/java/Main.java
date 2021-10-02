import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static final String MESSAGE = "The class String includes methods for examining individual characters of the sequence, " +
            "for comparing strings, for searching strings, for extracting substrings, " +
            "and for creating a copy of a string with all characters translated to uppercase or to lowercase, " +
            "case mapping is based on the Unicode Standard version specified by the Character class";

    public static void main(String[] args) {
        Function<String, String[]> array = string -> string.split(" ");
        String[] arrayWord = array.apply(MESSAGE);
        //Arrays.stream(arrayWord)
        List<String> dictionary = Arrays.stream(arrayWord)
                .flatMap(word -> Arrays.stream(word.split(",")))
                .map(String::toLowerCase)
                .distinct()
                .sorted(Comparator.naturalOrder())
                //.forEach(System.out::println);
                .collect(Collectors.toList());
        System.out.println(dictionary);
    }
}
