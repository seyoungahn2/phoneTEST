package Day14;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    VIPCustomer(){
        setCustomerGrade("VIP");
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}
