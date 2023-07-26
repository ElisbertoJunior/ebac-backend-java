package br.com.elisbjr.operacoesTerminais;

import br.com.elisbjr.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AppOptional {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().popularPessoa();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if(opcional.isPresent()) {
            System.out.println(opcional.get());
        }
        //forma mais resumida
        //opcional.ifPresent(System.out::println);
    }
}
