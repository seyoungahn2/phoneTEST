package Day16;

import java.util.Random;

abstract class Animal{
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void print();

}
class Dog extends Animal{
    void print(){
        System.out.println(getColor()+"의 "+getName()+"는 짖는다.");
    }
}
class Cat extends Animal{
    void print(){
        System.out.println(getColor()+"의 "+getName()+"는 야옹한다.");
    }
}
class Bird extends Animal{
    void print(){
        System.out.println(getColor()+"의 "+getName()+"는 날아다닌다.");
    }
}

public class Q1_9 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] dName ={"말티즈","요크셔테리어","포메라니안","시바","웰시코기"};
        String[] cName = {"먼치킨","스핑크스","뱅갈","샴","폴드"};
        String[] bName = {"앵무새","참새","닭","까마귀","비둘기"};
        String[] colorName = {"갈색","검은색","흰색","노란색","점박이"};

        Animal[] animals = new Animal[6];

        for(int i = 0;i<3;i++){
            animals[i] = new Dog();
            animals[i].setName(dName[r.nextInt(5)]);
            animals[i].setColor(colorName[r.nextInt(5)]);
        }

        for(int i = 3;i<5;i++){
            animals[i] = new Cat();
            animals[i].setName(cName[r.nextInt(5)]);
            animals[i].setColor(colorName[r.nextInt(5)]);
        }

        animals[5] = new Bird();
        animals[5].setName(bName[r.nextInt(5)]);
        animals[5].setColor(colorName[r.nextInt(5)]);

        for(int i = 0;i< animals.length;i++){
            animals[i].print();
        }
    }
}
