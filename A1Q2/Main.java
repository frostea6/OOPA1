// This program takes user input of grades and checks with if statements to see
//where the grade falls in order to give an output consequence.

import java.util.Scanner; // import scanner for user input
public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------");
        System.out.println("         Student Performance Evaluation");
        System.out.println("----------------------------------------------------");
        // welcome message

        Scanner sc = new Scanner(System.in);
        // for user input calling

        System.out.print("How much did the student score?");
        double grade = sc.nextDouble();
        // double as grades because a student could get 45.5 not always int

        if (grade >= 50) // if above 50 passing
        {
            System.out.print("The student has passed and will not be penalized!");
        } else if ( grade > 45 && grade < 50){ // between 45 & 50 do extra assign
            System.out.print("The student has performed poorly and must submit an extra assignment!");
        }else if ( grade > 40 && grade < 46){ // btwn 40 & 46 write extra exam
            System.out.print("The student has performed poorly and must write an extra exam!");
        }else if ( grade > 35 && grade < 41){ // btwn 35 & 41 repeat
            System.out.println("The student has performed poorly and must repeat the course!");
        }else if (grade < 36){ //lower than 36 get F and check if another course has F
            System.out.println("The student has performed poorly and has received an F grade!");
            System.out.println("Does the student have another F grade from any other course?");
            String hasF = sc.next(); // get user input
            sc.close();// closing scanner

            // user can but yes or y so that its a yes that they got another f in a course
            if (hasF.equalsIgnoreCase("yes") || hasF.equalsIgnoreCase("y")) {
                System.out.println("Unfortunately, the student will not be able to continue the program!");
            } else { // if user doesnt put y or yes then they just receive F
                System.out.println("The student has performed poorly and has received an F grade!");
            }
        }
        System.out.println("\nThank you for using SPE Program, have a nice day.");
        // closing message

    }
}