package MultiThrd.Sync;

import java.util.concurrent.*;

public class AccountWithoutSync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Create and launch 100 threads
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }

        executor.shutdown();

        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }

    // A thread for adding a penny to the account
    private static class AddAPennyTask implements Runnable {
        public void run() {
//           Adding this key word will make this section synchronized so no need to
//           make the hole deposit method synchronized.
//            synchronized (this) {
                account.deposit(1);
//            }
        }
    }

    // An inner class for account
    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        // TODO to git rid of the cirtical section problem in this example
        // we use 'public synchronized void deposit(double amount) instead'
        public void deposit(int amount) {

            // we can add a semaphore here to synchronize:
            // semaphore.acquire to acquire the semaphore
            // just like acquiring a lock

            int newBalance = balance + amount;

            // This delay is deliberately added to magnify the
            // data-corruption problem and make it easy to see.
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex) {
            }

//            finally {
//                semaphore.release;
//
//            }


            balance = newBalance;


        }

    }
}