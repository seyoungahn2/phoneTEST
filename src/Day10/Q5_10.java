package Day10;

import java.util.Random;

// get -> 받는것.
// set -> 내 멤버 변수에 저장

class Player{
    int number;
    String country;
    int go;
    boolean check;

    int getNumber()
    {
        return number;
    }
    void setNumber(int num)
    {
        number = num ;
    }
    String getContury()
    {
        return country;
    }
    void setContury(String con)
    {
        country = con;
    }
    void setCheck(boolean ch)
    {
        check = ch;
    }
    void setGo(int g)
    {
        go = g;
    }


    int goValue() // 돌발상황이 거짓이면 이동하게 한다.
    {
        Random r = new Random();
        if(!check)
            go += r.nextInt(10)+1;
        return go;
    }

}


public class Q5_10 {
    public static void main(String args[]) {
        int koreaGo = 0;
        int chinaGo = 0;
        int amricaGo = 0;
        int russiaGo = 0;

        Player korea = new Player(); // 한국 선수 객체생성
        Player china = new Player(); // 중국 선수 객체생성
        Player america = new Player(); // 미국 선수 객체생성
        Player russia = new Player(); // 러시아 선수 객체생성

        korea.setNumber(1);
        korea.setContury("한국");
        korea.setGo(0);

        china.setNumber(2);
        china.setContury("중국");
        china.setGo(0);

        america.setNumber(3);
        america.setContury("미국");
        america.setGo(0);

        russia.setNumber(4);
        russia.setContury("러시아");
        russia.setGo(0);

        Random r = new Random();

        while(true)
        {

            int ra =r.nextInt(4)+1; // 1~4까지 랜덤값 받기.
                /* 1. 한국 true 나머지 false
                   2. 중국 true 나머지 false
                    */
            switch (ra) {
                case 1:
                    korea.setCheck(true);
                    china.setCheck(false);
                    america.setCheck(false);
                    russia.setCheck(false);
                    break;
                case 2:
                    korea.setCheck(false);
                    china.setCheck(true);
                    america.setCheck(false);
                    russia.setCheck(false);
                    break;
                case 3:
                    korea.setCheck(false);
                    china.setCheck(false);
                    america.setCheck(true);
                    russia.setCheck(false);
                    break;
                case 4:
                    korea.setCheck(false);
                    china.setCheck(false);
                    america.setCheck(false);
                    russia.setCheck(true);
                    break;

                default:
                    break;
            }
            koreaGo = korea.goValue();
            chinaGo = china.goValue();
            amricaGo = america.goValue();
            russiaGo = russia.goValue();


            System.out.printf("%s는 %dM입니다.\n", korea.getContury(),koreaGo);
            System.out.printf("%s는 %dM입니다.\n", china.getContury(),chinaGo);
            System.out.printf("%s는 %dM입니다.\n", america.getContury(),amricaGo);
            System.out.printf("%s는 %dM입니다.\n", russia.getContury(),russiaGo);


            if(koreaGo >=100)
            {
                System.out.println("우승국은 한국입니다.");
                break;
            }
            if(chinaGo >=100)
            {
                System.out.println("우승국은 중국입니다.");
                break;
            }
            if(amricaGo >=100)
            {
                System.out.println("우승국은 미국입니다.");
                break;
            }
            if(russiaGo >=100)
            {
                System.out.println("우승국은 러시아입니다.");
                break;
            }

        }
    }
}