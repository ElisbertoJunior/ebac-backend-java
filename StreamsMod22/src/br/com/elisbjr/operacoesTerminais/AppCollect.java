package br.com.elisbjr.operacoesTerminais;

import br.com.elisbjr.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class AppCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        List<Pessoa> listaBrasil = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());
        listaBrasil.forEach(System.out::println);
    }
}
