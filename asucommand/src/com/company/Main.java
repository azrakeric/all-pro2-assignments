package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                Igor Igor = new Igor();
                boolean program = true;
                while (program) {
                    boolean stAtus = Igor.getStatus();
                    if (stAtus == true) {
                        System.out.println("The Door IS Freaking locked brother shall i open it  ?");
                        System.out.println("######################################################");
                        System.out.println("1 = Yes");
                        System.out.println("0 = NO");
                        System.out.println("######################################################");

                        int q = sc.nextInt();
                        Igor.setStatus(q);
                    } else if(stAtus == false) {
                        System.out.println("come along mr");
                    }
                }
    }
}
