import java.util.*;
//only for unique username for now

    public class Main {
        public static void main(String[] args) {
            int choice = 0;
            boolean validated;

            Scanner scanner = new Scanner(System.in);

            while (choice != 4) {
                System.out.println("--------------------------");
                System.out.println("1. Admin Login");
                System.out.println("2. User Login");
                System.out.println("3. New User");
                System.out.println("4. Exit Application");
                System.out.print("Enter choice: ");
                choice = scanner.nextInt();
                System.out.println("--------------------------");

                if (choice != 4) {
                    validated = authenticator.verify(choice);
                    System.out.println("Validation done: " + validated);

                    if (choice == 1) {
                        adminFunctions.functions();
                    }
                }
            }
        }
    }
