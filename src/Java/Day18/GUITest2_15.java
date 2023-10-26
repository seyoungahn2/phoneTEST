package Java.Day18;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Test extends JFrame implements ActionListener{
    JLabel jl;
    public Test() {
        // TODO Auto-generated constructor stub
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JButton j1 = new JButton("1");
        JButton j2 = new JButton("2");
        jl = new JLabel("안녕!");
        ct.add(j1);
        ct.add(j2);
        ct.add(jl);

        j1.addActionListener(this); // JButton에 추가 ActionListener를 추가
        j2.addActionListener(this);
        setTitle("GUI Test2");
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) // Action이 취해지면 실행되는 함수
    {
        String input = ae.getActionCommand();
        String result="안녕!" + input;
        jl.setText(result);
        System.out.println(input);
    }
}
public class GUITest2_15 {
    public static void main(String[] args) {
        new Test();
    }
}
