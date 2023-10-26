package Day15;

class Box<T>{
    T vol;

    void setVolume(T v){
        vol = v;
    }
    T getVolume(){
        return vol;
    }
}

public class GenericTest_9 {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>();
        ibox.setVolume(200);
        //ibox.setVolume(1.7);
        Box<Double> dbox = new Box<>();
        dbox.setVolume(123.456);
        //dbox.setVolume(123);
        Box<Zerg> zergBox = new Box<>();
        zergBox.setVolume(new Zerg());
    }
}
