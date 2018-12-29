package com.company;

import java.util.Random;

public class Monster {
    private static final int DEFAULT = 1000;

    private int Health = DEFAULT;
    private int normalattack = 10;

    public void setHealth(int valueht){
        if (valueht >= DEFAULT){
            valueht = DEFAULT;
        }
        else if(valueht <= 0){
            valueht = 0;

        }
        Health = valueht;
    }
    public int attack(){

        return normalattack;
    }
    public int getHealth(){

        return Health;
    }
}


