package com.GiveMeYourVegetebles;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args) {
        new Main();

    }
   public Main(){
        this.setSize(400,400);
//        centerd
//        this.setLocationRelativeTo(null);

       Toolkit tk =Toolkit.getDefaultToolkit();
       Dimension dim = tk.getScreenSize();
       int xPos = (dim.width /2) - (this.getWidth()/2);

       int yPos = (dim.height /2) - (this.getHeight()/2);


       this.setLocation(xPos, yPos);


       this.setResizable(false);

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       this.setTitle("my First frame");

       JPanel thePanel = new JPanel();

       JLabel lable1 = new JLabel("Tell me something");

       lable1.setText("New Text");

       lable1.setToolTipText("this doesnt do anything moron");

       thePanel.add(lable1);


       JButton button1 = new JButton("send");
//border
//       button1.setBorderPainted(false);
//background
//       button1.setContentAreaFilled(false);
       button1.setText("new button");

       button1.setToolTipText("its a button");

       thePanel.add(button1);

       JTextField textField1 = new JTextField("Type here", 15);

               textField1.setColumns(10);

       textField1.setText("type Agian");

       textField1.setToolTipText("textfield");

       thePanel.add(textField1);

       JTextArea textArea1 = new JTextArea(15,20);

       textArea1.setText("bunch of text");

       textArea1.setLineWrap(true);

       textArea1.setWrapStyleWord(true);

       int numOfLines = textArea1.getLineCount();

       textArea1.append(" Number of lines: " + numOfLines);

       JScrollPane  Scrollbar = new JScrollPane(textArea1 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

               thePanel.add(Scrollbar);

       this.add(thePanel);

        this.setVisible(true);

        textField1.requestFocus();



   }
}
