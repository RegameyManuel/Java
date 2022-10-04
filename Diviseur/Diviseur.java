package Diviseur;

import java.util.Scanner;

public class Diviseur {

    /**
     * @param args5
     */
    public static void main(String[] args) {
        float i, j = 0;

        System.out.println("Bonjour veuillez entrer deux nombres entiers!");

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Le dividende :");

            i = sc.nextFloat();

            System.out.println("et le diviseur :");
            j = sc.nextFloat();
            if (j == 0) {
                System.out.println("Division par zéro impossible !!!");
                System.exit(0);
            }

            sc.close();
            System.out.println("le nombre " + i + " divisé par le nombre " + j + " = ");
            i = i / j;
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Format incorrect");
            System.exit(0);
        }

    }
}