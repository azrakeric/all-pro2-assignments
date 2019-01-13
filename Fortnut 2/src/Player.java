import java.util.Random;

public class Player {
    Random rand = new Random();
    final private int Walkspeed = 1;
    final private int maxHealth = 100;
    final private int minHealth = 0;
    public int weaponint = 0;

    private int Health = 100;
    public  int x = rand.nextInt((14 - 0) + 1) + 0;
    public  int y = rand.nextInt((14 - 0) + 1) + 0;

    public String name = null;

    public void SetName(String namegot){
        name = namegot;
    }
    public void setWeapon(){

    }
    public String[] getWeaponArray(){
        String[] WeaponsArray = {"Sword","Shotgun","Pistol","SMG","Sniper","LMG"};

        return WeaponsArray;
    }
    public String getWeaponString(){
        String[] WeaponsArray = {"Sword","Shotgun","Pistol","SMG","Sniper","LMG"};
        String WeaponString = WeaponsArray[weaponint];
        return WeaponString;
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
        if (y > 15){
            y = 15;

        }
        else if (y < 0){
            y=0;
        }
        else if (x> 15) {
            x = 15;
        }
        else if (x<0 ){
            x=0;

        }
    }
    public void left(){
        x=x-Walkspeed;
        if (y > 15){
            y = 15;

        }
        else if (y < 0){
            y=0;
        }
        else if (x> 15) {
            x = 15;
        }
        else if (x<0 ){
            x=0;

        }
    }
    public void right(){
        x=x+Walkspeed;
        if (y > 15){
            y = 15;

        }
        else if (y < 0){
            y=0;
        }
        else if (x> 15) {
            x = 15;
        }
        else if (x<0 ){
            x=0;

        }

    }
    public void back(){
        y=y+Walkspeed;
        if (y > 15){
            y = 15;

        }
        else if (y < 0){
            y=0;
        }
        else if (x> 15) {
            x = 15;
        }
        else if (x<0 ){
            x=0;

        }

    }

    public void setHealth(int newhealth){
        if (newhealth > maxHealth){
            newhealth = maxHealth;
        }
        else if (newhealth < minHealth ){
            newhealth = minHealth;
        }
        Health = newhealth;
    }

    public int getHealth() {
        return Health;
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
