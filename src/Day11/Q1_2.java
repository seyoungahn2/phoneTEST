package Day11;

class Animal{
    String type;
    String food;

    Animal(String type, String food){
        this.type = type;
        this.food = food;
    }

    void print(){
        System.out.println(type+"->"+food);
    }
}

public class Q1_2 {
    public static void main(String[] args) {
        Animal[] ani = new Animal[4];
        String[] at = {"원숭이","개","닭","돼지"};
        String[] ft = {"바나나","뼈다귀","모이","여물"};

        for(int i = 0;i<ani.length;i++){
            ani[i] = new Animal(at[i],ft[i]);
            ani[i].print();
        }

        String temp = ani[ani.length-1].food;

        for(int i = ani.length-1;i>0;i--){
            ani[i].food = ani[i-1].food;
        }
        ani[0].food = temp;

        for (int i = 0;i< ani.length;i++){
            ani[i].print();
        }
    }
}
