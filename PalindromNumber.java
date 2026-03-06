import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int rev = 0;
        int original;
        int digit;
 
         original=num;

        for(; num != 0 ; num /= 10  )
        {
            digit = num % 10;
            rev = rev * 10 + digit;
        }

        if(rev == original)
        {
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");

        }

    }
}
