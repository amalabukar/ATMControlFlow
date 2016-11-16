
import java.util.Scanner;


/**
 * Created by amalabukar on 11/16/16.
 */
public class ATM {
    public static Scanner scanner= new Scanner(System.in);
    public static Transaction transaction= new Transaction();


public static void main(String[] args) throws Exception {
    System.out.println("Welcome to PNC.");

    transaction.chooseName();
    transaction.chooseAction();


}}


