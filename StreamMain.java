package be.technofuturtic.programmation_en_java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {


        Integer[] nombres = {4, 38, 75, 62, 14, 5, 95, 39, 40, 22, 3};
        Stream.of(nombres)
                .filter(c -> c > 40)
                .forEach(System.out::println);

        System.out.println();

        int[] intNombres = {4, 38, 75, 62, 14, 5, 95, 39, 40, 22, 3};
        IntStream.of(intNombres)
                .filter(c -> c > 40)
                .forEach(System.out::println);

        System.out.println();

        IntStream.of(4, 38, 75, 62, 14, 5, 95, 39, 40, 22, 3)
                .filter(c -> c > 40)
                .forEach(System.out::println);

        System.out.println();


        List<String> heroes = new ArrayList<String>();
        heroes.add("Blade");
        heroes.add(1, "Gambit");
        heroes.add("Wolverine");
        heroes.add("Nina");

        List<String> newHeroes = heroes
                .stream()
                .filter((s) -> s.contains("e"))
                .collect(Collectors.toList());
        System.out.println(newHeroes);
    }
}
