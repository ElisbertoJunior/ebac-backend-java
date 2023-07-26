package br.com.elisbjr.operacoesIntermediarias;

import br.com.elisbjr.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AppSorted {
    List<Pessoa> lista = new Pessoa().popularPessoa();

    Stream<Pessoa> stream = lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
            .sorted(Comparator.comparing(Pessoa::getNome));

    Stream<Pessoa> stream1 = lista.stream()
            .sorted(Comparator.comparing(Pessoa::getIdade));

    Stream<Pessoa> stream2 = lista.stream()
            .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));

}
