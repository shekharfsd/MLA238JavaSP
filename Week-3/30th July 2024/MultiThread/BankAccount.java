package com.mphasis.thread.conc;
public class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        Runnable depositTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(1);
            }
        };

        Thread t1 = new Thread(depositTask);
        Thread t2 = new Thread(depositTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.getBalance()); // Should be 2000
    }
}
