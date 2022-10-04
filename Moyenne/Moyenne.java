package Moyenne;

import java.util.Scanner;

public class Moyenne {

    /**
     * @param args5
     */
    public static void main(String[] args) {
        float i, j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour veuillez entrer la note de devoir surveillé :");
        j = sc.nextFloat();
        i = (j * 3);

        System.out.println("Veuillez entrer la note d’interrogation écrite :");

        j = sc.nextFloat();
        i = i + (j * 2);
        System.out.println("Veuillez entrer la note de travaux pratique :");

        j = sc.nextFloat();
        i = i + (j * 1);
        i = i / 6;

        sc.close();
        System.out.println("Votre moyenne est de : " + i);

    }

}
