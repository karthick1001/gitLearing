package moni;

import java.util.HashMap;
import java.util.Map;

public class Vowels_individualcount {
    public static void main(String[] args) {
        String str="Monika is a good programmer";
        str=str.toLowerCase();
        char[] strChar= str.toCharArray();

        int overAllCount=0;
        Map<Character,Integer> vowels=new HashMap<Character,Integer>() ;
        for(char ch:strChar)
        {
            if(!vowels.containsKey(ch))
            {
                vowels.put(ch,1);
            }
            else {
                vowels.put(ch,vowels.get(ch)+1);
            }


        }
        System.out.println(vowels);
       for(Map.Entry<Character,Integer> vowel:vowels.entrySet()){
           switch (vowel.getKey()){
               case 'a': System.out.println("a value is " +vowel.getValue());
                       overAllCount=overAllCount+vowel.getValue();
               break;
               case 'e': System.out.println("e value is " +vowel.getValue());
                   overAllCount=overAllCount+vowel.getValue();
                   break;
               case 'i': System.out.println("i value is " +vowel.getValue());
                   overAllCount=overAllCount+vowel.getValue();
                   break;
               case 'o': System.out.println("o value is " +vowel.getValue());
                   overAllCount=overAllCount+vowel.getValue();
                   break;
               case 'u': System.out.println("u value is " +vowel.getValue());
                   overAllCount=overAllCount+vowel.getValue();
                   break;
           }

        }
       System.out.println(overAllCount);



    }
}
