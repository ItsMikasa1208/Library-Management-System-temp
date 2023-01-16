import java.util.Scanner;

public class adminFunctions {

    static Database DBase = new Database();

    static void functions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("1. View Users");
        System.out.println("2. View Book Collection");
        System.out.println("3. Book Borrow Requests");
        System.out.println("4. Book Returned");
        System.out.println("5. Logout");
        System.out.println("********************");
        System.out.println("Enter choice");

        int choice = sc.nextInt();

        while(choice!=5){

            switch (choice) {
                case 1 -> DBase.usersDisplay();
                case 2 -> DBase.booksDisplay();
                //case 3 ->
                //case 4 ->
                //case 5 ->
            }

        }


    }
}
