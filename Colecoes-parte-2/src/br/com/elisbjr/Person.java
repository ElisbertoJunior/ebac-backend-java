package br.com.elisbjr;

<<<<<<< HEAD
=======
import java.util.Objects;
>>>>>>> origin/master

public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }



    public String getGender() {
        return gender;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
