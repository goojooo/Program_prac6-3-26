import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String want to reverse : ");
        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length()-1 ; i >= 0 ; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println(rev);
        
        // if(str.equals(rev))
        // {
        //     System.out.println("Palindrom");
        // }
        // else{
        //     System.out.println("Not Palindrom");

        // }
    }
}
