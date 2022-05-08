package ReverseKey;

import java.util.HashMap;
import java.util.Map;

public class ReverseKey {
    public static void main(String []arg)
    {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"anant");
        mp.put(8,"pandey");
        mp.put(5,"bansal");
        mp.put(4,"ramganesh");

       // mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->mp.put(x.getKey(),x.getValue()));
        //System.out.println(mp);

//        mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->mp.put(x.getValue(),x.getKey()));
//        System.out.println(mp);
//
        for(Map.Entry<Integer,String> em:mp.entrySet());
        {
            System.out.println(mp);
        }

        mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->mp.put(x.getKey(),x.getValue()));
        System.out.println(mp);


    }
}
