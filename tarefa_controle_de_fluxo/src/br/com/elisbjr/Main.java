package br.com.elisbjr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        Scanner inputName = new Scanner(System.in);
        String studentName = inputName.next();

        System.out.println("Dígite a nota do primeiro bimestre: ");
        Scanner firstInputGrade = new Scanner(System.in);
        Double firstGrade = firstInputGrade.nextDouble();

        System.out.println("Dígite a nota do segundo bimestre: ");
        Scanner secondInputGrade = new Scanner(System.in);
        Double secondGrade = secondInputGrade.nextDouble();

        System.out.println("Dígite a nota do terceiro bimestre: ");
        Scanner thirdInputGrade = new Scanner(System.in);
        Double thirdGrade = thirdInputGrade.nextDouble();

        System.out.println("Dígite a nota do quarto bimestre: ");
        Scanner fourthInputGrade = new Scanner(System.in);
        Double fourthGrade = fourthInputGrade.nextDouble();

        student.setName(studentName);
        student.setGrades(firstGrade,secondGrade, thirdGrade, fourthGrade);
        student.result();

    }

}