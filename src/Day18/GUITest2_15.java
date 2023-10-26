package Day18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test extends JFrame implements ActionListener{

    JLabel jl;
    public Test(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JButton j1 = new JButton("1");
        JButton j2 = new JButton("2");
        jl = new JLabel("안녕!");
        ct.add(j1);
        ct.add(j2);
        ct.add(jl);

        j1.addActionListener(this);
        j2.addActionListener(this);
        setTitle("GUI Test2");
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
     String input = ae.getActionCommand();
     String result = "안녕!+"+input;
     jl.setText(result);
        System.out.println(input);
    }
}





public class GUITest2_15 {
    public static void main(String[] args) {

        Test t1 =new Test();
    }
}
