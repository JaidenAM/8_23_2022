import java.util.Scanner;


public class ProcessName {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        // your code goes here
        System.out.print("Enter your First name: ");
        String fName;
        fName = sc.nextLine();

        System.out.print("Enter your Last name: ");
        String lName;
        lName = sc.nextLine();

        lName = lName.concat(", " + fName.charAt(0));

        System.out.println(lName);
    }
}
