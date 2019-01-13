package com.GiveMeYourVegetebles;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JFrame {

    public static void main(String[] args) {

        new Main();
    }

    public Main() {
        this.setSize(400, 1080);

//        Toolkit tk = Toolkit.getDefaultToolkit();
//        Dimension dim = tk.getScreenSize();
//        int xPos = (dim.width / 2) - (this.getWidth() / 2);

        //int yPos = (dim.height / 2) - (this.getHeight() / 2);


        //this.setLocation(xPos, yPos);
        this.setLocationRelativeTo(null);

        this.setTitle("Share cards");
        this.setName("Share Cards");


//
//        for(int i = 0; i>= aantal; i++){
////            String[] images = new String[21];
////
////            ImageIcon  images[i] = new ImageIcon(getClass().getResource(Path));
//            System.out.println(i);
//        }
//
//
//        thePanel.add(entry);
//        thePanel.add(b);
//
//        this.add(thePanel);

        this.add(new VIew());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
