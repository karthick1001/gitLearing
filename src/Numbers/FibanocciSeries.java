package Numbers;

public class FibanocciSeries {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.print(" The Fibanocci series is " + a + " " + b);

        int c;
        for(int i =1; i<=8;i++)
        {
            c= a+b;
            System.out.print(" " + c + " ");
            a = b;
            b = c;
        }
    }
}
