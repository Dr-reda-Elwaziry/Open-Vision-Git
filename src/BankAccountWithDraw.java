/**
 * Created by OV-Lab1-1 on 7/15/2017.
 */
public class BankAccountWithDraw {

    private int accountId = 0;
    public double accountBalance = 5000.0;

    public static void getBalance() {

    }

    public void setaccountId(int accountId) {
        this.accountId = accountId;


    }

    public void witgDraw(double amount) {

        System.out.println("please enter witdraw amount");
        if (this.accountBalance >= amount) {
            System.out.println("please wait while the transaction is processing");
            accountBalance -= amount;
            System.out.println("Here you are sir!" + amount + " please Notify that your balance become " + this.accountBalance + "bye sir");
        } else {
            System.out.println("Sorry sir!" + " your Balance is not Enough " + " Your balance is " + this.accountBalance);

        }
    }

    public void deposite(double amount) {
        System.out.println("please enter your cash amount");

        System.out.println("please wait while the transaction is processing");
        accountBalance += amount;
        System.out.println("thanks sir!" + "your balance become " + this.accountBalance + "bye sir");

    }
}
