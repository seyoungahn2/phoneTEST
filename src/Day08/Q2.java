package Day08;

import java.util.Random;

public class Q2 {

    static char a(char ae){  // 주고 받고
            return 'A';
    }

    static int num (){ // 주고 안받고
        Random r = new Random();

        return r.nextInt(26);

    }

    static int sum(int a , int b){ // (+) 주고 받고
        return a+b;
    }

    static void print(char println){ // 안주고 받고
        System.out.println(println);
    }



    
    
    public static void main(String[] args) {
        Random r = new Random();
        
        
        char A = 'A'; // 주고 받고

        for (int i = 0; i < 10; i++) { //안주고 안받고

            int num = r.nextInt(26); // 주고 안받고
            System.out.print((char) (A + num)); // 더하기 연산(주고 받고 A+ num)
                                                //10개 문자 출력 안주고 받고

            
            
            
            
            
        }
    }
}