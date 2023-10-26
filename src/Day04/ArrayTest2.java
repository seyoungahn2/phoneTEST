package Day04;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] data = new double[5];

        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;
        data[3] = 25.0;
        data[data.length-1]=50.0;

        for(int i=0; i < data.length; i++){
            System.out.println(data[i]);
        }

    }
}
