package com.company.textanalysis;

import com.company.textanalysis.model.Check;
import com.company.textanalysis.model.Count;
import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.Counting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Checking checking = new Check();
        Counting counting = new Count();
        Scanner scanner = new Scanner(System.in);

        Boolean restart = true;
        String text = "";
        int e = 0;
        while (e == 0) {
            System.out.println("Please enter a sentence from the words only!");
            text = scanner.nextLine();
            if (checking.determine(text) == true) {
                System.out.println("The sentence is correct!");
                e++;
            }
        }
        System.out.println("Your sentence: " + text);
        System.out.println(counting.identify(text));
        do {
            System.out.println("If you want to exit the program, enter \"exit\", otherwise restart the program.");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                return;
            } else {
                main(args);
            }
        } while (restart);
    }
}
