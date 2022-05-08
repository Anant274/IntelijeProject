package SimpleProgram;
import java.util.Map.*;
import java.util.*;

public class Program {
    public static void main(String []arg)
    {
        System.out.println("my name is khan");
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"anant");
        mp.put(2,"kumar");
        mp.put(3,"pandey");

       Iterator it=mp.keySet().iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());

       }

       Iterator itr=mp.values().iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }


       for(Map.Entry<Integer,String> entry:mp.entrySet())
       {
           System.out.println(entry);
       }

    }
}
