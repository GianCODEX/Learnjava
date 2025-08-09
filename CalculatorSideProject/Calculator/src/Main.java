import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int operator, n1, n2;
        System.out.println("1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide\n");
        System.out.println("Enter your operator: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter your first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        n2 = sc.nextInt();

        int results = 0;
        switch (operator){
            case 1:
                results = n1 + n2;
                break;

            case 2:
                results = n1 - n2;
                break;

            case 3:
                results = n1 * n2;
                break;

            case 4:
                results = n1 / n2;
                break;

            default:
                System.out.println("The operator you entered is invalid");
                break;

        }
        System.out.println("Results: "+ results);
    }
}