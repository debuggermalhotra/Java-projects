
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        System.out.println("\t\t\t\tCALCULATOR\t\t\t\t");
        System.out.println("write add for addition");
        System.out.println("write sub for subtraction");
        System.out.println("write prod for multiplication");
        System.out.println("write div for division");
        System.out.println("write exit to exit");
        System.out.println("Enter your option:\n");
        Scanner scan = new Scanner(System.in);
        String ch = scan.nextLine();

        switch (ch) {
            case "add":


                System.out.println("Enter the 1st and 2nd integer");

                int a = scan.nextInt();
                int b = scan.nextInt();
                int sum = a + b;
                System.out.println("The sum is: ");
                System.out.print(sum);
                break;

            case "sub":

                System.out.println("Enter the 2 integers");

                int c = scan.nextInt();
                int d = scan.nextInt();
                int diff = c-d;
                System.out.println("The difference of these two integers is: ");
                System.out.print(diff);
                break;

            case "prod":
                System.out.println("Enter the 2 integers");
                int e = scan.nextInt();
                int f = scan.nextInt();
                int product = e * f;
                System.out.println("The product of these two integers is: ");
                System.out.print(product);
                break;

            case "div":
                System.out.println("Enter the two integers");
                int g = scan.nextInt();
                int h = scan.nextInt();
                int div = g / h;
                System.out.println("The result of division of these two integers is: ");
                System.out.println(div);

            case "exit":
                java.lang.System.exit(0);

            default:
                System.out.println("Wrong option entered");
        }
    }
}