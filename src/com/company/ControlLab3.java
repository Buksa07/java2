package com.company;

public class ControlLab3 {

    public static void main(String[] args){
        Calculator cal = new Calculator();
        LogicalOp op = new LogicalOp();
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
        }





    }


