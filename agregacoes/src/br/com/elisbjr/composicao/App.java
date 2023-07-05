package br.com.elisbjr.composicao;

public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(1L);
        banco.setNome("Santander");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(20d);

        ContaPoupanca cd = new ContaPoupanca();
        cd.setBanco(banco);
        cd.setSaldo(200d);

    }

}
