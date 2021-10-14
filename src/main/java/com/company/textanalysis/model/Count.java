package com.company.textanalysis.model;

import com.company.textanalysis.ui.Counting;

import java.util.HashMap;
import java.util.Map;

public class Count implements Counting {

    @Override
    public String identify(String text) {
        Map<Integer, String> vowelsMap = new HashMap<>();
        Map<Integer, String> consonantsMap = new HashMap<>();
        int vowelsQuantity = 0, consonantsQuantity = 0;
        String replace = text.replaceAll("\\s+", "");
        char[] textToArrey = replace.toCharArray();
        for (int i = 0; i < textToArrey.length; i++) {
            if (textToArrey[i] == 'a' || textToArrey[i] == 'e' || textToArrey[i] == 'i' || textToArrey[i] == 'o' || textToArrey[i] == 'u') {
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
    }
}
