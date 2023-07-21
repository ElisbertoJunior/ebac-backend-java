package br.com.elisbjr.anonimas;

public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer eventConsumer = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };

        eventConsumer.consumer("teste anonimo");

        //Lambda
        MyEventConsumer eventLambda = (Object value) -> System.out.println(value);
        eventLambda.consumer("Lambda");


    }
}
