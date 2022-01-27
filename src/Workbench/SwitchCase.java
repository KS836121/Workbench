package Workbench;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość x: "); int x = scanner.nextInt();
        System.out.print("Podaj wartość y: "); int y = scanner.nextInt();
        System.out.print("Suma liczb x+y=: " + ( x+y ) + "\n\n");

        int suma = (x+y);
        if (suma <10)                   System.out.println("wynik poniżej 10");
        if (suma >=10 && suma <= 20)    System.out.println("wynik między 10 a 20");
        if (suma > 20)                  System.out.println("wynik powyżej 20");

        switch (suma) {
            case 30 -> System.out.println("wynik równy 30");
            case 40 -> System.out.println("wynik równy 40");
            case 50 -> System.out.println("wynik równy 50");
            //default -> System.out.println("coś nie gra...");
        }

    }
}

/*
        switch (suma) {
            case 30 : System.out.println("wynik równy 30"); break;
            case 40 : System.out.println("wynik równy 40"); break;
            case 50 : System.out.println("wynik równy 50"); break;
 */