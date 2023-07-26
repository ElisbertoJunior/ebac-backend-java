package br.com.elisbjr;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class WomenTest {
    @Test
    public void allWomen() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Maria", "Feminino"));
        list.add(new Person("João", "Masculino"));
        list.add(new Person("Ana", "Feminino"));

        Stream<Person> womenList = list.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Feminino"));
        womenList.forEach(person -> assertEquals("Feminino", person.getGender()));
    }
}
