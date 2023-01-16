import java.util.Scanner;

class authenticator {

    static Database usersDBase = new Database();
    static Scanner sc = new Scanner(System.in);

    static String username;
    static String password;

    static boolean verify(int choice) {

        if (choice == 3) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            System.out.print("Enter Password:");
            String password = sc.nextLine();

            usersDBase.userDetailsMap.put(username, password);
            System.out.println("from choice 3");
            return true;
        } else {
            if (choice == 1) {
                System.out.print("Enter Username: ");
                String username = sc.nextLine();
                System.out.print("Enter Password:");
                String password = sc.nextLine();

                if (username.equals("admin") && password.equals("admin"))
                {
                    System.out.println("from choice 1 if true");
                    return true;
                }
                else {
                    System.out.println("------Incorrect Credentials------");
                    return false;
                }
            }

            if (choice == 2) {
                System.out.print("Enter Username: ");
                String username = sc.nextLine();
                System.out.print("Enter Password:");
                String password = sc.nextLine();

                if (usersDBase.userDetailsMap.containsKey(username)) {
                    if (usersDBase.userDetailsMap.get(username).equals(password)){
                        System.out.println("from choice 2 if true");
                        return true;
                    }
                    else {
                        System.out.println("------Incorrect Credentials------");
                        return false;
                    }
                }
                else{
                    System.out.println("-------Incorrect Credentials-------");
                    return false;
                }
            }
            return false;
        }
    }
}
