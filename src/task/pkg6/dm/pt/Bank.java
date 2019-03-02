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
public class Bank {
    private static List<Customer> customers;
    private static int numberOfCustomers=0;
    private String name;
    private Account[] accounts;

    static {
        customers = new ArrayList<Customer>(10);
        numberOfCustomers = 0;
    }
    private Bank() {
        // this constructor should never be called
    }

    public String toString() {
        return "Bank name: " + name + "\nnumber of accounts: "
                + accounts.length;
    }
    public static void addCustomer(String f, String l) {
    int i = numberOfCustomers++;
    customers.add(new Customer(f, l));
    }
    public static int getNumOfCustomers() {
    return customers.size();
    }
    public static Customer getCustomer(int customer_index) {
    return customers.get(customer_index);}
}