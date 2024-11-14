package Numbers;

public class Factorial {

    public static void main(String[] args) {

        int factorialNumber = 3;
        int temp = 1;

        for(int i =1; i<=factorialNumber; i++)
        {
            temp = temp * i;
        }
        System.out.println("Factorial of the given number is " + temp);
    }
}
