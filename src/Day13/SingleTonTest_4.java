package Day13;

class Company{
    private static Company instance;
    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
}
public class SingleTonTest_4 {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        System.out.println(company1 == company2);
    }
}
