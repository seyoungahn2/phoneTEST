package Day07;

import java.util.Scanner;

public class Q5_7 {

    // 2. 주고 안받고
    // 매개변수 X
    // 리턴 타입 int[] -> return
    static int[] input(){
        Scanner sc = new Scanner(System.in); // 입력을 위한 Scanner 생성
        int[] score = new int[3]; // 점수 입력을 위한 int[] score 배열 생성 후 int[3] 대입
        //과목 배열 -> String[] subject 배열 생성 후 [0] 국어 [1] 수학 [2] 영어
        String[] subject = {"국어","수학","영어"};

        // score 길이 보다 작으면 계속 반복 -> i++ 되니까
        for(int i = 0;i<score.length;i++){
            System.out.print(subject[i]+" : "); // 출력 -> subject[i] 값을 출력
            score[i] = sc.nextInt(); // 입력 한 정수 값을 -> score[i]에 대입
        }
        //반복문 종료후 int[] score 리턴
        return score;
    }

    // 1. 주고 받고
    //매개변수 int[] score
    //리턴 double
    static double opResult(int[] score){
        int result = 0; //변수 선언
        //
        for(int i = 0;i<score.length;i++){
            result += score[i]; // score[i] 값을 result 값에 더해서 result에 대입
        }
        double avg = result / 3.0;//result 변수의 값을 / 3.0을 한 실수 값을 double변수 avg에 대입

        //double 변수 avg을 리턴
        return avg;
    }

    // 1. 주고 받고
    // 매개변수 double avg
    // 리턴 String
    static String hakjumMake(double avg){
        String hak; // 문자열 변수 hak 선언
        //avg를 기준으로 학점을 hak에다 대입
        if(avg > 94){
            hak = "A+";
        }
        else if(avg > 89){
            hak = "A";
        }
        else if(avg > 84){
            hak = "B+";
        }
        else if(avg > 79){
            hak = "B";
        }
        else if(avg >74){
            hak = "C+";
        }
        else if(avg >69){
            hak = "C";
        }
        else if(avg >59){
            hak = "D";
        }
        else{
            hak = "F";
        }

        //문자열 변수 hak을 리턴
        return hak;
    }

    //3. 안주고 받고
    //매개변수 boolean[] check, int[] score
    //리턴 X
    static void wrongCheck(boolean[] check,int[] score){
        //매개변수인 boolean[] check에서 인덱스 0, 1, 2 값을 추출하여
        //이중에 하나라도 true이면 true
        if(check[0] || check[1] || check[2]) { // 잘못된 입력
            wrongPrint(); // wrongPrint 실행
        }
        //위 조건이 아닌 경우 실행
        //check 배열의 값이 모두 false인 경우
        else{
            // opResult메소드를 호출시 매개변수로 int[] score을 대입 그 결과를 double avg가 받는다.
            double avg = opResult(score);
            //hakjumMake메소를 호출시 매개변수로 double avg를 대입 그 결과를 String hak에다 대입
            String hak = hakjumMake(avg);
            //hakjumPrint메소드를 호출시 매개변수 double avg, String hak을 대입만 하고 실행
            hakjumPrint(avg,hak);
        }
    }

    //4. 안주고 안받고
    //매개변수 X
    //리턴 X
    static void wrongPrint(){
        System.out.println("잘못 입력 됐습니다."); //출력
    }
    //3. 안주고 받고
    //매개변수 double avg, String hak
    //리턴 X
    static void hakjumPrint(double avg, String hak){
        //매개변수 avgm hak을 문자열 연산을 통해 하나의 문자열 만든 것을 출력
        System.out.println("평균 점수는 : "+avg+"학점은"+hak+"입니다.");
    }

    public static void main(String[] args) {
        //boolean 배열 변수를 check라는 이름으로 생성 후
        //boolean [3]배열 객체를 대입
        //잘못 입력된 과목이 있으면 그 과목과 같은 인덱스
        // ture 변경을 하기 위한 배열
        boolean[] check = new boolean[3];

        // 1. input 메소드 호출
        // 2. input 메소드에서 리턴한 값을 int[] score에 대입
        // input 메소드는 int[]을 리턴하는 구나
        int[] score = input();

        //input을 통해서 int[] score에 값이 들어가 있습니다.
        //초기문 정수 타입 변수 i를 선언후 0을 대입
        //조건문 변수 i가 score 길이보다 작으면 반복
        //증감문 아래 명령문을 돌때마다 1씩증가
        for(int i = 0;i<score.length;i++){
            //score[i] 값이 0보다 작거나 100보가 크면 실행
            if(score[i] < 0  || score[i] > 100){
                //위 조건이 맞으면 check[i]를 true 변경
                check[i] = true;
            }
        }
        //wrongCheck메소드를 호출을 하는 데
        //매개변수는 boole[] check, int[] score
        //리턴 값 없는 걸로 추론
        wrongCheck(check,score);
    }
}

