package Day06;

import java.util.Random;

public class Q1_1 {
    public static void main(String[] args) {
        //초기화 작업을 위해서 Random 객체 생성
        Random r = new Random();
        //값이 담길 배열 생성
        int[] a= new int[5];
        //1. 랜덤값을 각각의 배열에 값을 채울 때 중복 X
        for (int i = 0;i<a.length;i++){
            a[i] = r.nextInt(9)+1;
            for(int j = 0;j<i;j++){
                if(a[i] == a[j]){
                    i--;
                    break;
                }
            }
        }

        //2. 출력
        for(int i = 0;i<a.length;i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
        System.out.println("=============================================");
        //3. 정렬(선택정렬)
        for(int i =0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j])
                {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            for(int k = 0;k<a.length;k++){
                System.out.println("a["+k+"] : "+a[k]);
            }
            System.out.println("=============================================");
        }
        System.out.println("=============================================");
        //2. 출력
        for(int i = 0;i<a.length;i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
    }
}
