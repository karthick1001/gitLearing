package StringPrograms;

import com.sun.tools.javac.Main;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase();
        String revStr = "";

        //Method - 1 using Char Array;
        char[] ch = str.toCharArray();
        int a = ch.length;
        System.out.println(a);
        for(int i = a-1; i>=0; i--)
        {
            revStr = revStr + ch[i];
        }
        if(str.equals(revStr))
        {
            System.out.println(str + " is Palindrome.");
        }
        else
        {
            System.out.println(str + " is not a Palindrome.");
        }

    }
}
