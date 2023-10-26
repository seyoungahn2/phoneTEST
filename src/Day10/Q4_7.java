package Day10;

class Car{
    String color;
    String menu;
    int maxSpeed;

    Car(String c, String m, int max){
        color = c;
        menu = m;
        maxSpeed = max;
    }

    void dirve(){
        System.out.println("자동차 색깔은 "+color+"이고 제조사는 "+
                menu +"이고 최고 속력은 "+maxSpeed +"인 차를 운전합니다.");

    }

}
class Bike{
    String menu;
    String function;

    Bike(String m, String f){
        menu = m;
        function = f;
    }

    void ride(){
        System.out.println("자전거 제조사는 "+menu+"이고 기능은 "+
                function +"인 자전거를 탑니다.");
    }
}
class MBike{
    String color;
    String menu;
    int maxSpeed;

    MBike(String c, String m, int max){
        color = c;
        menu = m;
        maxSpeed = max;
    }

    void dirve(){
        System.out.println("오토바이 색깔은 "+color+"이고 제조사는 "+
                menu +"이고 최고 속력은 "+maxSpeed +"인 오토바이를 운전합니다.");

    }
}

class Human1{
    Car c1;
    Car c2;
}
class Human2{
    Bike bike;
    MBike mBike;
}

public class Q4_7 {
    public static void main(String[] args) {
        Car c1 = new Car("은색","Ford",220);
        Car c2 = new Car("검정색","BMW",240);
        Car c3 = new Car("하얀색","삼성",200);
        Car c4 = new Car("형광색","현대",180);

        Bike b1 = new Bike("삼천리","산악용");
        Bike b2 = new Bike("자이언트","접이식용");

        MBike mBike = new MBike("대림","빨간",180);

        Human1 h1 = new Human1();
        Human2 h2 = new Human2();

        h1.c1 = c2;
        c2 = null;
        h1.c2 = c4;
        c4 = null;

        h2.bike = b1;
        b1 = null;
        h2.mBike = mBike;
        mBike = null;

        h1.c1.dirve();
        h1.c2.dirve();

        h2.bike.ride();
        h2.mBike.dirve();

    }

}
