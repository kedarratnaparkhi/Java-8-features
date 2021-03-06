package org.kedar.impl;

import org.kedar.extras.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Learned from tutorial: https://www.youtube.com/watch?v=VRpHdSFWGPs

public class SupplierReturnsStuff {

    public static void main(String[] args) {
        System.out.println(sampleSupplier());

        System.out.println(sampleSupplier.get());

        System.out.println(predefinedPersonsList.get());
    }

    static List<String> sampleSupplier(){
        return Arrays.asList("adasdasdasd","rqweqweqwe","vzzczc");
    }

    static Supplier<String> sampleSupplier = () -> "hello supp";

    static Supplier<List<Person>> predefinedPersonsList = () -> Arrays.asList(new Person("Kedar", Person.Gender.MALE),
                                                                            new Person("Aisha", Person.Gender.FEMALE),
                                                                            new Person("John", Person.Gender.MALE),
                                                                            new Person("Kelly", Person.Gender.FEMALE),
                                                                            new Person("Frank", Person.Gender.MALE));
}
