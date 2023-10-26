package Day15;

import java.util.Random;
import java.util.Scanner;

class Product{
    String type;
    String name;
}

class Computer extends Product{
    Computer(){
        name = "컴퓨터";
    }
}
class AirCorn extends Product{
    AirCorn(){
        name="에어컨";
    }
}
class Ref extends Product{
    Ref(){
        name="냉장고";
    }
}
class AirCleaner extends Product{
    AirCleaner(){
        name="공기청정기";
    }
}


class Mart{
    Product[] products = new Product[40];

    Mart(){
        String[] types1 = {"삼성","LG"};
        String[] types2 = {"LG","다이슨"};
        Random r = new Random();
        for(int i = 0;i<products.length;i++){
            int num = r.nextInt(4);
            if(num == 0){
                products[i] = new Computer();
                products[i].type = types1[r.nextInt(2)];
            }
            else if(num == 1){
                products[i] = new AirCorn();
                products[i].type = types1[r.nextInt(2)];
            }
            else if(num == 2){
                products[i] = new Ref();
                products[i].type = types1[r.nextInt(2)];
            }
            else{
                products[i] = new AirCleaner();
                products[i].type = types2[r.nextInt(2)];
            }
            System.out.println(products[i].name + "->" + products[i].type);
        }
    }

    void find(String name, String type){
        int i ;
        for(i = 0;i< products.length;i++){
            if(products[i].name.equals(name) && products[i].type.equals(type)){
                System.out.println("인덱스는 "+i+"번째 입니다.");
                break;
            }
        }
        if(i == products.length){
            System.out.println("찾는 제품이 없습니다.");
        }
    }

}

public class Q2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mart m = new Mart();

        System.out.print("제품 입력 : ");
        String name = sc.next();
        System.out.print("제조사 : ");
        String type = sc.next();
        m.find(name,type);

    }
}
