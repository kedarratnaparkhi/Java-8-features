package org.kedar.extras;

import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private Gender gender;
    private Long number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Person(String name, Gender gender, Long number){
        this.name = name;
        this.gender = gender;
        this.number = number;
    }

    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public enum Gender{
        MALE, FEMALE;
    }

    @Override
    public String toString(){
        return "name: "+this.name+", gender: "+this.gender;
    }

    public static List<Person> persons = Arrays.asList(new Person("Kedar", Gender.MALE),
                                                       new Person("Aisha", Gender.FEMALE),
                                                       new Person("John", Gender.MALE),
                                                       new Person("Kelly", Gender.FEMALE),
                                                       new Person("Frank", Gender.MALE));
}
