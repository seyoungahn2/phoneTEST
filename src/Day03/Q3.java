package Day03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int dan;
        
        int times;
        Scanner sc = new Scanner(System.in);

        for(;;){
            System.out.println("1.원하는 구구단 출력");
            System.out.println("2.전체 구구단 출력");
            System.out.println("3.종료");
            int num=sc.nextInt();
            while (num<=3){
                if(num==1)
                    System.out.println("원하는 구구단 :");
                    int want=sc.nextInt();
                    while(want==1){
                        for(times=1; times<=9;want++){
                            System.out.println("dan"+"X"+times+"="+times*want);
                        }
                        System.out.println();

                    }
                if(num==3){
                    break;
                }



            }

        }
*/
        while(true){
            System.out.println("1.원하는 구구단을 출력");
            System.out.println("2.전체 구구단을 출력");
            System.out.println("3. 종료");
            int num = sc.nextInt();

            if(num==1){
                System.out.println("원하는 구구단 :");
                int dan = sc.nextInt();
                if(dan<2 || dan>9){
                    System.out.println("잘못된 입력입니다.");
                }
                else{
                    for(int times=1; times<=9;times++){
                        System.out.println(dan+"X"+times+"="+dan*times);
                    }
                }

            }
          else  if(num==2){
                int dan;
                int times;


            }
       else if(num==3){

                System.out.println("종료합니다");
                break;
        }
       else{}
        }

        
        
        
        
        

    }
}
