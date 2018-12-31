import java.util.Random;

public class Player {
    Random rand = new Random();
    final private int Walkspeed = 1;
    public  int x = rand.nextInt((14 - 0) + 1) + 0;
    public  int y = rand.nextInt((14 - 0) + 1) + 0;

    public String name = null;

    public void SetName(String namegot){
        name = namegot;
    }

    //    public void checkBattle(){
//        if (player1)
//    }
//    public static String name(Player who){
//        name = who.name
//            return name;
//    }

    public void forward(){
        y=y-Walkspeed;

    }
    public void left(){
        x=x-Walkspeed;

    }
    public void right(){
        x=x+Walkspeed;

    }
    public void back(){
        y=y+Walkspeed;

    }
//    public void back(String[][] map,String who){
//        for (int y = 0; y < 15; y++) {
//            for (int x = 0; x < 15; x++) {
//                if (map[y][x].equals(who)){
//                    y =-1;
//                    who = map[y][x];
//
//                }
//            }
//        }
//
//    }
//    public void right(String[][] map,String who){
//        for (int y = 0; y < 15; y++) {
//            for (int x = 0; x < 15; x++) {
//                if (map[y][x].equals(who)){
//                    x =+1;
//                    who = map[y][x];
//
//                }
//            }
//        }
//
//    }
//    public void left(String[][] map,String who){
//        for (int y = 0; y < 15; y++) {
//            for (int x = 0; x < 15; x++) {
//                if (map[y][x].equals(who)){
//                    x =-1;
//                    who = map[y][x];
//
//                }
//            }
//        }
//
//    }
}
