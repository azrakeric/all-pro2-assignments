import java.security.PublicKey;

public class Weapon {
    final private int DamageSword = 15;
    final private int DamageShotgun = 13;
    final private int DamagePistol = 10;
    final private int DamageSMG = 20;
    final private int DamageSniper = 50;
    final private int DamageLMG = 15; // 5 hits


    //Zwaard 1/1 raak
    //pistoolspray 1/1 raak
    //submachinegun spray 1/2 raak
    //minigun spray 1/2 raak
    //heavymachinegun spray 1/2 raak
    //sniper 1/4 kans raak
    String[] WeaponsArray = {"Sword","Shotgun","Pistol","SMG","Sniper","LMG"};

public  String getStringWeapon(int given){
String WeaponString = WeaponsArray[given];
    return WeaponString;

}

public int getWeaponArrayLength(){
    int arraylength = WeaponsArray.length;

        return arraylength; }
public void Attack(int wapen, Player aanvaller , Player slachttoffer){
        switch(wapen) {
            case 0:
               slachttoffer.setHealth(slachttoffer.getHealth() - DamageSword);
            case 1:
                slachttoffer.setHealth(slachttoffer.getHealth() - DamageShotgun);

            case 2:
                slachttoffer.setHealth(slachttoffer.getHealth() - DamagePistol);

            case 3:
                slachttoffer.setHealth(slachttoffer.getHealth() - DamageSMG);

            case 4:
                slachttoffer.setHealth(slachttoffer.getHealth() - DamageSniper);

            case 5:
                slachttoffer.setHealth(slachttoffer.getHealth() - DamageLMG);
        }

        System.out.println(aanvaller.name +" heeft " + slachttoffer.name +" aagevallen met "+ aanvaller.getWeaponString());


    }
}
