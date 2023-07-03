import java.util.*;

public class ParteDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes e sexo separado por , (Exemplo: Maria-Feminino): ");

        String res = scanner.next();

        String[] list = res.split(",");
        ArrayList<String> menList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();

        Arrays.sort(list, Comparator.comparing(String::toLowerCase));

        addList(list, menList, womenList);
        menList.sort(Comparator.comparing(String::toLowerCase));
        womenList.sort(Comparator.comparing(String::toLowerCase));

        System.out.println("****** Homens ******");
        printNames(menList);

        System.out.println("****** Mulheres ******");
        printNames(womenList);


    }

    public static void addList(String[] list, ArrayList<String> menList, ArrayList<String> womenList) {
        for(String person : list) {
            if(person.contains("Masculino")) {
                menList.add(person);
            } else if (person.contains("Feminino")) {
                womenList.add(person);
            } else {
                System.out.println("Dados invalidos! Favor digitar da forma correta");
                break;
            }
        }
    }

    public static void printNames(ArrayList<String> list) {
        for (String name : list) {
            int indiceHifen = name.indexOf("-");
            System.out.println(name.substring(0, indiceHifen));
        }
    }


}
