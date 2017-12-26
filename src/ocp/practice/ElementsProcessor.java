package ocp.practice;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by iuliab on 17.12.2017.
 */
public class ElementsProcessor {

    public void processElements() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        for (int i = 0; i < 15; i++) {
            ProducedElement element = new ProducedElement(i,  50.0 + 100*(i+1));
            service.scheduleWithFixedDelay(()-> System.out.println(element.getSequenceNumber()), 5, (long)element.getProducingTime(), TimeUnit.MILLISECONDS);
        }
    }
}
