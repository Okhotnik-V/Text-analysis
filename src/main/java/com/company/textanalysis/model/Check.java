package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;

import java.util.regex.Pattern;

public class Check implements Checking {

    @Override
    public boolean determine(String text) {
        try {
            boolean result;
            if (text != null && !text.trim().isEmpty()) {
                result = Pattern.matches("[" + "a-z A-Z" + "]" + "*", text);
            } else {
                result = false;
                System.out.println("Error, a sentence is entered that does not meet the requirements");
            }
            return result;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking text");
            return false;
        }
    }
}
