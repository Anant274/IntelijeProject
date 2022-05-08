package BasicPrograms;

public class InstanceOfClass {
    public void message()
    {
        System.out.println("this is instance of code");
    }

    class second{
       public static void main(String []arg)
       {
           try {
              Class c=Class.forName("BasicPrograms.InstanceOfClass");
              InstanceOfClass s=(InstanceOfClass) c.newInstance();
              s.message();
           }catch (Exception e)
           {
               System.out.println("class not found"+e);
           }
       }
    }




}
