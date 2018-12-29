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
        int day = 0;
        while (status == true){
           if (Player.getFat() <= 0){
               System.out.println("you have died of anorexia");
               status = false;
           }
           if (Player.getFat() >= 500){
               System.out.println("you have died of obesity");
               status = false;

           }
           if(Player.getStamina() <= 0){
               System.out.println("you have died of busyness");
               status = false;

           }
            day++;
            System.out.println("its day :"+day);
            System.out.println("##################Status###########################");
            System.out.println("1 = favnumber");
            System.out.println("2 = health");
            System.out.println("3 = stamina");
            System.out.println("################Activity###########################");
            System.out.println("4 = die");
            System.out.println("5 = eat");
            System.out.println("6 = sport");
            System.out.println("7 = sleep");
            System.out.println("###################################################");

           int q =  sc.nextInt();

           switch (q){
               case 1:

                   System.out.println(Player.getFav() + " is the players favroute number");
                   break;
               case 2:
                   System.out.println(Player.getHealth() + " is the players Health");
                   break;
               case 3:
                   System.out.println(Player.getStamina() + " is the players Stamina");
                   break;
               case 4:
                   status = false;
                   System.out.println("Aight Brother");
                   Player.setHealth(die);
                   break;
               case 5:
                   System.out.println("gained fat + stamina");
                   Player.setStaminaadd(DEFAULT);
                   Player.setFatadd(FatP);
                   break;
               case 6:
                   System.out.println("lossed fat and lossed  stamina");
                   Player.setStaminaLoss(SportST);
                   Player.setFatLoss(SportFT);
                   break;
               case 7:
                   System.out.println("Gained stamina");
                   Player.setStaminaadd(DEFAULT);
                   break;

           }
        }
    }
}
