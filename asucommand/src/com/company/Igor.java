package com.company;

public class Igor {
   private Boolean DeurOpSlot = true;

    public boolean setStatus(int q){
        if (q == 1) {
            System.out.println(q);
            DeurOpSlot = false;
            System.out.println(DeurOpSlot);

        }
        else {
            System.out.println("than bugger off buddy");
        }
        return DeurOpSlot;
    }

    public boolean getStatus() {

        return DeurOpSlot;
    }
    }
