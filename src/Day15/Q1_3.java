package Day15;

import java.util.Random;

abstract class Animal{
    String color;

    abstract void talk();
}

class Dog extends Animal{
    void talk(){
        System.out.println("나는 "+color+" 강아지입니다.");
    }
}
class Cat extends Animal{
    void talk(){
        System.out.println("나는 "+color+" 고양이입니다.");
    }
}

class Mia extends Animal{
    void talk(){
        System.out.println("나는 "+color+" 미어캣입니다.");
    }
}
class Panda extends Animal{
    void talk(){
        System.out.println("나는 "+color+" 판다입니다.");
    }
}
public class Q1_3 {

    public static void main(String[] args) {
        Random r = new Random();
        Animal[] woori = new Animal[10];

        String[] colors = {"빨간", "주황","노랑","초록","파란","남","보라"};

        for(int i = 0;i<woori.length;i++){
            int num = r.nextInt(4);
            if(num == 0){
                woori[i] = new Dog();
            }
            else if(num == 1){
                woori[i] = new Cat();
            }
            else if(num == 2){
                woori[i] = new Mia();
            }
            else{
                woori[i] = new Panda();
            }
            woori[i].color = colors[r.nextInt(7)];
            woori[i].talk();
        }
    }
}
