package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<Integer>();
        myList.add(2);
        myList.add(3);


        Scanner scan = new Scanner(System.in);
        Read read = new Read();

        int x= read.getInt();


        double z = scan.nextDouble();

        try {
            System.out.println("Enter the position on display.");
            System.out.println(myList.get(read.getInt()));
        }catch (IndexOutOfBoundsException e){
            System.out.println("The position is invalid !");
        }catch (InputMismatchException e){
            System.out.println("Incorect value");
        }

        System.out.println(myList.size());

    }

}
