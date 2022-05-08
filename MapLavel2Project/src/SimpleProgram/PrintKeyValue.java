package SimpleProgram;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintKeyValue {
    public static void main(String[]arg)
    {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"raj");
        mp.put(2,"mintra");
        mp.put(3,"mahak");

        for(Map.Entry<Integer,String> en:mp.entrySet())
        {
            System.out.println(en);
        }

        Iterator it=mp.entrySet().iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        Iterator mk=mp.keySet().iterator();
        while (mk.hasNext())
        {
            System.out.println(mk.next());
        }

        Iterator ip=mp.values().iterator();
        while (ip.hasNext())
        {
            System.out.println(ip.next());
        }


    }
}
