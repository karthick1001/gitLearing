package Numbers;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        int a = 15, b = 11, c = 8;

        if(a>b && a>c)
        {
            System.out.println("a is greater where a value is :" + a);
        } else if (b>a && b>c) {

            System.out.println("b is greater where B value is :" + b);
        }
        else
        {
            System.out.println("c is greater where c value is :" + c);
        }
    }
}
