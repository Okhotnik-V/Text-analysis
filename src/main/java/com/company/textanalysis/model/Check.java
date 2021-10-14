package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check implements Checking {

    @Override
    public boolean determine(String text) {
        boolean result;
        if (text != null && !text.trim().isEmpty()) {
            Pattern pattern = Pattern.compile("[" + "a-z A-Z" + "]" + "*");
            Matcher matcher = pattern.matcher(text);
            result = matcher.matches();
        } else {
            result = false;
        }

        if (result == false) {
            System.out.println("Error, a sentence is entered that does not meet the requirements");
        }
        return result;
    }
}
