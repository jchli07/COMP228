package Ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayTest
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new Transaction("Withdraw",
                new Account(100), arrayList));
        arrayList.add(new Transaction("Withdraw",
                new Account(50), arrayList));
        arrayList.add(new Transaction("Deposit",
                new Account(150), arrayList));
        arrayList.add(new Transaction("Deposit",
                new Account(10), arrayList));

        // Execute threads
        ExecutorService exService = Executors.newCachedThreadPool();
        for (int i = 0; i < 4; i++)
        {
            exService.execute(arrayList.getValue(i));
        }

        exService.shutdown();

    }
}

