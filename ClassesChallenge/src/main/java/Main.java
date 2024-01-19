public class Main {

    public static void main(String[] args) {
        BankAccount test = new BankAccount();
        BankAccount ba = new BankAccount("12345", 1000.00, "David Veselý",
                "myemail@dejv.com", "13456789");
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());

        ba.depositFunds(5000);
        ba.withdrawFunds(1000);
        ba.withdrawFunds(1000);
        ba.withdrawFunds(1000);
        ba.withdrawFunds(1000);
        ba.withdrawFunds(1000);
        ba.withdrawFunds(1000);


        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }
}
