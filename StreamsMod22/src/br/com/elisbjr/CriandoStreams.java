package br.com.elisbjr;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Elisberto", "Pires", "Teste").stream();

        Stream<String> streamSet = Set.of("Elisberto", "Pires", "Teste").stream();

        Map<String, String> map = Map.of("Elisberto", "Pires");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "esds");
    }
}
