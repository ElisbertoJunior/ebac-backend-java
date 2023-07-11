import fruta.Banana;
import fruta.Fruta;
import fruta.Maca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        GenericEntry<String, Long> entry = new GenericEntry<String, Long>("testando", 10L);
        System.out.println(entry.getData() + " - " + entry.getCode());

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFruta(frutas);
    }

    public static void imprimirFruta(List<? extends Fruta> lista) {
        for(Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }
}