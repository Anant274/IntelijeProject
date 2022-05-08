package CallMethodFuture;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Victo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] ft= new FutureTask[10];
        for (int j=0;j<10;j++)
        {
            Callable clble = new Eupo();
            ft[j]=new FutureTask<>(clble);
            Thread th=new Thread(ft[j]);
            th.start();

        }
        for (int j=0;j<10;j++)
        {
            Object o=ft[j].get();
            System.out.println(o);
        }
    }
}
