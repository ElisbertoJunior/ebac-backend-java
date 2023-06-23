package br.com.elisbjr;

public class PessoaAcordando {
    public static void main(String[] args) throws InterruptedException {
        boolean despertador = true;

        System.out.println("A pessoa está dormindo...");
        Thread.sleep(5000);

        if (despertador) {
            System.out.println("O despertador tocou!");
            Thread.sleep(2000);
            System.out.println("A pessoa abre os olhos e se espreguiça.");
            Thread.sleep(3000);
            System.out.println("A pessoa levanta da cama.");
        }
    }
}
