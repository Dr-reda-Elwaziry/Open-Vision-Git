import java.util.*;


public class BankAccount {

    public static void main(String[] args) {

        BankAccountWithDraw p1 = new BankAccountWithDraw();

        System.out.println("Good Morning, Sir");
        System.out.println("Please enter 1 to withDraw or 2: to deposite");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("please enter your id ");
                int id = input.nextInt(00000);
                p1.setaccountId(id);
                System.out.println("please enter witdraw amount");
                double amount = input.nextInt();
                p1.witgDraw(amount);
                break;

            case 2:
                System.out.println("please enter your id ");
                int ids = input.nextInt(00000);
                p1.setaccountId(ids);
                System.out.println("please enter deposit amount");
                double amounts = input.nextInt();
                p1.deposite(amounts);
                break;


        }
    }
}

