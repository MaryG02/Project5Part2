//1. Ask to print y to begin
//2. Welcome the user
//3. Run the Recommender block
//4. Ask if user wants to repeat the program
//5. If user typed Y go to #2
//6. Else, finish the program

// Recommender block
//1. Ask user to input name, favourite genre and age
//2. Based on answers recommend the series
//3. If data was not input correctly, output: Please try again and enter data correctly
import java.util.Scanner;
public class part2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        print("Print y to begin");
        while (YesOrNo(scan) == true) {
            print("Hello! This program will help you find series to watch. Please enter your name");
            String name = getUserString(scan);
            print("Brilliant! Next, choose and enter your favourite series genre\n (fantasy, thriller, science fiction)");
            String gen = getUserString(scan);
            print("And the last: enter your age");
            int age = Integer.parseInt(getUserString(scan));
            String fantasy = "fantasy";
            String thriller = "thriller";
            String sf = "science fiction";
            if (age <= 13 && gen.equals(fantasy))
                print("Your recommended series is Supergirl");
            else if (age <= 17 && gen.equals(fantasy))
                print("Your recommended series is Stranger Things");
            else if (age >= 18 && gen.equals(fantasy))
                print("Your recommended series is The Umbrella academy");
            else if (age <= 13 && gen.equals(thriller))
                print("Your recommended series is The Owl House");
            else if (age <= 17 && gen.equals(thriller))
                print("Your recommended series is Killing Eve");
            else if (age >= 18 && gen.equals(thriller))
                print("Your recommended series is The Haunting of Bly Manor");
            else if (age <= 13 && gen.equals(sf))
                print("Your recommended series is The Mandalorian");
            else if (age <= 17 && gen.equals(sf))
                print("Your recommended series is The 100");
            else if (age >= 18 && gen.equals(sf))
                print("Your recommended series is Orphan Black");
            else
                print("Please try again and enter data correctly");
            print("If you want to repeat, type y, if you want to leave type anything ");
        }
    }
    // Method to print strings
    public static void print(String toPrint) {
        System.out.println(toPrint);
    }
    //Method for yes or no question
    public static boolean YesOrNo(Scanner scan) {
        String userInput = scan.nextLine().trim().toLowerCase();

        if (userInput.equals("y")) {
            return true;
        }
        else
            return false;

    }
    // method to get users input
    public static String getUserString(Scanner scan) {
        ;
        String userInput = scan.nextLine().trim().toLowerCase();
        return userInput;
    }
}


