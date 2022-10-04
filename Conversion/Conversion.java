package Conversion;

import java.util.Scanner;

public class Conversion {
    /**
     * @param args5
     */
    public static void main(String[] args) {
        float i;

        System.out.println("Bonjour veuillez entrer une température en degrés Fahrenheit :");

        Scanner sc = new Scanner(System.in);

        i = sc.nextFloat();

        sc.close();
        System.out.println("la température de " + i + " ° Fahrenheit correspond à ");
        i = i - 32;
        i = i * 5;
        i = i / 9;
        System.out.println(i + " ° Celsius ! ");

    }
}
