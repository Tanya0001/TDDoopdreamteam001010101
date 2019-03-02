/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg6.dm.pt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taurus
 */
public class Customer {

    private static int baseNumber = 1000;

    private String firstName;
    private String lastName;
    private int custNumber;

    private static int numberOfAccounts;
    private int currentAccountNumber = 0;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, int numberOfAccounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfAccounts = numberOfAccounts;
        accounts = new ArrayList<Account>(10);

        baseNumber++;
        this.custNumber = baseNumber;
    }

    Customer(String f, String l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean setAccount(Account newAccount) {
        if (currentAccountNumber < numberOfAccounts) {
            accounts.set(currentAccountNumber, newAccount);
            currentAccountNumber++;
            numberOfAccounts++;
            return true;
        } else {
            return false;
        }
    }

    public Account getAccount(int account_index) throws Exception {
        if (account_index < numberOfAccounts) {
            return accounts.get(account_index);
        } else {
            throw new Exception("неправильный номер счета!");
        }
    }
    public static int getNumberOfAccounts(){
       return numberOfAccounts;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return "\n"+ firstName + " " + lastName + "\n===\n номер клиента: " + custNumber + "\n количество счетов: " + numberOfAccounts;
    }
    public void addAccount(Account acct) {
accounts.add(acct);}
    

}