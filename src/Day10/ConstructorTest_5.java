package Day10;

class Person1{
    String name;
    float height;
    float weight;

    Person1(String n, float h, float w){
        name = n;
        height = h;
        weight = w;
    }
}

public class ConstructorTest_5 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("James",180.2f,78.7f);
    }
}
