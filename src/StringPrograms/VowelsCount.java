package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class VowelsCount {
    public static void main(String[] args) {
        String str = "Bank of America";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for(char c : charArray)
        {
            if(hashmap.containsKey(c))
            {
                hashmap.put(c, hashmap.get(c)+1);
            }
            else
            {
                hashmap.put(c, 1);
            }
        }
        int vowelsCount = 0;
        for(Map.Entry<Character, Integer> entry : hashmap.entrySet())
        {
            if(entry.getKey()=='a')
            {
                vowelsCount = vowelsCount + entry.getValue();
                System.out.println("The 'a' count in the given string is :" + entry.getValue());
            }

            if(entry.getKey()=='e')
            {
                vowelsCount = vowelsCount + entry.getValue();
                System.out.println("The 'e' count in the given string is :" + entry.getValue());
            }

            if(entry.getKey()=='i')
            {
                vowelsCount = vowelsCount + entry.getValue();
                System.out.println("The 'i' count in the given string is :" + entry.getValue());
            }

            if(entry.getKey()=='o')
            {
                vowelsCount = vowelsCount + entry.getValue();
                System.out.println("The 'o' count in the given string is :" + entry.getValue());
            }

            if(entry.getKey()=='u')
            {
                vowelsCount = vowelsCount + entry.getValue();
                System.out.println("The 'u' count in the given string is :" + entry.getValue());
            }
        }

        System.out.println("The total count of vowels is : " + vowelsCount);
    }
}
