/*
    This class provides the fuctionality to finding, who is winner in rock-paper-scissor game
 */
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Player 1, enter your choice (rock, paper, scissors): ");
            String player1 = scanner.nextLine().toLowerCase();

            System.out.println("Player 2, enter your choice (rock, paper, scissors): ");
            String player2 = scanner.nextLine().toLowerCase();

            findingWinner(player1, player2);

            System.out.println("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                playAgain=false;
            }
        }
    }

private static void findingWinner(String player1,String player2) {
    if (player1.equals("rock") && player2.equals("scissor")) {
        System.out.println("player1 is Winner");
    } else if (player1.equals("scissor") && player2.equals("paper")) {
        System.out.println("player1 is Winner");
    } else if (player1.equals("paper") && player2.equals("rock")) {
        System.out.println("player1 is Winner");
    }
    else if(player1.equals(player2)){
        System.out.println("Tie match");
    }
    else {
        System.out.println("player2 is Winner");
    }
    }
}

// Important code guidelines
//- Naming of files ✔
//	- (represent the purpose of the program)
//	- SHOULD NOT be a generic name ✔
//	- The name of the file should be readable for developers ✔
//	- For example:
//		- SeniorCitizenCalculator (CalculatorSeniorCitizen)
//	- No spelling Mistakes ✔
//	- Pascal case while naming ✔
//	- Use Noun first and if required use Verb later, but always first noun.


//- Naming of classes
//	- (represent the purpose of the program) ✔
//	- SHOULD NOT be a generic name ✔
//	- The name of the class should be readable for developers ✔
//	- For example:
//		- SeniorCitizenCalculator (this is not readble -> CalculatorSeniorCitizen)
//	- No spelling Mistakes ✔
//	- Pascal case while naming ✔
//	- Use Noun first and if required use Verb later, but always first noun. ✔

//	- Class level comments using /* */ ✔

//- Naming of methods
//	- - (represent the purpose of the program) ✔
//        - SHOULD NOT be a generic name ✔
//	- The name of the method should be readable for developers ✔
// 	- For methods that do operation - Use Verb first and then the noun (operation)
// 	- calculateAge() ✔
//	- for methods that return Boolean start with isSeniorCitizen
//	- determine if the method is return or not
//		- if  void used  ✔
//		- if return a specific data type or complex type (class) then make sure return statement has the same.
//        - is the method called from inside the class
//		- private (access modifier) ✔
//        - is the method called from the same package
//        - default
//	- is the method called by a class outside the package
//        - public
//	- determine if the method is an instance method or a static method
//		- instance methods - when an operation is done with object data
//Cat myCat = new Cat(); // myCat a reference to a Cat() object
//Cat yourCat = new Cat(); // another
//getColourOfCat();

//		- static method - when an operation is only doing some calculation
//		and not involving instance object data ✔
//			- arithmetic operation
//			- Logical operation
//			- operation not related to instance object
//public static isSeniorCitizen() {
//    if age > 60
//}
//call within the class/ outside with the need to create the object reference.
//
//
//
//
//-  Naming of variables
//    - global variables (instance members, fields)
//    - Method arguments / parameters ✔
//    - Local variables. ✔

