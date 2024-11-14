package StringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "karthick";
        String revStr = "";

        //Method - 1 using Char Array;
        char[] ch = str.toCharArray();
        int a = ch.length;
        for(int i = a-1; i>=0; i--)
        {
            revStr = revStr + ch[i];
        }
        System.out.println("Using Char Array Method " + revStr);


        //Method 2 using stringbuffer
        StringBuffer strBuff = new StringBuffer(str);
        System.out.println("Using StringBuffer Class " + strBuff.reverse());
    }
}
