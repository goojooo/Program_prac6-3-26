import java.util.Scanner;

public class PalindromString{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString() ;

        if(str.equals(rev))
        {
            System.out.println("Its Palindrome");
        } else{
            System.out.println("Its not Palindrome");

        }

     
    }
}