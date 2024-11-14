package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Distinct {

    public static void main(String[] args) {
        String str = "java is good java is bad but i love java";
        str = str.toLowerCase();
        char[] chArry = str.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(char c : chArry)
        {
            if(hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.get(c)+1);
            }
            else
            {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);

        for(Map.Entry<Character, Integer> entry : hashMap.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey() + " : is distinct character");
            }


        }


    }
}
