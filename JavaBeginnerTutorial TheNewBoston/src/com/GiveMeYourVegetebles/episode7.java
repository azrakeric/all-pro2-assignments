package com.GiveMeYourVegetebles;

import java.util.Scanner;

public class episode7 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        double fnum, snum , answer;

        System.out.println("Enter first num: ");
        fnum = SC.nextDouble();
        System.out.println("Enter second num: ");
        snum = SC.nextDouble();
        answer =  fnum + snum;
        System.out.println(answer);
    }
}
