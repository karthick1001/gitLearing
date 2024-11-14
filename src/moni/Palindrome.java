package moni;

public class Palindrome {
    public static void main(String[] args) {

//        int counter = 0;
//        char[] charArray = str.toCharArray();
//        for(int i =0; i<charArray.length;i++)
//        {
//            if(charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u')
//            {
//                counter++;
//            }
//        }
//        System.out.println("The vowels count is : " + counter);

        String str = "madam";
        str = str.toLowerCase();
        String  revStr="";
        char[] charAr= str.toCharArray();
        for(int i=charAr.length-1; i>=0;i--)
        {
            //System.out.println(charAr[i]);
            revStr=revStr + charAr[i];

        }
        System.out.println("RevString is "+revStr);
        if(str.equals(revStr))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }




    }

}
