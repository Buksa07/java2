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
    //------------------For Loops-------------------------------
    public void printToHundred(int number){
        for (int i = number; i <= 100; i++ ){
            System.out.println(i);
        }
    }
    public void getMinusNumber(int number){
       for (int i = number; i >= -100; i--){
           System.out.println(i);
       }
    }
//3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda
// sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doile
  //  a(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void printTwoNumbers (int first, int second){

        for (int i = first; i <= second; i++){
            System.out.println(i);
        }
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    // o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este
    // cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void printTwoParamaetri(int x, int y){
        if (x <= y){
        for(x = x; x <= y; x++){
            System.out.println(x);
        }
        }else
            for (y = y; y <=x;y++){
                System.out.println(y);
            }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printEvenNumbers(){
        for(int x = 1; x <= 100;x++){
            if(x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printOddNumbers (){
        for (int x = 1; x <= 100; x++){
            if (x % 2 ==1){
                System.out.println(x);
            }
        }
    }
    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si
    // parametru, iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int getSumHundred(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float getAverageFromHundred(){
        float sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        float avereage =sum / 100;
        return avereage;
    }
    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:


    //----------------- While Loop ---------------
    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void printHundredWhile (int i){
        while (i <= 100){
            System.out.println(i);
            i++;
        }
    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare
    // pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
     public void printMinusWhile (int i){
        while (i >= -100){
            System.out.println(i);
            i--;
        }
     }
     //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru
    // iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void printTwoParamatrisWhile(int x,int y){
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o
    // numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y
    // este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void printTwoParametrisWhile1 (int x, int y){
        if (x < y) {
            while (x <= y){
                System.out.println(x);
                x++;
            }
        }else  if (x > y){
            while (y <= x){
                System.out.println(y);
                y++;
            }
        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printEvenNumberWhile (){
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0)
            System.out.println(x);
            x++;
        }
    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printOddNumbersWhile (){
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 1)
                System.out.println(x);
            x++;
        }
    }
    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumaAverageWHILE() {
        int x = 111;
        float count = 0;
        int sum = 0;
        while (x <= 8899) {
            sum += x;
            count++;
            x++;
        }
        System.out.println("Suma numerelor : " + sum);
        System.out.println("Media numerelor : " + sum / count);
    }
    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
    // din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float averageNumberWhile (int x, int y){
        float count =0F;
        float sum = 0F;
        while (x <= y) {
            if(x % 7 == 0){
                count += 1;
                sum += x;
            }
            x ++;
        }
        float average = sum/count;
        System.out.println("Media numerelor :" + sum);
        return average;
    }
    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void fibonacci() {

        int count = 20;

        int num1 = 0;

        int num2 = 1;

        int i=1;

        while(i<=count)

        {

            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;
        }
    }

    public void wozaCozaLoza () {
        int x = 1;
        while (x <= 110){
            if ((x % 3 == 0) &&(x % 5 == 0) &&(x % 7 == 0) ){
                System.out.println("CozaLozaWoza");
            }else if ((x % 7 == 0) && (x % 5== 0)){
                System.out.println("WozaLoza");
            }else if ((x % 3 == 0) &&(x % 5 ==0)){
                System.out.println("CozaLoza");
            }else if ((x % 3 == 0) & (x % 7 == 0)){
                System.out.println("CozaWoza");
            }else if (x % 5 == 0){
                System.out.println("Loza");
            }else if (x % 7== 0){
                System.out.println("Woza");
            }else if (x % 3 ==0){
                System.out.println("Coza");
            }else {
                System.out.println(x + "");
            }
            x++;
            if (x % 11 == 0){
                System.out.println();
            }

        }
    }
    //-------------------ARRAYS-----------------------

   //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
   // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] getArrayHundred (){
        int[] array =  new int[100];
        for (int i = 0; i < 100; i++){
            array[i]= i+1;
        }
        return array;
    }
    public void printArray (int [] array){
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array [i]);
        }
    }
    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.


    public int[] checkEvenNumbers () {
        int [] array = new int[100];
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
            }
        }
        return array;
    }

    public void printEvenNumbers (int [] array){
        for (int i = 0; i <= array.length; i++){
            System.out.println(array[i]);
        }
    }
    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public float checkAvreageNumbers(int[] array) {
        float media = 0;
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        media = sum/array.length;
        return media;
    }
    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
    // si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
   // Cum se apeleaza o meotda care are ca si parametru un ray?

    public boolean checkTrueFalse (String[] arrayString, String x) {
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i] == x) {
                return true;
            }
        }
        return false;
    }


    //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
    // si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int checkNumbers(int[] array, int nr){
        int sum = 0;
        for (int i=0;i< array.length;i++){
            if (array[i]== nr){
                System.out.println("Numarul se afla in array iar pozitia este :");
                sum = i;
            }
        } return sum;
    }
    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    public String[] printGrila () {

        String[] grila = new String[10];
        grila[0]= "--------- \n" +
                  "---------\n" +
                  "---------\n" +
                  "---------\n" +
                  "---------\n" +
                  "---------\n" +
                  "---------";

        System.out.println(grila[0]);
        return grila;
    }
    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    // si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
    // sa returneze array-ul primit, fara acel numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int checkNumbersValues(int [] array,int x){
        int sum =0;
        for (int i = 0;i<array.length; i++){
            if (array[i]== x);
            System.out.println("Da este array-ul primit");
        }
        return sum;
    }
    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
   // public void littleNumber (int[] array){
    //   int i = 0;
      //  int nr = 0;
      //  int[] newArray = new int[10];
     //   array[0] = 1;
     //    array[1] = 8;
     //    array[2] = 7;
    //     array[3] = 10;
     //    array[4] = 13;
     //   int aux = 0;
      // for (i = 0;i <= array.length;i++){
      //     if (array[i] < array[i+1]){
       //       newArray[10] = array[i];
       //    }
        //   else{
         //      aux = array[i];
         //      array[i] = array[i+1];
         //      array[i+1] = aux;
       //    }
      // }
     //   nr = array[i+1];
      //  System.out.println("Al doilea cel mai mic nr :" + nr);
 //  }
   //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
   public int[] copyArray(int[] firstArray, int[] emptyArray) {

       for (int i = 0, j = 0; i < firstArray.length; i++) {

           emptyArray[j] = firstArray[i];

           j++;

       }

       return emptyArray;

   }





}
