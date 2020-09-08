package udemy.oops.constructors;

public class VipCustMain {
    public static void main(String[] args) {
        VipCustomer vipCustomer=new VipCustomer();
        System.out.println(vipCustomer.getCreditLimit());
        VipCustomer vipCustomer1=new VipCustomer("XXX",200.00);
        System.out.println(vipCustomer1.getCreditLimit());
        VipCustomer vipCustomer2=new VipCustomer("ZZZ",500.00,"unknown user");
        System.out.println(vipCustomer2.getCreditLimit());
    }
}
