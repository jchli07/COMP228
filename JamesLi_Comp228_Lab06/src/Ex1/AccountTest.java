package Ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        //Declare tasks
        Transaction task1 = new Transaction("Withdraw", new Account(100));
        Transaction task2 = new Transaction("Deposit", new Account(50));

        System.out.println("Begin Task");

        // Create ExecutorService to manage threads
        ExecutorService exService = Executors.newCachedThreadPool();

        exService.execute(task1);
        exService.execute(task2);

        exService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
