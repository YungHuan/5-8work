import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JLabel jl =new JLabel(" ");
    private JButton jb1 =new JButton("7");
    private JButton jb2 =new JButton("8");
    private JButton jb3 =new JButton("9");
    private JButton jb4 =new JButton("/");
    private JButton jb5 =new JButton("4");
    private JButton jb6 =new JButton("5");
    private JButton jb7 =new JButton("6");
    private JButton jb8 =new JButton("*");
    private JButton jb9 =new JButton("1");
    private JButton jb10 =new JButton("2");
    private JButton jb11 =new JButton("3");
    private JButton jb12 =new JButton("-");
    private JButton jb13 =new JButton("0");
    private JButton jb14 =new JButton(".");
    private JButton jb15 =new JButton("=");
    private JButton jb16 =new JButton("+");
    private Container cp;
    private JPanel jp1 = new JPanel(new GridLayout(4,4,3,3));
    public MainFrame(){
        init();
    }
    public void init(){
        this.setBounds(100,100,500,500);
        cp =this.getContentPane();
        cp.add(jp1, BorderLayout.CENTER);
        cp.add(jl, BorderLayout.NORTH);
        jp1.setLayout(new GridLayout(4,4,3,3));
        jl.setFont(new Font(null,Font.BOLD ,72));
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp1.add(jb7);
        jp1.add(jb8);
        jp1.add(jb9);
        jp1.add(jb10);
        jp1.add(jb11);
        jp1.add(jb12);
        jp1.add(jb13);
        jp1.add(jb14);
        jp1.add(jb15);
        jp1.add(jb16);
        this.setVisible(true);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb1.getText());

            }
        });jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb2.getText());

            }
        });jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb3.getText());

            }
        });jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb4.getText());

            }
        });jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb5.getText());

            }
        });jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb6.getText());

            }
        });jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb7.getText());

            }
        });jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb8.getText());

            }
        });jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb9.getText());

            }
        });jb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb10.getText());

            }
        });jb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb11.getText());

            }
        });jb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb12.getText());

            }
        });jb13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb13.getText());

            }
        });jb14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb14.getText());

            }
        });jb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb15.getText());

            }
        });jb16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(jl.getText()+jb16.getText());

            }
        });
    }
}
