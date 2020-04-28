package com.company;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return first;
        }

    }

    // Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze
    // “Learning text comparison”. Daca nu, atunci metoda sa returneze “Got to try some more”
    public String text(String first, String second) {

        if (first.equals(second)) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String text2(String first1, String second2) {
        if (!first1.equals(second2)) {
            return "Learning text comparision";
        } else {
            return "Got to try some more";
        }
    }

    public String text3(String first1, int x) {
        if (first1.equals("FastTrackIT") && x <= 3) {
            return first1 + x;
        } else if (!first1.equals("FastTrackIT") && x >= 4) {
            return first1 + x;
        } else {
            return "Nici o conditie";
        }
    }

    public String text4(int x) {
        if (x > 8 || x == 6) {
            return "The amount of snow this winter was (cm): " + x;
        } else {
            return "The forecast snow is(cm): " + x;
        }
    }

    //Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare
    // decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul
    // este mai mic de 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a
    // verifica daca functioneaza.
    public String text5(int x) {
        if (x > 3 && x != 4) {
            return "The number is greater than 3 and not equal to 4 ";
        }
        if (x == 4) {
            return "The number is equal to 4 ";
        }
        if (x < 3) {
            return "The number is lower than 3 ";
        } else {
            return "Nu-i nici una";
        }
    }

    //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
    // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg
    // textul cu tot cu numar pentru fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void caseNumber(int x) {

        switch (x) {
            case 1:
                System.out.println("The number is : 1");
                break;
            case 2:
                System.out.println("The number is : 2");
                break;
            case 3:
                System.out.println("The number is : 3");
                break;
            case 4:
                System.out.println("The number is : 4");
                break;
            case 5:
                System.out.println("The number is : 5");
                break;
            case 6:
                System.out.println("The number is : 6");
                break;
            default:
                System.out.println("Nu e nici una de mai sus");
        }
    }
    //Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
    // si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar
    // daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isNumberEven ( int x){
        if(x % 2 == 0){
            return true;
        }
         else {
             return false;
        }
    }
    //Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
    // care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu,
    // sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isEligibleToVote (int x){
        if (x > 18){
            return true;
        }
        else{
            return false;
        }
    }
    //Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int bigNumber (int x, int y, int c){

        if ((x > y) && (x > c)){
            return x;
        } if ((y > x) && (y > c)){
            return y;
        } if ((c > x) && (c > y)){
            return c;
        }else return x;
    }
}
