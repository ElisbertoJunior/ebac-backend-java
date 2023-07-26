package br.com.elisbjr.operacoesIntermediarias;

import br.com.elisbjr.Pessoa;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppMap {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasi"))
                .map(Pessoa::getIdade);

        IntStream stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .mapToInt(Pessoa::getIdade);

    }
}
