package Day14;

public class CustomerTest1_7 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer();
        vc.setCustomerID(10030);
        vc.setCustomerName("나몰라");
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(10000)+
                "원 입니다.");
    }
}
