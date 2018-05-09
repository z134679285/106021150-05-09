import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {
    private  JButton big = new JButton("大");
    private  JButton small = new JButton("小");
    private  JButton exit = new JButton("EXIT");
    private  JLabel  lab = new JLabel("我是笨蛋");
     private  int x =10;
    public  frame(){
        init();
    }
    private  void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(big);
        this.add(small);
        this.add(exit);
        this.add(lab);
        this.setLocation(100,50);
        this.setSize(800,600);
        big.setLocation(150,50);
        small.setLocation(300,50);
        exit.setLocation(450,50);
        big.setSize(150,50);
        small.setSize(150,50);
        exit.setSize(150,50);
        lab.setLocation(600,50);
        lab.setSize(150,50);
        lab.setBounds(x,250,250,150);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        big.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lab.setFont(new Font(null, Font.BOLD,x+=1));
            }
        });
        small.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setFont(new Font(null, Font.BOLD,x-=1));
            }
        });
    }

}
