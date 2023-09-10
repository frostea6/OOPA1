import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("        CineFlixStream's Package Calculator");
        System.out.println("----------------------------------------------------");
        // welcome message

        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many shows a week do you watch (whole number please):");
        int shows = sc.nextInt();
        int showsMonth = shows * 4;
        // from weeks to per month

        System.out.print("How many movies a month do you watch (whole number please);");
        int movies = sc.nextInt();
        //movies per month


        //per views cost calculation
        double costShows = (shows * 0.99) * 4; // per month cost show n movies / per view
        double costMovies = (movies *3.99) ;
        double totalPrice = costShows + costMovies;

        System.out.println("The cost of Pay;per-view would be: $" + totalPrice + "/month");
        //output price per view

        final double limited = 15.95;
        final double unlimited = 25.95;
        //constants

        // declaring and intiliazing to use if the if statements dont chanage their values
        double extraCostShows =0;
        double extraCostMovies = 0;
        double totalLimited = 0;

        if (totalPrice < limited ){  // cost per view is less than limited then just stay with the package
            System.out.println("\nThank you for using CineFlixStream's calculator program. Happy watching :-)!)");
        }else if (totalPrice >= limited || totalPrice < unlimited){ // cost per view more than limited n less than unlimited
            if (showsMonth > 20) // check extra
               extraCostShows = (showsMonth -20) * 1.99; //price calculate

           if  (movies > 2){ //check extra
                extraCostMovies = (movies - 2) * 3.99; // calculate price
            }
            totalLimited =  (limited + extraCostShows + extraCostMovies);
            System.out.println ("Based on your viewing, the cost of the Limited package would be: $" +
                    totalLimited +"/month");
            // so total limited is constant price plus extra costs per views


        if (totalLimited <= limited){ // stay with limited if within bound
            System.out.println("**We recommend getting the Limited package.**");
            double saveLimited = totalPrice - totalLimited;

            System.out.println("You would save $" + saveLimited +" from pay-per-view.");
            //how much saved from change package

        }
        else if (totalLimited > limited){ // if total exceeds limited package switch
            System.out.println("**We recommend you get the Unlimited package.**");
            double saveFromPer = totalPrice - unlimited;
            double saveFromLimit = totalLimited - unlimited;
            System.out.println("You would save $" + saveFromPer + " from pay-per-view.");
            System.out.println("You would save $" + saveFromLimit + "from the limited package and $" +
            saveFromPer + " from pay-per-view.");
            // how much saved from switching

        }

        }
        System.out.println("\nThank you for using CineFlixStream's package calculator program. Happy Watching :-)!");
        // closing message
    }

}