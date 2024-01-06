import java.util.Scanner;

class SavingsAccount {

    private double balance;
    public static double interestRate;
    
    public SavingsAccount() {
        balance = 0;
    }
    
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }
    
    public static double getInterestRate() {
        return interestRate;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public double withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
    
    public static void showBalance(SavingsAccount account) {
        System.out.println("Current Balance: " + account.getBalance());
    }
}

public class RunSavingsAccount {

    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        
        System.out.print("Enter interest rate: ");
        SavingsAccount.setInterestRate(user.nextDouble());
        
        SavingsAccount savings = new SavingsAccount();
        
        System.out.print("Enter deposit amount: ");
        savings.deposit(user.nextDouble());
        
        SavingsAccount.showBalance(savings);
        
        boolean running = false;
        
        while(!running) {
            System.out.print("Enter D to deposit, W to withdraw, or Q to quit: ");
            String choice = user.next();
            
            if(choice.equalsIgnoreCase("D")) {
                System.out.print("Enter deposit amount: ");
                savings.deposit(user.nextDouble());
                
            } else if(choice.equalsIgnoreCase("W")) {
                System.out.print("Enter withdraw amount: ");
                savings.withdraw(user.nextDouble());
                
            } else if(choice.equalsIgnoreCase("Q")) {
                running = true; 
            }else{
                System.out.println("Invalid input, Please Try Again");
            }
            
            SavingsAccount.showBalance(savings);
            
            if(savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("Balance with interest: " + savings.getBalance());
            }
        }

    }

}
