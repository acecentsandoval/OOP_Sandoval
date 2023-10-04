/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runsavingsaccount;

import java.util.*;

/**
 *
 * @author Acecent Sandoval
 */
public class RunSavingsAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.print("Enter deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        savings.deposit(initialDeposit);

        while (true) {
            System.out.print("Press D to deposit, W to withdraw, or Q to quit ");
            char choice = scanner.next().charAt(0);

            if (choice == 'D' || choice == 'd') {
                System.out.print("Enter the deposit amount: ");
                double depositAmount = scanner.nextDouble();
                savings.deposit(depositAmount);
            } else if (choice == 'W' || choice == 'w') {
                System.out.print("Enter the withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                double withdrawn = savings.withdraw(withdrawAmount);
                if (withdrawn == 0) {
                    System.out.println("Insufficient balance for withdrawal.");
                } else {
                    System.out.println("Withdrawn:" + withdrawn);
                }
            } else if (choice == 'Q' || choice == 'q') {
                break;
            } else {
                System.out.println("Invalid, Try again.");
            }

            SavingsAccount.showBalance(savings);

            if (savings.getBalance() > 1000) {
                savings.addInterest();
                System.out.println("Your New balance is " + savings.getBalance());
            }
        }

    }
    
}
