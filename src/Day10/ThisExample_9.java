package Day10;

class BirthDay{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year;
    }

}
public class ThisExample_9 {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2000);
        System.out.println(bDay.year);
    }
}
