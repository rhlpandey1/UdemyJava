package udemy.oops.constructors;

public class BankAccount {
    private String accountNumber;
    private  double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public BankAccount(){
        System.out.println("Empty constructor is called");
    }
    //parameterized constructor
    public  BankAccount(String accountNumber,double balance,String customerName,String email,String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999",100.00,customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFund(double amount){
        this.balance+=amount;
        System.out.println("Deposit of amount "+amount+" is successful ,  balance is  "+this.balance);
      //  return balance;
    }
    public void withdrawFund(double amount){
        if(balance-amount<0)
            System.out.println("Withdrawal not possible as balance is "+this.balance);
        else{
            this.balance-=amount;
            System.out.println("Withdrawal of amount "+amount+" is successful , Remaining balance is  "+this.balance);
        }

       //return balance;
    }
}
