/**
 * Created by amalabukar on 11/16/16.
 */
public class Transaction {
private String name;
private String action;
private int withdraw;

public void chooseName() throws Exception {
    System.out.println("What is your name.");
    name=ATM.scanner.nextLine();
    System.out.println("Welcome, " + name);
    if (name.isEmpty()) {throw new Exception ("Please enter valid name");}
    }

    public void chooseAction() {

    System.out.println ("What action would you like to do? [ Check Balance/Withdraw Funds/Cancel]");
        action = ATM.scanner.nextLine();

    if (action.equalsIgnoreCase(("Check Balance"))) {
        System.out.println("Your balance is $100");
    }
    else if (action.equalsIgnoreCase("Cancel")) {
        System.out.println ("Have a nice day");}

    else if (action.equalsIgnoreCase ("Withdraw")){
            System.out.println ("How much?");

        {
            withdraw = ATM.scanner.nextInt();
            if(withdraw <=100) {
                System.out.print("Please take");

            } else if (withdraw > 100) {
                System.out.println ("Invalid");
            }}}}}
