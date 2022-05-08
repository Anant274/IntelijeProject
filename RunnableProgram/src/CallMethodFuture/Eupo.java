package CallMethodFuture;


import java.util.Random;
import java.util.concurrent.Callable;

public class Eupo implements Callable {

    @Override
    public Object call() throws Exception {
        Random rn=new Random();
        Integer rmNo=rn.nextInt(10);
        Thread.sleep(rmNo*10);
        return rmNo;
    }
}
