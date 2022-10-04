package Additionneur;

import java.util.Scanner;

public class Additionneur {

    /**
     * @param args5
     */
    public static void main(String[] args) {
        float i, j = 0;

        System.out.println("Bonjour veuillez entrer deux nombres entiers!");

        try {
            Scanner sc = new Scanner(System.in);

            i = sc.nextFloat();
            j = sc.nextFloat();

            sc.close();
            System.out.println("le nombre " + i + " additionné au nombre " + j + " = ");
            i = i + j;
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Format incorrect");
            System.exit(0);
        }

    }
}