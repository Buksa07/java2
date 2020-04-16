//import com.sun.security.jgss.GSSUtil;

//import java.util.Enumeration;

public class Metode {
    public static void main(String[] args){
        printMyName("Ionut");
        adunare(5,6);
        impartire(8,4);
        inmultire(2,3);
        scadere(10,5);
        Java();
        myInt(5,7,8);
        Frankestein();
        Impartire(78,9);
        Celsius(78);
        Metri(50);
        Metri(75);
        afisareViteza(118,17);


    }
    public static void printMyName(String nume){
        System.out.println("Salut" + "\n"  + nume + "!");
    }
    public static void adunare(int a, int b){
        int rezultat = a + b;
        System.out.println("5+6= " + rezultat);
    }
    public static void impartire(int a, int b){
        int rezultat = a / b;
        System.out.println("8/4= " + rezultat);
    }
    public static void inmultire(int a, int b){
        int rezultat= a * b;
        System.out.println("2*3= " + rezultat);
    }
    public static void scadere(int a, int b){
        int rezultat = a - b;
        System.out.println("10-5= " + rezultat);
    }
    public static void Java() {
        System.out.println("    J  " + "   a " + "  v         v" + "   a");
        System.out.println("    J  " + " a  a" + "   v      v" + "   a  a");
        System.out.println(" J  J  " + "aaaaaa" + "   v   v" + "    aaaaaa");
        System.out.println("  JJ" + " a       a" + "    v" + "    a       a");


    }
    public static float myInt ( float a,float b, float c){
        float rezultat = (a + b + c) /3;
        System.out.println("Media =" + rezultat );
        return rezultat;

    }

    public static void Frankestein (){

        System.out.println("  +" + "'' '' '' ''" + "+");
        System.out.println(" [|" + "   O   O   |" + "]");
        System.out.println("  |     ^     |");
        System.out.println("  |" + "   ' _ '" +  "   |");
        System.out.println("  |"+"     "+ "      |");
        System.out.println("  +" + "'' '' '' ''" + "+");
    }
    public static int Impartire (int a, int b){
        int Imp = a % b;
        System.out.println("Rezulatul= " + Imp);
        return Imp;


    }
    // 7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura
    // in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public static float Celsius(float temp_fahrenheit) {
        float nr1 = 5;
        float nr2 = 9;
        float nr3 = 32;
        float temp_celsius = nr1/nr2 * (temp_fahrenheit -32);

        System.out.println("Temperatura in celsius= " + temp_celsius);
        return temp_celsius;
    }
    //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa
    // reprezinte distanta in inch, si sa returneze distanta in metrii
    // m = inch/39.370
    public static float Metri (float Inch){
        float nr1 =39.370F;
        float m = Inch/ nr1;
        System.out.println("Valoarea transformata din Inch in m =" + m);
        return m;
    }
    //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
    // si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
    // V=d/t
    public static float afisareViteza(float distanta, float timp){
        float viteza1 = distanta/timp;
        float viteza2 = viteza1 * 3.6F;
        float viteza3 = viteza1 * 2.236936292054F;

        System.out.println("Viteza in m/s= " + viteza1);
        System.out.println("Viteza in km/h= " + viteza2);
        System.out.println("Viteza in mile/h= " + viteza3);

        return viteza1;
    }


}







