package com.company;

import java.util.Scanner;

public class Main {
    private static final int DEFAULT = 100;
    private static final int FatP = 100;
    private static final int SportST = 10;
    private static final int SportFT = 15;


    public static void main(String[] args) {

        Player Player = new Player();
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        int die = 0;
        int turn = 0;
        int i =0;
        while (i<=5) {
            Monster Monster = new Monster();
            System.out.println("The more you eat the less damage you do");
            status = true;
            i++;
            turn = 0;
            while (status == true) {


                turn++;
                System.out.println("its turn :" + turn);
                System.out.println(Player.getFat() + " is the players favroute number");
                System.out.println(Player.getHealth() + " is the players Health");
                System.out.println(Player.getStamina() + " is the players Stamina");
                System.out.println(Monster.getHealth() + " is the Monster Health");


                if (Player.getFat() <= 0) {
                    System.out.println("you have died of anorexia");
                    status = false;
                    break;
                }
                if (Player.getFat() >= 500) {
                    System.out.println("you have died of obesity");
                    status = false;
                    break;

                }
                if (Player.getStamina() <= 0) {
                    System.out.println("you have died of busyness");
                    status = false;
                    break;
                }
                System.out.println("################Activity###########################");
                System.out.println("1 = Attack The MONSTER");
                System.out.println("2 = die");
                System.out.println("3 = eat");
                System.out.println("4 = sleep");
                System.out.println("###################################################");

                int q = sc.nextInt();

                switch (q) {
                    case 1:
                        Monster.setHealth(Monster.getHealth() - Player.attack());
                        break;
                    case 2:
                        status = false;
                        System.out.println("Aight Brother");
                        Player.setHealth(die);
                        break;
                    case 3:
                        System.out.println("gained fat + stamina");
                        Player.setStaminaadd(DEFAULT);
                        Player.setFatadd(FatP);
                        break;
                    case 4:
                        System.out.println("Gained stamina");
                        Player.setStaminaadd(DEFAULT);
                        Player.setHealth(die);
                        System.out.println("stoopid");
                        break;

                }
                if (Monster.getHealth() == 0) {
                    status = false;
                    System.out.println("you have won");
                } else {
                    Monster.attack();
                }


            }
        }
    }
}