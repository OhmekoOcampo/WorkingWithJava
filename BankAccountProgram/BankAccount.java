package BankAccountProgram;
public class BankAccount {

    private int accountNumber;
    private int balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructors can be overloaded.
    public BankAccount(){
        //this() is a special use of this keyword when a constructor is called with no arguments.
        this(56789,2,"Default Name","Default address","Default phone");
        System.out.println("Empty Constructor called!");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parameters called!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int money){
        if(money < 0){
            System.out.println("This is invalid input, positive numbers only!");
        }else{
            this.balance = balance + money;
            System.out.println("Your current balance is: " + balance);
        }
    }

    public void withdrawal(int money) {
        if (money < 0) {
            System.out.println("This is invalid input, positive numbers only!");
        } else if (this.balance - money <0) {
            System.out.println("You have insufficient funds in your account");
        } else{
            balance = balance - money;
            System.out.println("Your current balance is: " + balance);
        }

    }


}
