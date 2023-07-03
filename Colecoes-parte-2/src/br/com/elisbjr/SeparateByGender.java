package br.com.elisbjr;

import java.util.*;

public class SeparateByGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> maleGroup = new HashSet<>();
        Set<Person> girlGroup = new HashSet<>();

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            String gender = scanner.nextLine();

            Person newPerson = new Person(name, gender);

            if(newPerson.getGender().equalsIgnoreCase("M")) {
                maleGroup.add(newPerson);
            } else if (newPerson.getGender().equalsIgnoreCase("F")) {
                girlGroup.add(newPerson);
            } else {
                System.out.println("Sexo inválido. Por favor, tente novamente.");
            }
        }


        System.out.println("***** Grupos ***** \n");


        System.out.println("Grupo Masculino:");
        for(Person men : maleGroup) {
            System.out.println("Nome: " + men.getName());
            System.out.println("Sexo: " + men.getGender() + " \n");
        }

        System.out.println("Grupo Feminino:");
        for(Person girl : girlGroup) {
            System.out.println("Nome: " + girl.getName());
            System.out.println("Sexo: " + girl.getGender() + " \n");
        }
    }
}
