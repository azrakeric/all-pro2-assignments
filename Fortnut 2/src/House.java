import java.util.Random;


public class House {
    Weapon weapon = new Weapon();
    Random rand = new Random();

    public  int weaponint = rand.nextInt((weapon.getWeaponArrayLength()));
    private int x = -1;
    private int y = -1;


    public void saveLocation(int xgot, int ygot){
       x = xgot;
       y=ygot;

    }
    public void checkforhouseold(int xgot, int ygot){
        if (xgot == x && ygot == y){
            System.out.println("This place has already been looted");
        }
    }

}
