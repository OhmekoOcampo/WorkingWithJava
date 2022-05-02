package BankAccountProgram;

public class MainProgram {

    public static void main(String[] args){

        //BankAccount bankaccount = new BankAccount(12345,0,"Ohmeko Ocampo","MekoGangsta@gmail.com","1(619)696-6996");
        BankAccount bankaccount = new BankAccount();
        //bankaccount.setAccountNumber(696969);
        //bankaccount.setBalance(0);
        //bankaccount.setCustomerName("Ohmeko Ocampo");
        //bankaccount.setEmail("MekoGangasta@gmail.com");
        //bankaccount.setPhoneNumber("1(619)696-6969");

        System.out.println(bankaccount.getAccountNumber());
        System.out.println(bankaccount.getBalance());
        System.out.println(bankaccount.getCustomerName());
        System.out.println(bankaccount.getEmail());
        System.out.println(bankaccount.getPhoneNumber());

        bankaccount.withdrawal(1000);
        bankaccount.deposit(1000000);

    }
}
