import java.util.Scanner;
import java.util.Random;


public class Game {
    //   private String map[] = { "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#"};
    String[][] map = {
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",},
            {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",}
    };
    Scanner SC = new Scanner(System.in);
    Weapon weapon = new Weapon();

    Random rand = new Random();



    final private int houseappear = 80;

    public void spawnPlayers(int x, int y, String who) {
        map[y][x] = who.replaceAll("[^\\d.]", "");
    }

    public void movePlayers(int x, int y, String who) {
//        map[x][y] = who;
        map[y][x] = who.replaceAll("[^\\d.]", "");


    }

    public void deletePlayer(int x, int y, String who) {
        map[y][x] = "#";
    }

    public void checkforbattle(int x, int y, Player mover, Player[] allplayers) {
        if (map[y][x] != "#") {
            for (int i = 0; i < allplayers.length; i++) {
                if (allplayers[i].x == x && allplayers[i].y == y && allplayers[i] != mover) {
                    System.out.println("A fight has plaatsgevonden  between " + mover.name + " and " + allplayers[i].name);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("#########################################################");

                    System.out.println(mover.name + " what do you want to do ?");
                    System.out.println("Your health is " + mover.getHealth());
                    System.out.println("your weapon is" + mover.getWeaponString());
                    System.out.println("#########################################################");
                    System.out.println("1 = fight");
                    System.out.println("2 = flee");
                    System.out.println("#########################################################");
                    switch (SC.nextInt()) {
                        case 1:
                            weapon.Attack(mover.weaponint, mover, allplayers[i]);
                            if (allplayers[i].getHealth() > 0) {
                                if (mover.y == 15) {
                                    mover.left();
                                } else {
                                    mover.back();
                                }
                                System.out.println(allplayers[i]+" is still alive so you did a step away");
                            }
                        case 2:
                            mover.back();
                    }
                }
            }

        }

    }

    public void checkforhousetoloot(int x,int y, int chance, Player Playerwantingtolootprob,Weapon Weapon,Scanner SC){
        if (chance>houseappear){
            House House = new House();
                System.out.println("Something is here");
              System.out.println("You have " + Playerwantingtolootprob.getWeaponString());
              System.out.println("here is "+ Weapon.getStringWeapon(House.weaponint));
            System.out.println("#########################################################");
            System.out.println("1 = get");
            System.out.println("2 = dont get");
            System.out.println("#########################################################");
            switch (SC.nextInt()){
                case 1:
                    Playerwantingtolootprob.weaponint = House.weaponint;
                    System.out.println("now you have" + Weapon.getStringWeapon(Playerwantingtolootprob.weaponint));
                    break;
                case 2:
                    System.out.println("aight you have" + Weapon.getStringWeapon(Playerwantingtolootprob.weaponint));
                    break;
            }
            }




}

public int checkforplayersalive(Player[] Players){

        int alive = 0;
        for (int i =0; i < Players.length; i++){

                alive = alive + 1;


        }

        return alive;

}


    //   public void setPlayer(Player who){
//       map[who.y][who.x] = who.;
//   }
    public String[][] getMap(){

        return map;
    }


}
