package org.example;


import io.str_counter.ua.CharacterCounter;
import io.str_counter.ua.CharacterCounterImpl;

import java.util.List;

public class App{

    private static final CharacterCounter counter = new CharacterCounterImpl();

    public static void main(String[] args) {
        List<String> text = List.of("Suppose you want to show these anonymous users a message \n" +
                "that says, “Hello guest.” This is a perfect place to use a \n" +
                "default value with the c:out tag. Just add a default\n" +
                "attribute, and provide the value you want to print if your \n" +
                "expression evaluates to null");

        var result = counter.countCharacters(text);

        result.entrySet().forEach(System.out::println);
    }
}
