package com.mphasis.thread.conc;
public class BankAccountwithout {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccountwithout account = new BankAccountwithout();
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

        System.out.println("Final balance: " + account.getBalance()); // Might not be 2000
    }
}
