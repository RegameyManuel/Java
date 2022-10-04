package Voyelle;

import java.util.Scanner;

public class Voyelle {

    public static void main(String[] args) {
        int i, j = 0;
        String str, aei = "aeiouy";

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour veuillez entrer votre texte :");
        str = sc.next();

        /* 3 solutions */

        /*******************************************************/
        /* j = (str.replaceAll("(?i)[^aeiouy]", "")).length(); */
        /*******************************************************/

        /*
         * for (i = 0; i < str.length(); i++) {
         * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
         * str.charAt(i) == 'o'
         * || str.charAt(i) == 'u') {
         * j++;
         * }
         * }
         */

        for (i = 0; i < str.length(); i++) {
            if (aei.indexOf(str.substring(i, i + 1)) != -1) {
                j++;
            }

        }

        sc.close();
        System.out.println("Le texte comporte " + j + " voyelles!");

    }

}
