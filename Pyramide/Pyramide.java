package Pyramide;

import java.util.Scanner;

public class Pyramide {

    public static void main(String[] args) {
        int i, j, k, l = 1;
        String str = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour veuillez entrer un nombre de ligne pour la pyramide :");
        j = sc.nextInt();

        for (i = (j-1); i >= 0; i--) {
            for (k = 0; k < i; k++) {
                str = str + " ";
            }
            for (k = 0; k < l; k++) {
                str = str + "*";
            }
            System.out.println(str);
            str = "";
            l = l + 2;
        }
        sc.close();
    }
}
