package br.com.elisbjr.operacoesTerminais;

import br.com.elisbjr.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class AppAllMach {
    public static void main(String[] args) {
        List<Pessoa> list = new Pessoa().popularPessoa();

        //allMach verifica se todos corresponden a condicao passada
        Boolean resullt = list.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(resullt);

    }
}
