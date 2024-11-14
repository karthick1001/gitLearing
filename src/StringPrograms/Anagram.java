package StringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 =str2.toCharArray();

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        if(Arrays.equals(charStr1, charStr2))
        {
            System.out.println("The Given String is Anagram");
        }
        else {
            System.out.println("The Given String is not Anagram");
        }

    }

}
