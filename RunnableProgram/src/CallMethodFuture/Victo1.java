package CallMethodFuture;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Victo1 {
    public static void main(String[] args) throws Exception {
        FutureTask[] ft=new FutureTask[10];
        for (int i=0;i<10;i++)
        {
            Callable clb=new Eupo();
            ft[i]=new FutureTask<>(clb);
            Thread th=new Thread(ft[i]);
            th.start();
        }
        for (int j=0;j<10;j++)
        {
            Object ob=ft[j].get();
            System.out.println(ob);
        }

    }
}
