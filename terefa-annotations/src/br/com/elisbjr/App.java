package br.com.elisbjr;

public class App {
    public static void main(String[] args) {
        ClasseComAnotacao myInstance = new ClasseComAnotacao("Jose");
        Class<?> myClass = myInstance.getClass();

        try {
            if(myClass.isAnnotationPresent(Tabela.class)) {
                Tabela tebelaAnnotation = myClass.getAnnotation(Tabela.class);
                String nomeDaTabela = tebelaAnnotation.value();
                System.out.println("Nome da tabela: " + nomeDaTabela);
            }  else {
                System.out.println("A annotation Tabela não está presente na classe.");
            }
        } catch (NullPointerException e) {
            System.out.println("A anotação está presente, mas não possui o atributo 'nome' configurado.");
        }
    }
}
