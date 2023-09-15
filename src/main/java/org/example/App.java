package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            String menu = """
                    Elpriser
                    ========
                    1. Inmatning
                    2. Min, Max och Medel
                    3. Sortera
                    4. Bästa Laddningstid (4h)
                    e. Avsluta
                    """;

            System.out.print(menu);
            choice = scanner.nextLine();
            //Add code for choices 1 to 4

        }while(!choice.equalsIgnoreCase("e"));







    }
}
