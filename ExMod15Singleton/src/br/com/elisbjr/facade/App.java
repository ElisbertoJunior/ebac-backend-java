package br.com.elisbjr.facade;

public class App {

    public static void main(String[] args) {
        IApartametoService service = new AparatamentoService();
        Boolean newap = service.cadastraAparatemeto(new Apartamento(1L, "endereco 1"));
        System.out.println("O ap foi cadastrado? " + newap);
    }
}
