package br.com.elisbjr;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Jose Assis", 53465467351L);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Supermercado do Ze LTDA.", "Jose Assis", 1232143557858001l);

        System.out.println("****** Pessoa Fisica ******");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf() + "\n");

        System.out.println("****** Pessoa Juridica ******");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Nome do proprietario: " + pessoaJuridica.getNomeProprietario());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

    }

}