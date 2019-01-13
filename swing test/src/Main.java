import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public Main(){
        //prepareGUI function is being called
        prepareGUI();
    }
    public static void main(String[] args){

        Main  thisisjustaname = new Main();
        thisisjustaname.showActionListenerDemo();
    }
    private void prepareGUI(){
        // gui has been processing
        //made a Jframe with title
        mainFrame = new JFrame("Java SWING Examples");
        //has set the size of the window of the Jframe
        mainFrame.setSize(400,400);
        //
        //
        //
        //Layout with 3 rows and 1 column
        mainFrame.setLayout(new GridLayout(3, 1));
        //set a lable called HeaderLabel but with no text to display
        headerLabel = new JLabel("",JLabel.CENTER );
        //set a lable called statusLabel but with no text to display

        statusLabel = new JLabel("",JLabel.CENTER);
        //set the size of statusLabel
        statusLabel.setSize(350,100);
        //unknown
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        //makes something called JPanel and names it controlPanel
        controlPanel = new JPanel();
        //makes a layout of the JPanel
        controlPanel.setLayout(new FlowLayout());

        //added headerLabel
        mainFrame.add(headerLabel);
        //added controlPanel
        mainFrame.add(controlPanel);
        //added statusLabel
        mainFrame.add(statusLabel);
        //sets it to visible
        mainFrame.setVisible(true);
    }
    private void showActionListenerDemo(){
        headerLabel.setText("Listener in action: ActionListener");

        //makes a new JPanel
        JPanel panel = new JPanel();
        //sets backgroundcolor to magenta
//        panel.setBackground(Color.magenta);
        //makes a JButton
        JButton okButton = new JButton("OK");

        //sets an actionlistner
        okButton.addActionListener(new CustomActionListener());

        panel.add(okButton);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
    class CustomActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            statusLabel.setText("Ok Button Clicked.");
        }
    }
}
