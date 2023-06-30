package br.com.elisbjr;

public class Student {
    private String name;
    private Double grade1;
    private Double grade2;
    private Double grade3;
    private Double grade4;
    private Double average;


    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double getGrade4() {
        return grade4;
    }

    public void setGrade4(double grade4) {
        this.grade4 = grade4;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(double grade1, double grade2, double grade3, double grade4) {
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
        setGrade4(grade4);
    }

    public void averageCalc() {
        double sumGrades = this.grade1 + this.grade2 + this.grade3 + this.grade4;
        double result = sumGrades / 4;
        setAverage(result);
    }

    public void result() {
        averageCalc();
        System.out.println("****** Dados do aluno ******");
        System.out.println("Nome do aluno: " + this.name);
        System.out.println("Nota do primeiro bimestre: " + this.grade1);
        System.out.println("Nota do segundo bimestre: " + this.grade2);
        System.out.println("Nota do terceiro bimestre: " + this.grade3);
        System.out.println("Nota do quarto bimestre: " + this.grade4);
        System.out.println("Media: " + this.average + "\n");

        System.out.println("****** Resultado ******");

        Boolean approvedStudent = this.average >= 7;
        Boolean recoveryStudent = this.average >= 5 && this.average < 7;

        if (approvedStudent) {
            System.out.println("Parabéns " + this.name + " você foi aprovado!");
        } else if (recoveryStudent) {
            System.out.println("Você terá que se esforcar mais " + this.name + " você esta de recuperação!");
        } else {
            System.out.println("Que pena " + this.name + " você esta reprovado!");
        }

    }
}

