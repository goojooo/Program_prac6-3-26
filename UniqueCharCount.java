import java.util.Scanner;

public class UniqueCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int count = 0;

        for(int i = 0 ; i < str.length(); i++)
        {
            if(str.indexOf(str.charAt(i)) == i)
            {
                count++;
            }
        }
        System.out.println("Unique charecter count is : " + count);
    }
}
