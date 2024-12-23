import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = 2000;

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {  //100!=0 because every century not a leap  year 
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
