package com.company;

public class ControlLab3 {

    public static void main(String[] args){
        Calculator cal = new Calculator();
        LogicalOp op = new LogicalOp();
        int [] myArray = op.getArrayHundred();
        int biggest = op.checkBiggerNumber(2,3);
        System.out.println("The bigger number is:" + biggest);
        System.out.println("The text is equal: " + op.text("FastTrackIT","FastTrackIT"));
        System.out.println("The text is not equal: "+ op.text2("FastTrackIT","FastTrackIT"));
        System.out.println("Check text3: " + op.text3("FastTrackIT", 2));
        System.out.println("Check text3: " + op.text3("FastTrackIT", 6));
        System.out.println("Check text4: " + op.text4(9));
        System.out.println("Check text5:  " + op.text5(4));
        op.caseNumber(6);
        System.out.println(op.isNumberEven(15));
        System.out.println("Is eligible to vot: " + op.isEligibleToVote(25));
        System.out.println("Cel mai mare numar: " + op.bigNumber(7,5,6));
        System.out.println(cal.afisareViteza(5,6));
        op.printToHundred(1);
        op.getMinusNumber(1);
        op.printTwoNumbers(1,50);
        op.printTwoParamaetri(5,2);
        op.printEvenNumbers();
        op.printOddNumbers();
        System.out.println(op.getSumHundred());
        System.out.println(op.getAverageFromHundred());
        op.printHundredWhile(1);
        op.printMinusWhile(1);
        op.printTwoParamatrisWhile(1,10);
        op.printTwoParametrisWhile1(1,5);
        op.printEvenNumberWhile();
        op.printOddNumbersWhile();
        op.sumaAverageWHILE();
        op.averageNumberWhile(21,49);
        op.fibonacci();
        op.wozaCozaLoza();
        op.printArray(myArray);
        System.out.println(cal.impartire(10,5,2));
        op.printEvenNumbers();
        System.out.println(op.checkAvreageNumbers(myArray));
        System.out.println(op.checkTrueFalse(new String[]{"Audi"},"Volvo"));
        System.out.println(op.checkNumbers(new int[]{1,2,3,4,5},4));
        op.printGrila();
        op.checkNumbersValues(new int[]{1},5);
        System.out.println(new int[]{1});
     //   op.littleNumber(new int[]{1,5,4,6});
        System.out.println();



        }





    }


