// This program takes user input of latitude and longitude and checks which hemisphere
//that they are in based on if the input is negative of positive (longitude and latitude)
//it also validates the user input
import java.util.Scanner; // import scanner for user input
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Hemisphere Location Generator!");
        // welcome message

        Scanner sc = new Scanner(System.in); // declare object/variable


        System.out.print("Please enter your current latitude and longitude -90 to 90:");
        int lat = sc.nextInt();
        int lon = sc.nextInt();
        // prompt user and get two int value inputs

        sc.close();
        //close scanner


        if ((lat < -90 || lat > 90) && (lon < -90 || lon > 90)) { // if both numbers are out of bound
            System.out.print("You have entered invalid latitude and longitude values!");
        } else if (lat < -90 || lat > 90) { // if wrong lat
            System.out.print("You have entered an invalid latitude value!");
        } else if (lon < -90 || lon > 90) { // if wrong lon
            System.out.print("You have entered an invalid longitude value!");

        }else { // if not out of bond then execute program

            if (lat >= 0 && lon >= 0) { // both positive

                System.out.print("You are in the Northern and Eastern hemispheres!");
            } else if (lat >= 0 && lon <= 0) { // lat pos long neg
                System.out.print("You are in the Northern and Western hemispheres!");
            } else if (lat <= 0 && lon >= 0) { // lat neg long pos
                System.out.print("You are in Southern and Eastern hemispheres!");
            } else if (lat <= 0 && lon >= 0) { // lat neg long neg
                System.out.print("You are in Southern and Western hemispheres!");
            }
        }

        System.out.println("\nThank you for using HLG, Have a great day.");
        // terminating message for all users with valid and invalid input

    }
}