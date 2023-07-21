package br.com.elisbjr;

public class TesteLambdaThreads {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(r).start();

        //Lambda
        Runnable rLambda = () -> System.out.println("Executando rLambda");
        new Thread(rLambda).start();

        //maneira ainda mais simplicada
        new Thread(() -> System.out.println("Executando rLambda1")).start();
    }
}
