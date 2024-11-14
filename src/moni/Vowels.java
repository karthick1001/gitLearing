package moni;

public class Vowels {
    public static void main(String[] args) {
        String str="Hello World!";
        str=str.toLowerCase();
       char[] strChar= str.toCharArray();
       int count=0;
       for(char ch:strChar)
       {
           if ((ch=='a') || (ch=='e') ||(ch=='i')|| (ch=='o')||(ch=='u')) {
               count++;
           }

       }
        System.out.println("count "+count);
    }
}
