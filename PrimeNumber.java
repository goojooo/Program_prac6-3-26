import java.util.Scanner;

public class PrimeNumber{
    public static void main(String [] args) {
              Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;

        for(int i = 2 ; i * i <= num ; i++)
        {
            if(num % 2 == 0)
            {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ?" is Prime number..." : " is Not Prime number..."));
    }
}