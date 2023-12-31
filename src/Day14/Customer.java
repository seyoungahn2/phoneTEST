package Day14;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    String showCustomerInfo(){
        return customerName+" 님의 등급은 "+customerGrade+" 이며, 보너스 포인트는"+
                bonusPoint+" 입니다.";
    }
}
