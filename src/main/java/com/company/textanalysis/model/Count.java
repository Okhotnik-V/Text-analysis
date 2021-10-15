package com.company.textanalysis.model;

import com.company.textanalysis.Main;
import com.company.textanalysis.ui.Counting;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Count extends Main implements Counting {

    @Override
    public String identify(String text) {
        try {
            Map<Integer, String> vowelsMap = new HashMap<>();
            Map<Integer, String> consonantsMap = new HashMap<>();
            int vowelsQuantity = 0, consonantsQuantity = 0;
            String replace = text.replaceAll("\\s+", "");
            char[] textToArrey = replace.toCharArray();
            for (int i = 0; i < textToArrey.length; i++) {
                if (Pattern.matches("[" + "a A e E i I o O u U y Y" + "]", String.valueOf(textToArrey[i]))) {
                    vowelsQuantity++;
                    vowelsMap.put(vowelsQuantity, String.valueOf(textToArrey[i]));
                } else {
                    consonantsQuantity++;
                    consonantsMap.put(consonantsQuantity, String.valueOf(textToArrey[i]));
                }
            }
            return "Counting vowels and consonants:" + "\n"
                    + "Vowels: " + vowelsQuantity + " " + vowelsMap + "\n"
                    + "Consonants: " + consonantsQuantity + " " + consonantsMap;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking vowels and consonants \n \"Write sentences to check and find vowels and consonants\"");
            main(super.args);
            return null;
        }
    }
}