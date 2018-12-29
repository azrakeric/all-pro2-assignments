package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        hooman[] persons = {
                new hooman()
        };

//        persons[0].setEyecolor("blue");
//        System.out.println(persons[0].getEyecolor());
        System.out.println("Name : "+Name());
        System.out.println("Birthcountry : "+getRandomCountry());
        System.out.println("Eyecolor : "+RandomeyeColor());
        System.out.println("Length : "+Length());
        System.out.println("Age : "+Age());
        System.out.println("BSN : "+BSN());
//        displayCompleteList();
    }
    private static String getRandomCountry(){
        int r = new Random().nextInt(C.LIST.length-1);

        return C.LIST[r];
    }
    private static String RandomeyeColor(){
        int r = new Random().nextInt(eyeColor.LIST.length-1);
        return eyeColor.LIST[r];
    }
    private static String Length(){
        int R = new Random().nextInt(4 + 1);
        int W = new Random().nextInt(10);
        int Q = new Random().nextInt(10);


        String Length = (R +"."+ W + Q);


        return Length;
    }
    private static int Age(){
        int Age = new Random().nextInt(100 + 1);


        return Age;
    }
    private static String BSN(){
        int A = new Random().nextInt(10);
        int B = new Random().nextInt(10);
        int C = new Random().nextInt(10);
        int D = new Random().nextInt(10);
        int E = new Random().nextInt(10);
        int F = new Random().nextInt(10);
        int G = new Random().nextInt(10);
        int H = new Random().nextInt(10);
        int I = new Random().nextInt(10);


        String BSN = (A+""+B+""+C+""+D+""+E+""+F+""+G+""+H+""+I);

        return BSN;


    }
    private static String Name(){
        int nam = new Random().nextInt(Name.LIST.length-1);

        return Name.LIST[nam];


    }

//    private static void displayCompleteList(){
//        for (String country : C.LIST) {
//            System.out.println(" ++++ " +country + ".");
//        }
//    }

}

