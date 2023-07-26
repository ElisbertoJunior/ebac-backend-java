package br.com.elisbjr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome e o sexo separado por virgula , (Exemplo: Maria,Feminino) ou (sair) para terminar lista: ");
            String entry = scanner.next();

            if(entry.equalsIgnoreCase("sair")) break;

            String[] separedString = entry.split(",");
            addList(separedString, list);
        }

        System.out.println("Lista de mulheres: ");

        list.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Feminino"))
                .forEach(person -> System.out.println(person.getName()));

    }

    public static void addList(String[] array, List<Person> list) {
        if (array.length >= 2) {
            String name = array[0];
            String gender = array[1];

            boolean isValidGender = gender.equalsIgnoreCase("Feminino") || gender.equalsIgnoreCase("Masculino");

            if(isValidGender) {
                list.add(new Person(name, gender));
            } else {
                System.out.println("Genero invalido! Favor digite Masculino ou feminino.");
            }


        } else {
            System.out.println("A String não possui duas partes separadas por virgula.");
        }
    }

}
