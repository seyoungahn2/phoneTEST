package Day08;

import java.util.Scanner;

public class BuggerTest_6 {

    /*
    메인 메뉴 -> 숫자
    1. 갈릭버거 2.페페로니 3.페포로니치킨 4.콜로수워치킨 5.종료
    사이드 메뉴 -> 숫자
    1. 감자튀김 2.콜라 3.사이다 4. 없음
    결제 -> 문자열 입력
    1. 카드 2. 상품권 3.현금
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        String pay;
        String sideMenu;
        int num;
        boolean check = true;

        while(check){
            System.out.print("메뉴를 입력하세요>");
            num = sc.nextInt();
            switch (num){
                case 1:
                    menu = "갈릭버거";
                    System.out.print("사이드 메뉴를 입력하세요>");
                    num = sc.nextInt();
                    if(num == 1){
                        sideMenu = "감자튀김";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);

                    }
                    else if(num == 2){
                        sideMenu = "콜라";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 3){
                        sideMenu = "사이다";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 4){
                        sideMenu = "없음";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else{
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 2:
                    menu = "페퍼로니";
                    System.out.print("사이드 메뉴를 입력하세요>");
                    num = sc.nextInt();
                    if(num == 1){
                        sideMenu = "감자튀김";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);

                    }
                    else if(num == 2){
                        sideMenu = "콜라";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 3){
                        sideMenu = "사이다";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 4){
                        sideMenu = "없음";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else{
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 3:
                    menu = "페포로니치킨";
                    System.out.print("사이드 메뉴를 입력하세요>");
                    num = sc.nextInt();
                    if(num == 1){
                        sideMenu = "감자튀김";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);

                    }
                    else if(num == 2){
                        sideMenu = "콜라";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 3){
                        sideMenu = "사이다";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 4){
                        sideMenu = "없음";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else{
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 4:
                    menu = "콜로수워치킨";
                    System.out.print("사이드 메뉴를 입력하세요>");
                    num = sc.nextInt();
                    if(num == 1){
                        sideMenu = "감자튀김";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);

                    }
                    else if(num == 2){
                        sideMenu = "콜라";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 3){
                        sideMenu = "사이다";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else if(num == 4){
                        sideMenu = "없음";
                        System.out.print("결제 방법을 선택해주세요>");
                        pay = sc.next();
                        while(!(pay.equals("카드") || pay.equals("현금")||
                                pay.equals("상품권"))){
                            System.out.print("결제 방법을 선택해주세요>");
                            pay = sc.next();
                        }
                        System.out.println("주메뉴 : "+menu+"사이드 메뉴 : "+
                                sideMenu+"결제 방법 : "+pay);
                    }
                    else{
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
