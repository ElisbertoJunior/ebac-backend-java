package br.com.elisbjr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().popularPessoa();

        //metodo filter
        Stream<Pessoa> stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"));
        System.out.println(Arrays.toString(stream.toArray()));

        //segunda forma
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil");
        Stream<Pessoa> stream1 = pessoas.stream().filter(pred);

        Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equalsIgnoreCase("Brasil");
            }
        };
    }
}