package Numbers;

public class SwappingOfTwoNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Method 1 : using third varaiable easy method
        int c =a;
        a=b;
        b=c;

        System.out.println("Third variable method:  The value of a is :" + a + " and the value of b is " + b);

        //Method 2: using + operator
         a = 10;
         b = 20;

         a = a+b;
         b = a-b;
         a = a-b;

        System.out.println("+ operator method:  The value of a is :" + a + " and the value of b is " + b);
    }
}
