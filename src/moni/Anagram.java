package moni;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str="Vile";
        String str2="evil";
        str=str.toLowerCase();
        str2=str2.toLowerCase();
 char[] char1=str.toCharArray();
 char[] char2=str2.toCharArray();
       Arrays.sort(char1) ;
        Arrays.sort(char2);
if(Arrays.equals(char1,char2))
{
    System.out.println("Anagram");
}
else{
    System.out.println("Not a Anagram");
}

    }
}
