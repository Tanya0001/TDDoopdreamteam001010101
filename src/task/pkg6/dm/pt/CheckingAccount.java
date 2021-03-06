/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg6.dm.pt;

/**
 *
 * @author student1
 */
public class CheckingAccount extends Account {

    private double overdraftAmount = 3000;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double over) {
        super(balance);
        overdraftAmount = over;
    }

    public void withdraw(double amount) throws OverdraftException {
        if (balance < amount) {
            throw new OverdraftException("Insufficient funds for overdraft protection",amount-balance);
        } else {
            balance = -amount;
        }

    }
}
