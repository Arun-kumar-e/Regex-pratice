import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0  ;

        if (n>0) {
        while(n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if(temp == rev) {
            System.out.println("Pallindrome Number");
        } else {
            System.out.println("Not Pallindrome Number");
        }
    } else {
        System.out.println("Invalid Number");
    }

    sc.close();
    }
}
