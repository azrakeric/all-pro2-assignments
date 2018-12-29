package com.company;

public class Player {
    private static final int DEFAULT = 100;

    private int Fav = 101;
    private int Health = DEFAULT;
    private int Stamina = DEFAULT;
    private int Fat = DEFAULT;

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


public int getFav(){

    return Fav;
    }
    public int getHealth(){

        return Health;
    }
    public int getStamina(){

        return Stamina;
    }


}
