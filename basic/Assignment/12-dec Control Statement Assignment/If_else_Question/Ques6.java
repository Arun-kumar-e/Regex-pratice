import java.util.Scanner;
public class Ques6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
        
    }
}