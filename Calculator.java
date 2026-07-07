import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("       JAVA CALCULATOR");
        System.out.println("==================================");

        do {

            System.out.println("\nChoose an Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter First Number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter Second Number: ");
                double num2 = sc.nextDouble();

                double result;

                switch (choice) {

                    case 1:
                        result = num1 + num2;
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result = " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;

                    case 5:
                        result = num1 % num2;
                        System.out.println("Result = " + result);
                        break;
                }

            } else if (choice == 6) {

                System.out.println("\nThank you for using the Java Calculator!");

            } else {

                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}


			