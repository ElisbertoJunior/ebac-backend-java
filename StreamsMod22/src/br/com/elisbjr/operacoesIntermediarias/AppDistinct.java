package br.com.elisbjr.operacoesIntermediarias;

import br.com.elisbjr.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class AppDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
