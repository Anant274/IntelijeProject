import java.util.*;

public class Supho {
    public static void main(String[] args) {
       Eupho eu=new Eupho(1,"anant");
        Eupho eu1=new Eupho(1,"anant");

        System.out.println(eu==eu1);
        System.out.println(eu.equals(eu1));

        List li=new ArrayList<>();
        li.add(eu);
        li.add(eu1);

        Iterator itr= li.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
