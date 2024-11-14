package Numbers;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345;
        int revNumber = 0;
        while(number!=0)
        {
            revNumber = revNumber*10 + number%10;
            number = number/10;
        }
        System.out.println("The reversed number is " + revNumber );



    }
}
