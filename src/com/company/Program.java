package com.company;


import com.sun.source.tree.CompilationUnitTree;

import java.util.List;

public class Program {
   private Read read = new Read();
   private Calculator calc = new Calculator();
   private LogicalOp op = new LogicalOp();

   public void startProgram(){
        boolean repeatProgram = true;
        do {
           repeatProgram = executeProgram();
        }while (repeatProgram);
        }




    private boolean executeProgram() {
        printMenu();
        int number = read.getInt();
        switch (number) {
            case 1:
                doAdunare();
                break;
            case 2:
                doScadere();
                break;
            case 3:
                doImpartire();
                break;
            case 4:
                doInmultire();
                break;
            case 5:
                printHigherNumber();
                break;
            case 6:
                checkText();
                break;
            case 7:
                convertInchtoMeters();
                break;
            case 8:
                convertCelsiustoFirenhit();
                break;
            case 9:
                afisareViteza();
                break;
            case 10:
                evenNumber();
                break;
            case 11:
                bigNumber();
                break;
            case 12:
                Vote();
                break;
            case 0:
                System.out.println("Thank you for using our app!");
                return false;

            default:
                printMenu();
        }
        return true;
    }

    private void printMenu(){
        System.out.println(
                "Hello!\n" +
                        "Chose an option:\n" +
                        "1.Adunare\n" +
                        "2.Scadere\n" +
                        "3.Impartire\n" +
                        "4.Inmultire\n" +
                        "5.Cel mai mare numar\n"+
                        "6.Check text\n"+
                        "7.Convert Inch to Meters\n"+
                        "8.Convert Celsius to Faranhait\n"+
                        "9. Afisare vitezei\n"+
                        "10. Even Number\n"+
                        "11. Numarul mai mare este\n"+
                        "12.Este permis sa voteze\n"+
                        "\n"+
                        "0.EXIT"
        );
    }

    private void doAdunare(){
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul adumari este "+ calc.adunare(first,second));
    }
    private void doScadere(){
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul scaderi este: "+ calc.scadere(first,second));
    }
    private void doImpartire(){
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul impartiri este: "+ calc.impartire(first,second));
    }
    private void doInmultire(){
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Rezultatul inmultiri este: "+ calc.inmultire(first,second));
    }
    private void printHigherNumber(){
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        int thre = read.getInt();
        System.out.println("Numarul mai mare este: "+ op.bigNumber(first,second,thre));
    }
    private void checkText(){
        System.out.println("Enter text");
        String text = read.getString();
        System.out.println(op.text(text));
    }
    private void convertInchtoMeters(){
        System.out.println("Convert inch to Meters : ");
        System.out.println("Introdu numarul care reprezinta Inch:");
        int Inch = read.getInt();
        System.out.println("Rezultutaul este :" + calc.Metri(Inch)  + "metri");

    }
    private void convertCelsiustoFirenhit(){
        System.out.println("Introdu numarul care reprezinta Celsius");
        int Celsiius = read.getInt();
        System.out.println("Rezultatul este :" + calc.Celsius(Celsiius) + " Firenhit");
    }
    private void afisareViteza(){
        System.out.println("Introdu 2 numere care reprezinta viteza");
        int Viteza = read.getInt();
        int Afisare = read.getInt();
        System.out.println("Rezultatul este :" + calc.afisareViteza(Viteza,Afisare));
    }
    public void evenNumber (){
        System.out.println("Introdu un numar :");
        int Number = read.getInt();
        System.out.println("Rezultatul este :" + op.isNumberEven(Number));
    }
    public void bigNumber(){
        System.out.println("Introdu 3 numere :");
        int x = read.getInt();
        int y = read.getInt();
        int z = read.getInt();
        System.out.println("Numarul mai mare este :" + op.bigNumber(x,y,z));
    }
    public void Vote(){
        System.out.println("Introdu varsta :");
        int Vote = read.getInt();
        System.out.println("Drept de vot :" + op.isEligibleToVote(Vote) );
    }

}
