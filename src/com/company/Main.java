package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        System.out.println("Ionut");

        //  Printati rezultatul sumei a doua numere(orice numere)

        int a = 10;
        int b = 5;
        int suma = a + b;
        System.out.println("rezultatul sumei = " + suma);

        // Printati rezultatul impartirii a doua numere. Atentie,
        // daca numarul nu este intreg, sa afiseze si valorile dupa virgula.

        float x = 145;
        float y = 7;
        float impartiri = x / y;
        System.out.println("rezultaul impartirii = " + impartiri);

        // a. -5 + 8 * 6

        int nr1 = -5;
        int nr2 = 8;
        int nr3 = 6;
        int operatie = nr1 + (nr2 * nr3);
        System.out.println("Rezultatul operatiei = " + operatie);

        // b. (55+9) % 9

        int nr4 = 55;
        int nr5 = 9;
        int nr6 = 9;
        int operatie1 = (nr4 + nr5) % nr6;
        System.out.println("Rezultatul operatiei = " + operatie1);

        // c. 20 + -3*5 / 8

        float nr7 = 20;
        float nr8 = -3;
        float nr9 = 5;
        float nr10 = 8;
        float operatiei2 = nr7 + (nr8*nr9) / nr10;
        System.out.println("Rezultatul operatiei = " + operatiei2);

        // d. 5 + 15 / 3 * 2 - 8 % 3

        float nr11 = 5;
        float nr12 = 15;
        float nr13 = 3;
        float nr14 = 2;
        float nr15 = 8;
        float nr16 = 3;
        float operatiei3 = nr11 + (nr12 / nr13 * nr14) - nr15 % nr16;
        System.out.println("Rezultatul operatiei = " + operatiei3);

        float c = 8;
        float d = 3;
        float e = c % d;
        System.out.println(e);

        int i = 8;
        int j = 4;
        int h = i % j;
        System.out.println(h);

        System.out.println("ceva: " + 3 +5);

    }

}
