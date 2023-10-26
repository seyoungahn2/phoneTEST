package Day12;

class Tier{

}

class Engine{

}

class Car{
    Tier[] t;
    Engine e;
}

class Factory{

    Car makeCar(Tier[] t, Engine e){
        Car c = new Car();
        c.t = t;
        c.e = e;
        return c;
    }

}

public class HasTest2_6 {
    public static void main(String[] args) {
        Factory f = new Factory();
        Engine e = new Engine();
        Tier[] t = new Tier[4];

        for(int i = 0;i<t.length;i++){
            t[i] = new Tier();
        }
        Car c = f.makeCar(t,e);
    }
}
