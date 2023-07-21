package br.com.elisbjs.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AppReflections {
    public static void main(String[] args) {
        Class clazz = Produto.class;
        System.out.println(clazz);

        //mesma coisa de forma diferente
        Produto prod = new Produto();
        Class clazz1 = prod.getClass();
        System.out.println(clazz1);

        //Instanciando atravez da reflection
        try {
            Constructor cons = clazz1.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields) {
                Class<?> type = field.getType();
                String nome = field.getName();
                System.out.println(type);
                System.out.println(nome);
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
