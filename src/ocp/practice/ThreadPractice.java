package ocp.practice;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by iuliab on 09.11.2017.
 */
public class ThreadPractice {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() -> {
                for (int i = 0; i < 5; i++)
                    System.out.println("Printing record: " + i);
            });
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
            service.execute(() -> System.out.println("Printing zoo2 inventory"));
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 5; i++)
                    System.out.println("Printing record: " + i);
            });
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
//            if (service != null)
//                service.shutdown();
        }
    }
}
