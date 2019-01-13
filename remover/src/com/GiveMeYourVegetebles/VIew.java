package com.GiveMeYourVegetebles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class VIew extends JPanel {
    boolean status = true;
    boolean mogelijk = true;
    int aantal = 23;


    public VIew() {
        this.setLayout(null);

//        JButton b = new JButton("Ik ben knop");
//        b.setSize(300, 200);
//        b.setLocation(0, 0);
//        this.add(b);
        JPanel thePanel = new JPanel();

        JButton b = new JButton("Click me");
        b.setSize(200, 100);
        b.setLocation(0, 0);

        Random rand = new Random();

        JTextField entry;
        entry = new JTextField(15);
        entry.setSize(100, 50);
        entry.setLocation(0, 100);

        JLabel nogover = new JLabel();
        nogover.setText("Dit is nog over "+String.valueOf(aantal));
        nogover.setLocation(100,100);
        nogover.setSize(500,100);

        JLabel error = new JLabel();
        error.setLocation(0,130);
        error.setSize(500, 100);

        b.addActionListener((event) -> {
            error.setText("");
                mogelijk = true;

                if (status) {
                    int userinput = Integer.parseInt(entry.getText());

                    if (userinput > 3) {
                        System.out.println("Het maximum is 3");
                        error.setText("Het maximale is 3");
                        mogelijk = false;
                        mogelijk = false;
                    }

                    if (userinput <= 0) {
                        System.out.println("het minimum is 1");
                        error.setText("Het minimale is 1");
                        mogelijk = false;
                    }

                    System.out.println(userinput);
                    if (aantal - userinput <= 0 && status && mogelijk) {
                        aantal=0;
                        System.out.println("je hebt verloren");
                        status = false;
                    }
                    if (status && mogelijk) {
                        aantal = aantal - userinput;

                        System.out.println("aantal is nu " + aantal);
                    }

                    int comInput = rand.nextInt(4);

                    if (comInput == 0) {
                        comInput = 1;
                    }
                    if (aantal - comInput <= 0 && status && mogelijk) {
                        status = false;
                        aantal=0;
                        System.out.println("de pc heeft verloren");
                        System.out.println("jij heb gewonnen");
                    }

                    switch (aantal % 4){
                        case 0:
                                comInput = 3;
                            if (aantal <= 3){
                                comInput = 1;
                            }
                            break;
//                        case 1:
//                            if (aantal <= 3){
//                                comInput = 1;
//                            }
//                            else {
//                                comInput = 1;
//                            }
//                            break;
                       case 2:
                               comInput = 1;

                           if (aantal <= 3){
                               comInput = 1;
                           }

                            break;
                        case 3:
                                comInput = 2;
                            if (aantal <= 3){
                                comInput = 1;
                            }
                            break;
//                        case 4:
//                            comInput = 3;



                    }


                    if (status && mogelijk) {
                        aantal = aantal - comInput;

                        System.out.println("de input na de com is geweest = " + aantal);


                    }
                }
                this.repaint();
            nogover.setText("Dit is nog over "+String.valueOf(aantal));
            this.add(error);

        });

        this.add(nogover);
        this.add(entry);
        this.add(b);

    }


    public void paintComponent(Graphics g) {
        Image img = null;
        try {
            img = ImageIO.read(VIew.class.getResourceAsStream("download.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int x = 0;
        int y = 200;
        int sizeCubed = 100;
        for (int i = 0; i < aantal; i++) {
            g.drawImage(img,
                    x + i % 3 * sizeCubed,
                    y + i / 3 * sizeCubed,
                    sizeCubed,
                    sizeCubed,
                    null);
        }
    }
}
