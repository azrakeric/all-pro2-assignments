package com.company;

import java.util.Random;

public class Player {
    private static final int DEFAULT = 100;

    private int Health = DEFAULT;
    private int Stamina = DEFAULT;
    private int Fat = 100;
    private int normalattack = 100;
    private int crititalhit = 300;

    public void setHealth(int valueht){
        if (valueht >= 100){
            valueht = 100;
        }
        else if(valueht <= 0){
            valueht = 0;
        }
        Health = valueht;
    }
    public void setStaminaLoss(int valuest){

        Stamina = Stamina - valuest;

    }
    public void setFatLoss(int valueft){
        Fat = Fat - valueft;
    }
    public void setStaminaadd(int valuest){


        Stamina = Stamina + valuest;
        if (Stamina >= 100){
            Stamina = 100;
        }
        else if(Stamina <= 0){
            Stamina = 0;
        }
    }
    public void setFatadd(int valueft){
        Fat = Fat + valueft;
    }
    public int getFat(){

        return Fat;
    }

    public int attack(){
     int  q =  new Random().nextInt(100);

      if (q > 99){
          setFatLoss(50);
          return crititalhit - getFat() ;
      }
      else {
        setFatLoss(10);
        return normalattack - getFat() ;
    }

    }

    public int getHealth(){

        return Health;
    }
    public int getStamina(){

        return Stamina;
    }


}
