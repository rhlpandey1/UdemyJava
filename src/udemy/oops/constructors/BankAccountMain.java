package udemy.oops.constructors;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("12345",300.00,"Rahul","abc@cde.com","1234567890");
        System.out.println(bankAccount.getEmail());
        bankAccount.depositFund(300);
        bankAccount.withdrawFund(600);
        BankAccount bankAccount1=new BankAccount("Rahul","dsabd@vdvd.com","123456789");
        System.out.println(bankAccount1.getEmail());
    }

}
