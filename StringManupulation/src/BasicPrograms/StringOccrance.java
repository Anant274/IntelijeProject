
package BasicPrograms;
public class StringOccrance {
    public static void main(String []arg)
    {
        String name="makalavda";

        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='a')
            {
                count++;
            }

        } System.out.println(count);
    }
}
