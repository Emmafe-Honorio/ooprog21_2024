import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input String: ");
        String palin = s.nextLine();
        String reversed = new StringBuilder(palin).reverse().toString();

        if(palin.equalsIgnoreCase(reversed)){
       System.out.println("This is a palindrome.");
    }else{
        System.out.println("This is not a palindrome.");
    }
}
}
