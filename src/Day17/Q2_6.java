package Day17;

import java.util.Random;

abstract class Vehicle{
    int distance;
    int gauge;

    abstract void Move(int stop, Random r, int count);
}

interface Booster{
    void boost();
}

class Car extends Vehicle implements Booster{
    void gaugePrint(int count){
        gauge = count % 4;
        System.out.print("자동차의 게이지 : "+gauge+",");
    }
    void distancePrint(){
        System.out.println("자동차의 주행거리 : "+distance);
    }

    void Move(int stop, Random r, int count){
        int move = r.nextInt(21);
        if(stop != 1){
            distance += move;
        }
        gaugePrint(count);
        distancePrint();
    }
    public void boost(){
        distance += 2;
    }
}

class Bicycle extends Vehicle implements Booster{
    void gaugePrint(int count){
        gauge = count % 2;
        System.out.print("자전거의 게이지 : "+gauge+",");
    }
    void distancePrint(){
        System.out.println("자전거의 주행거리 : "+distance);
    }

    void Move(int stop, Random r, int count){
        int move = r.nextInt(11);
        if(stop != 2){
            distance += move;
        }
        gaugePrint(count);
        distancePrint();
    }
    public void boost(){
        distance += 5;
    }
}

class Motocycle extends Vehicle implements Booster{
    void gaugePrint(int count){
        gauge = count % 3;
        System.out.print("오토바이의 게이지 : "+gauge+",");
    }
    void distancePrint(){
        System.out.println("오토바이의 주행거리 : "+distance);
    }

    void Move(int stop, Random r, int count){
        int move = r.nextInt(16);
        if(stop != 3){
            distance += move;
        }
        gaugePrint(count);
        distancePrint();
    }
    public void boost(){
        distance += 3;
    }
}

public class Q2_6 {
    static void boosterRun(int stop,Vehicle v){
        if(v instanceof Car){
            if(stop != 1 && v.gauge == 3){
               Car c = (Car)v;
               c.boost();
                //((Car)v).boost();
            }
        }
        if(v instanceof Bicycle){
            if(stop != 2 && v.gauge == 1){
                Bicycle b = (Bicycle)v;
                b.boost();
                //((Bicycle)v).boost();
            }
        }
        if(v instanceof Motocycle){
            if(stop != 3 && v.gauge == 2){
                Motocycle m = (Motocycle)v;
                m.boost();
                //((Motocycle)v).boost();
            }
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        Car c = new Car();
        Bicycle b = new Bicycle();
        Motocycle m = new Motocycle();

        int count = 0;
        int stop;

        while(true){
            stop = r.nextInt(3)+1;//1~3

            c.Move(stop,r,count);
            b.Move(stop,r,count);
            m.Move(stop,r,count);

            boosterRun(stop,c);
            boosterRun(stop,b);
            boosterRun(stop,m);

            if(c.distance >= 500 || b.distance >= 500 || m.distance >= 500){
                break;
            }
            count++;
        }

        if(c.distance>b.distance && c.distance > m.distance){
            System.out.println("자동차 우승");
        }
        else if(b.distance > c.distance && b.distance >m.distance){
            System.out.println("자전거 우승");
        }
        else{
            System.out.println("오토바이 우승");
        }
    }
}
