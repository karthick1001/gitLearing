package Numbers;

public class PrimeNumberOrNot {

//    2 factors
//    1. should be greater than 1
//    2. should be divisible by 1 or by itself
public static void main(String[] args) {
    int number = 4, count = 0;
    if(number>1)
    {
        for(int i =1; i<=number; i++)
        {
            if(number%i==0)
            {
                count++;
            }
        }
        if(count<3)
            System.out.println("Its  a prime number");
        else
            System.out.println("Its not a prime number");
    }
    else
        System.out.println("Its not a prime number");


}

}
