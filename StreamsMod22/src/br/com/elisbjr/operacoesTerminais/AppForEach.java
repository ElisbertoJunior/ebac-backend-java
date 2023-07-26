package br.com.elisbjr.operacoesTerminais;

import br.com.elisbjr.Pessoa;

import java.util.List;

public class AppForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("***** Brasileiros *****");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equalsIgnoreCase("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(System.out::println);

        //Count
        Long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();
        System.out.println(count);
    }
}
