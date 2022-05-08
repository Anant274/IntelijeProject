package BasicPrograms;

import java.sql.SQLOutput;
import java.util.Arrays;


public class RemoveDuplicate {
    public static void main(String []arg)
    {
        int arr[]=new int[]{1,2,3,2,3};
        int arrr[];
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                  count++;
                }
                System.out.println("total comman element"+count);
                System.out.println(arr[i]);
            }
            }
        }

    }
