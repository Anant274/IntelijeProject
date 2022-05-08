package CallMethodOnly;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableInt implements Callable {
    public static void main(String[] args) {

    }

    @Override
    public Object call() throws Exception {
        Random rm=new Random();
        int ramNo=rm.nextInt(10);
        Thread.sleep(ramNo*100);
        return ramNo;
    }
}
