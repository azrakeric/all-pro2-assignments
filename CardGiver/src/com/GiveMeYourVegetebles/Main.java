package com.GiveMeYourVegetebles;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JFrame {

    public static void main(String[] args) {

        new Main();
    }

    public Main() {

        this.setSize(400, 600);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);

        int yPos = (dim.height / 2) - (this.getHeight() / 2);


        this.setLocation(xPos, yPos);

        this.setTitle("Share cards");

        JPanel thePanel = new JPanel();

        int race = 0;
        int cards = 0;
        String[] soort = {"Schoppen", "Klavers", "Ruiters", "Harten"};
        String[] waarde = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "heer", "vrouw", "boer"};
        String[] Schoppen = new String[13];
        String[] Harten = new String[13];
        String[] Ruiten = new String[13];

        String[] Klavers = new String[13];
        String logic = "";
        int posschoppen = 0;
        int posharten = 0;
        int posruiten = 0;
        int posklavers = 0;


        int[] names = new int[52];
        ArrayList<String> alist = new ArrayList<String>();
        JLabel[] totalAYearLabel;

        totalAYearLabel = new JLabel[52];
        JLabel[] TotalPlayer1Cards = new JLabel[13];

        JLabel[] TotalPlayer2Cards = new JLabel[13];
        JLabel[] TotalPlayer3Cards = new JLabel[13];
        JLabel[] TotalPlayer4Cards = new JLabel[13];
        String[] Player1 = new String[13];
        int Posplayer1 = 0;
        String[] Player2 = new String[13];
        int Posplayer2 = 0;

        String[] Player3 = new String[13];
        int Posplayer3 = 0;

        String[] Player4 = new String[13];
        int Posplayer4 = 0;


        for (int i = 0; i < 52; i++) {

            totalAYearLabel[i] = new JLabel();

//            for (int v = 52; v >= 1; v++) {


//if(i == 12){
//    cards=0;
//}
//            if (i == 25) {
//                cards = 0;
//
//            }
//            if (i == 38) {
//                cards = 0;
//
//            }
//            if (i == 51) {
//                cards = 0;
//
//            }

            if (i == 13) {
                race++;
                cards = 0;

            }

            if (i == 26) {
                race++;
                cards = 0;


            }
            if (i == 39) {
                race++;
                cards = 0;


            }
            if (i == 52) {
                race++;
                cards = 0;


            }
//
//

//            switch (race){
//                case 1:
//                    Schoppen[posschoppen] = waarde[cards];
//                    posschoppen++;
//                    break;
//                case 2:
//                    Klavers[posklavers] = waarde[cards];
//                    posklavers++;
//
//                    break;
//                case 3:
//                    Ruiten[posruiten] = waarde[cards];
//                    posruiten++;
//
//                    break;
//                case 4:
//                    Harten[posharten] = waarde[cards];
//                    posharten++;
//
//                    break;
//                    default:
//                        System.out.println("CRITICAL ERROR WITH "+ soort[race]+" "+waarde[cards]);
//            }
            Random rand = new Random();


            switch (race) {
                case 1:
                    for (int P = 0; P != 13; P++) {
                        if (Schoppen[P] == waarde[cards]) {
                            cards++;
                        } else {
                            Schoppen[posschoppen] = waarde[cards];
                        }
                    }

                    break;
                case 2:
                    for (int P = 0; P != 13; P++) {
                        if (Klavers[P] == waarde[cards]) {
                            cards++;
                        } else {
                            Klavers[posklavers] = waarde[cards];
                        }
                    }

                    break;
                case 3:
                    for (int P = 0; P != 13; P++) {
                        if (Ruiten[P] == waarde[cards]) {
                            cards++;
                        } else {
                            Ruiten[posruiten] = waarde[cards];
                        }
                    }

                    break;
                case 4:
                    for (int P = 0; P != 13; P++) {
                        if (Harten[P] == waarde[cards]) {
                            cards++;
                        } else {
                            Harten[posharten] = waarde[cards];
                        }
                    }

                    break;
            }


            int x = rand.nextInt(4);
            for (int q = 0; q!=4;q++)
            switch (x) {
                case 0:

                    if (Posplayer1 >= 12) {
                        x++;
                        break;
                    }
                case 1:
                    if (Posplayer1 >=12) {
                        x++;
                        break;
                    }
                case 2:
                    if (Posplayer1 >= 12) {
                        x++;
                        break;
                    }
                case 3:
                    if (Posplayer1 >= 12) {
                        x=1;
                        break;
                    }
            }
            switch (x) {

                case 0 :
                    if (TotalPlayer1Cards[Posplayer1] == null) {
                        Player1[Posplayer1] = soort[race] + waarde[cards];
                        TotalPlayer1Cards[Posplayer1] = new JLabel();
                        TotalPlayer1Cards[Posplayer1].setText(soort[race] + waarde[cards]);
                        if (Posplayer1 < 12) {
                            Posplayer1++;
                            break;
                        }
                        break;
                    }

                    else{
                    }


                case 1:
                    if (TotalPlayer2Cards[Posplayer2] == null) {
                        Player2[Posplayer1] = soort[race] + waarde[cards];
                        TotalPlayer2Cards[Posplayer2] = new JLabel();
                        TotalPlayer2Cards[Posplayer2].setText(soort[race] + waarde[cards]);
                        if (Posplayer2 < 12) {
                            Posplayer2++;
                            break;
                        }
                        break;
                    }
                    else{
                    }


                case 2:
                    if (TotalPlayer3Cards[Posplayer3] == null) {
                        Player3[Posplayer3] = soort[race] + waarde[cards];
                        TotalPlayer3Cards[Posplayer3] = new JLabel();
                        TotalPlayer3Cards[Posplayer3].setText(soort[race] + waarde[cards]);
                        if (Posplayer3 < 12) {
                            Posplayer3++;
                            break;
                        }
                        break;
                    }
                    else{
                    }
//                    break;

                case 3:
                    if (TotalPlayer4Cards[Posplayer4] == null) {
                        Player4[Posplayer4] = soort[race] + waarde[cards];
                        TotalPlayer4Cards[Posplayer4] = new JLabel();
                        TotalPlayer4Cards[Posplayer4].setText(soort[race] + waarde[cards]);
                        if (Posplayer4 < 12) {
                            Posplayer4++;
                            break;
                        }
                        break;
                    }
                    else{
                    }

//                    break;
            }
//                System.out.println(TotalPlayer1Cards[Q]);
//                System.out.println(TotalPlayer2Cards[Q]);
//                System.out.println(TotalPlayer3Cards[Q]);
//                System.out.println(TotalPlayer4Cards[Q]);
//                System.out.println(Player1[i]);
//                System.out.println(Player2[i]);
//                System.out.println(Player3[i]);
//                System.out.println(Player4[i]);

//            totalAYearLabel[i].setText(
//                    soort[race] +
//                            waarde[cards]
//            );

//            thePanel.add(TotalPlayer1Cards[i]);
//            thePanel.add(TotalPlayer2Cards[i]);
//            thePanel.add(TotalPlayer3Cards[i]);
//            thePanel.add(TotalPlayer4Cards[i]);

            cards++;
            x=0;

        }
        for(int i = 0; 12 > i; i++) {
            System.out.println(Player1[i]);
            System.out.println(Player2[i]);
            System.out.println(Player3[i]);
            System.out.println(Player4[i]);

            thePanel.add(TotalPlayer4Cards[i]);
            thePanel.add(TotalPlayer3Cards[i]);
            thePanel.add(TotalPlayer2Cards[i]);
            thePanel.add(TotalPlayer1Cards[i]);
        }


//        for (int p = 0;p<52;p++){
//cards++;
//    alist.add(p+"label");


//    JLabel  alist[p] = new JLabel(
//        soort[race]+
//            waarde[cards]
//
//    );


        this.add(thePanel);


        this.setVisible(true);


    }
}
