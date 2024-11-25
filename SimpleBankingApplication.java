import java.util.Scanner;

public class Bank {
    static double balance = 0;              // If any changes are made to this variable through object,
                                            // it will reflect in other objects as well (static)
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int option = 0;

        while(option != 4){

            System.out.println("Welcome to the Bank.");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit the application");
            System.out.print("Enter an option: ");
            
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    checkBalance();         // Realiza el método indicado
                    break;
                case 2:
                    depositMoney();         // Realiza el método indicado
                    break;
                case 3:
                    withdrawMoney();        // Realiza el método indicado
                    break;
                case 4:
                    exit();                 // Realiza el método indicado
                    break;
                default:
                    System.out.println("Invalid option. Try again.");   // If the user type an
                    break;                                              // unexpected number
            }
        }
    }

    public static void checkBalance(){      // Doesn't return anything (void)
        System.out.println("Your current balnce is $" + balance);
    }      

    public static void depositMoney(){      // Doesn't return anything (void)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount to deposit: $");
        double amount = scan.nextDouble();

        balance += amount;
        System.out.println("$" + amount + " has been deposited to your account.");
        checkBalance();                     // Show the current balance after the deposit.
    }      

    public static void withdrawMoney(){     // Doesn't return anything (void)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: $");
        double amount = scan.nextDouble();

        if(amount < balance){
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn to your account.");
            checkBalance();                     // Show the current balance after the deposit.
        }   
            
        else{ System.out.println("Insufficient funds."); }
    }

    public static void exit(){              // Doesn't return anything (void)
        System.out.println("Thank you for banking with us. Have a great day!");
    }
}
