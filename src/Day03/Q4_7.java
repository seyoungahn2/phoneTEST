package Day03;

public class Q4_7 {
    public static void main(String[] args) {
        //1.
        /*
        *****
        *****
        *****
        *****
        *****
        */
        for(int i = 0;i<5;i++){ // 5반복 -> 행
            for(int j = 0;j<5;j++){ //5반복 -> 열
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //2.
        /*
        *
        **
        ***
        ****
        *****
         */
        for(int i = 0;i<5;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //3.
        /*
        ㅁㅁㅁㅁ*
        ㅁㅁㅁ**
        ㅁㅁ***
        ㅁ****
        *****
         */
        for(int i = 0;i<5;i++){
            for(int j = 4;j>=0;j--){
                if(i<j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //4.
        /*
            *
           ***
          *****
         *******
        *********
         */
        for(int i = 0;i<5;i++){
            for(int j = 4;j>=0;j--){
                if(i<j){
                    System.out.print(" ");
                }
                else{
                    for(int k = 0;k<i*2+1;k++) {
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }

        for(int i = 0;i<5;i++){
            for(int j = 4;i<j;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //5.
        /*
            *
           ***
          *****
           ***
            *
         */
        for(int i = 0;i<3;i++){
            for(int j = 2;i<j;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 3;k-(i*2)>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
