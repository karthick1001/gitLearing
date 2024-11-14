package Numbers;

public class SumOfDigits {
    public static void main(String[] args) {
        int a = 12345585;
        int temp = 0;
        while(a!=0)
        {
            temp = temp + a % 10;
            a = a/10;
        }
        System.out.println(temp);
    }
}
