package StringPrograms;

public class Vowels {
    public static void main(String[] args) {
        String str = "kArthick is good java programmer";
        int counter = 0;
        str = str.toLowerCase();
        char[] charstr = str.toCharArray();
        for(int i = 0; i<charstr.length; i++)
        {
            if(charstr[i]=='a' || charstr[i]=='e' || charstr[i]=='i' || charstr[i]=='o' || charstr[i]=='u')
            {
                counter++;
            }
        }
        System.out.println("There are " + counter + " vowels in the given string");
    }
}
