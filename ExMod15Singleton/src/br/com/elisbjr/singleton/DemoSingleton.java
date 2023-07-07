package br.com.elisbjr.singleton;

public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        //repare que a classe e instanciada apenas uma vez

        //Com priedade
        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Ola mundao!");
        SingletonPropriedade singletonPropriedade1 = SingletonPropriedade.getInstance("Ola mundao! 2");
        System.out.println(singletonPropriedade.getValue());
        System.out.println(singletonPropriedade1.getValue());
        //repare que o valor nao muda pois a clesse instanciada apenas a primeira vez

    }
}
