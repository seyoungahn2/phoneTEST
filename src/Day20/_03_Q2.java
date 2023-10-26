package Day20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Calculator extends JFrame implements ActionListener{
    JLabel label;
    String textOutput = "";

    ArrayList<String > op = new ArrayList<>();

    Calculator(){
        setSize(400,400);
        setLocation(800,400);
        setTitle("계산기");
        setVisible(true);

        label = new JLabel("0",JLabel.RIGHT);
        JPanel mainView = new JPanel();
        label.setBackground(Color.white);
        label.setFont(new Font("",Font.BOLD,50));
        label.setOpaque(true);


        JPanel btnView = new JPanel();
        btnView.setLayout(new GridLayout(5,4,5,5));

        // 1행
        JButton b1 = new JButton("1");
        b1.addActionListener(this);
        btnView.add(b1);

        JButton b2 = new JButton("2");
        b2.addActionListener(this);
        btnView.add(b2);

        JButton b3 = new JButton("3");
        b3.addActionListener(this);
        btnView.add(b3);

        JButton bminer = new JButton("-");
        bminer.addActionListener(this);
        btnView.add(bminer);


        // 2행
        JButton b4 = new JButton("4");
        b4.addActionListener(this);
        btnView.add(b4);

        JButton b5 = new JButton("5");
        b5.addActionListener(this);
        btnView.add(b5);

        JButton b6 = new JButton("6");
        b6.addActionListener(this);
        btnView.add(b6);

        JButton bplus = new JButton("+");
        bplus.addActionListener(this);
        btnView.add(bplus);


        // 3행
        JButton b7 = new JButton("7");
        b7.addActionListener(this);
        btnView.add(b7);

        JButton b8 = new JButton("8");
        b8.addActionListener(this);
        btnView.add(b8);

        JButton b9 = new JButton("9");
        b9.addActionListener(this);
        btnView.add(b9);

        JButton bgob = new JButton("*");
        bgob.addActionListener(this);
        btnView.add(bgob);


        // 4행
        JButton b0 = new JButton("0");
        b0.addActionListener(this);
        btnView.add(b0);

        JButton bone = new JButton("");

        btnView.add(bone);

        JButton beq = new JButton("=");
        beq.addActionListener(this);
        btnView.add(beq);

        JButton bna = new JButton("/");
        bna.addActionListener(this);
        btnView.add(bna);


        mainView.setLayout(new BorderLayout());
        add(label,BorderLayout.CENTER);
        add(btnView,BorderLayout.SOUTH);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        /*
        * 정규 표현식 (스크립트쪽에서 주로 사용함)
        * [^0-9] 0~9를 의미하며, 숫자만 가능함.
        * */
        // 버튼에 문자열을 받을 수 있다. -> 현재 눌린 버튼이 입력
        String input = e.getActionCommand();
        if(input.equals("=")) {
            String regExp = "[^0-9]";
            String[] number = textOutput.split(regExp);
            for (String str : number) {
                System.out.println(str);
            }

            int result = 0;
            for (int i = 0; i < op.size(); i++) {
                if (i == 0) {
                    if (op.get(i).equals("+")) {
                        result += Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("-")) {
                        result -= Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("*")) {
                        result *= Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("/")) {
                        result /= Integer.parseInt(number[i + 1]);
                    }

                }
            }
            textOutput = result + "";
            label.setText(textOutput);
            op.clear();

        }
        else{
            if(input.equals("+")){
                op.add("+");
            }
            if(input.equals("-")){
                op.add("-");
            }
            if(input.equals("*")){
                op.add("*");
            }
            if(input.equals("/")){
                op.add("/");
            }

            textOutput += input;
            label.setText(textOutput);

        }

    }


}


public class _03_Q2 {
    public static void main(String[] args) {

        new Calculator();

    }
}
