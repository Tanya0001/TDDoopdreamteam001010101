/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg6.dm.pt;

/**
 *
 * @author taurus
 */
public abstract class Account {

    /*public static enum accountType
    {Checking, Savings
    };*/

    protected double balance;
    /*protected int accountNumber;
    protected String typeOfAccount;
    
    private static int currentAccountNumber;// = 10000;
    
    public static int getNumberOfAccounts() {
    return currentAccountNumber - 10000;
    }
    
    static {
    currentAccountNumber = 10000;
    }*/

    public Account(double balance) {
        this.balance = balance;
        /*accountNumber = currentAccountNumber++;
        typeOfAccount=type.toString();
        */
    }
    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt <= balance) {
            balance = balance - amt;

        } else {
            throw new OverdraftException("Insufissient funds", amt - balance);
        }
    }

    @Override
    public String toString() {
        return "Account #" + balance;
    }
    
}
