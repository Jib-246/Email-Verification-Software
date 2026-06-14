import java.util.Scanner;

class EmailVerification{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email:");
        String email = scanner.nextLine();
        if(email.toLowerCase().endsWith("@genericcorporateemail.com")){
            System.out.print("Is your role this/that/those");
            String role = scanner.nextLine();
            System.out.println("User:" + role);
            if(role.equalsIgnoreCase("this")){
                
                System.out.println("Welcome to the system");
                System.out.println("Would you like to view the database information? (yes/no)");
        String viewDatabase = scanner.nextLine();
        if(viewDatabase.equalsIgnoreCase("yes")){
            System.out.println("Database information: @genericcorporateemail.com");
        } else {
            System.out.println("Thank you for using the system.");
        }
            } else if(role.equalsIgnoreCase("that")){
                System.out.println("Welcome to the system");
                System.out.println("Would you like to view the database information? (yes/no)");
        String viewDatabase = scanner.nextLine();
        if(viewDatabase.equalsIgnoreCase("yes")){
            System.out.println("Database information: @genericcorporateemail.com");
        } else {
            System.out.println("Thank you for using the system.");
        }
            } else if(role.equalsIgnoreCase("those")){
                System.out.println("Welcome to the system");
                System.out.println("Would you like to view the database information? (yes/no)");
        String viewDatabase = scanner.nextLine();
        if(viewDatabase.equalsIgnoreCase("yes")){
            System.out.println("Database information: @genericcorporateemail.com");
        } else {
            System.out.println("Thank you for using the system.");
        }
            } else {
                System.out.println("Invalid role");
            }
        } else {
            System.out.println("Invalid email");
        }
        
        scanner.close();
    }
}



