 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a Student? (True/False) ");
        Boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is... " + age);
        System.out.println("Your gpa is: " + gpa);

        System.out.print("Congrats, " + name + " you are " + age + " and now you are learning Java Language\n");
        System.out.println("You are one step closer to your goal");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent);
        scanner.close();

    }
}

