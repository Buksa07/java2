package com.company;

public class Calculator {
    public int adunare(int a, int b){
        int rezultat = a + b;
        return rezultat;
    }
    public  int impartire(int a, int b){
        int rezultat = a / b;
        return rezultat;
    }
    public  int inmultire(int a, int b){
        int rezultat= a * b;
        return rezultat;
    }
    public int scadere(int a, int b){
        int rezultat = a - b;
        return rezultat;
    }
    public static int Impartire (int a, int b){
        int Imp = a % b;
        System.out.println("Rezulatul= " + Imp);
        return Imp;


    }
    // 7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura
    // in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public float Celsius(float temp_fahrenheit) {
        float nr1 = 5;
        float nr2 = 9;
        float nr3 = 32;
        float temp_celsius = nr1/nr2 * (temp_fahrenheit -32);

        return temp_celsius;
    }
    //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa
    // reprezinte distanta in inch, si sa returneze distanta in metrii
    // m = inch/39.370
    public  float Metri (float Inch){
        float nr1 =39.370F;
        float m = Inch/ nr1;
        System.out.println("Valoarea transformata din Inch in m =" + m);
        return m;
    }
    //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
    // si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
    // V=d/t
    public  float afisareViteza(float distanta, float timp){
        float viteza1 = distanta/timp;
        float viteza2 = viteza1 * 3.6F;
        float viteza3 = viteza1 * 2.236936292054F;

        System.out.println("Viteza in m/s= " + viteza1);
        System.out.println("Viteza in km/h= " + viteza2);
        System.out.println("Viteza in mile/h= " + viteza3);

        return viteza1;
    }

}
