import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //een speler heeft levens attack defense max weight
        //elk wapen heeft stregth durabilty weight accuracy
        // pantser en schild heeft defense durablity en weight
        // classes
        // - Player
        //- Weapon
        //- Shield
        //- Armour
        //- Game
        //- Menu


        // gedachte nu een grid / map  van 15 bij 15
        // maak arrays voor een grid
        // als 2 spelers op 1 vakje staan in het grid kunnen ze vechten
        // als er een huisje is kunnen ze loot pakken
        // alles is random
        //dus plaatsing huisjes en loot

        //risicos
        //in de beschrijving staat dat je wapens moet kiezen aan het begin van het spel
        Game Spel = new Game();
        String[][] map = Spel.getMap();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.printf(map[i][j]);
            }
            System.out.println();
        }

        Scanner SC = new Scanner(System.in);
        System.out.println("map has been initialized \n");

        System.out.println("gather your buddys to play this local multiplayer game  \n");
        System.out.println("you must gather 15 people first");
        System.out.println("lets play");
        System.out.print("\033[H\033[2J");
        Player player1= new Player();
        Player player2= new Player();
        Player player3= new Player();
        Player player4= new Player();
        Player player5= new Player();
        Player player6= new Player();
        Player player7= new Player();
        Player player8= new Player();
        Player player9= new Player();
        Player player10= new Player();
        Player player11= new Player();
        Player player12= new Player();
        Player player13= new Player();
        Player player14= new Player();
        Player player15= new Player();

        Player[] Players = {player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11,player12,player13,player14,player15};
        String[] PlayersString = {"player1","player2","player3","player4","player5","player6","player7","player8","player9","player10","player11","player12","player13","player14","player15"};

//        Random rand = new Random();

//        for (int who=0; who< 15 ;who++) {
//            int x = rand.nextInt((14 - 0) + 1) + 0;
//            int y = rand.nextInt((14 - 0) + 1) + 0;
//            Spel.setPlayer(x,y,Integer.toString(who));
//        }

//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map.length; j++) {
//                System.out.printf(map[i][j]);
//            }
//            System.out.println();
//        }
//
//
//System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
////     player1.forward(map, player1);
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map.length; j++) {
//                System.out.printf(map[i][j]);
//            }
//            System.out.println();
//        }
//
//       System.out.println( Player.name(player1) );
        System.out.println("player 1 starts");
        for (int i =0;i<15;i++) {
            Players[i].SetName(PlayersString[i]);
            Spel.spawnPlayers(Players[i].x,Players[i].y, PlayersString[i]);
        }






//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 15; j++) {
//                System.out.printf(map[i][j]);
//            }
//            System.out.println(" ");
//        }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(Players[i].x+" "+Players[i].y+" "+ PlayersString[i]);

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("#########################################################");
        System.out.println("1= vooruit ##############################################");
        System.out.println("2= rechts ###############################################");
        System.out.println("3= achteruit ############################################");
        System.out.println("4= links ################################################");
        System.out.println("#########################################################");
        switch (SC.nextInt()){
            case 1:
                Spel.deletePlayer(Players[i].x,Players[i].y, PlayersString[i]);
                Players[i].forward();
                Spel.checkforbattle(Players[i].x,Players[i].y, PlayersString[i]);
                Spel.movePlayers(Players[i].x,Players[i].y, PlayersString[i]); 
                    break;
            case 2:
                Spel.deletePlayer(Players[i].x,Players[i].y, PlayersString[i]);
                Players[i].right();
                Spel.checkforbattle(Players[i].x,Players[i].y, PlayersString[i]);
                Spel.movePlayers(Players[i].x,Players[i].y, PlayersString[i]);
                System.out.println(Players[i].x+" "+Players[i].y+" "+ PlayersString[i]);
                break;
            case 3:
                Spel.deletePlayer(Players[i].x,Players[i].y, PlayersString[i]);
                Players[i].back();
                Spel.checkforbattle(Players[i].x,Players[i].y, PlayersString[i]);
                Spel.movePlayers(Players[i].x,Players[i].y, PlayersString[i]);
                break;
            case 4:
                Spel.deletePlayer(Players[i].x,Players[i].y, PlayersString[i]);
                Players[i].left();
                Spel.checkforbattle(Players[i].x,Players[i].y, PlayersString[i]);
                Spel.movePlayers(Players[i].x,Players[i].y, PlayersString[i]);
                System.out.println(Players[i].x+" "+Players[i].y+" "+ PlayersString[i]);

                break;

        }
    }
        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
