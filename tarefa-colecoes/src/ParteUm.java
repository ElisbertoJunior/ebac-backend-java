import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ParteUm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por ,: ");

        String res = scanner.next();
        String[] namesList = res.split(",");

        Arrays.sort(namesList, Comparator.comparing(String::toLowerCase));

        for(String person : namesList) {
            System.out.println(person);
        }

    }
}