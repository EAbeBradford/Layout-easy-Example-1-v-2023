import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame mainframe;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public static void main(String[] args){
        Main m = new Main();

    }

    public Main(){
        prepareGUI();
    }

    private void prepareGUI()
    {
        mainframe = new JFrame("Example with grid layout");
        mainframe.setSize(700, 600);
        mainframe.setLayout(new GridLayout(2, 3));

        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        mainframe.add(button1);
        mainframe.add(button2);

        mainframe.add(button3);

        mainframe.add(button4);
        mainframe.add(button5);

        mainframe.setVisible(true);



    }
}
