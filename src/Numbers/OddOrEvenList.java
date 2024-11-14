package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddOrEvenList {
    public static void main(String[] args) {
        Integer[] a = {5,7,9,3,7};
        List<Integer> b = Arrays.asList(a);
        boolean flag;
        for(Integer c : b)
        {
            if(c % 2 == 0)
            {
                flag = true;
            }
        }
        if(flag = false)
        {
            System.out.println("The list contains only Odd numbers");
        }
        else
        {
            System.out.println("The list contains even number too");
        }






    }
}
