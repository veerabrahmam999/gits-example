import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year=scanner.nextInt();
        boolean result=LeapYearCalculator.isLeapYear(year);
        if(result==true){
            System.out.println(year+" is Leap Year");
        }
        else {
            System.out.println(year+" Not a Leap Year");
        }

    }
    private static boolean isLeapYear(int year){
        if((year%400==0 && year%100!=0) || (year%4==0)){
                return true;
        }
        return false;
    }

}

// Important code guidelines
//- Naming of files
//	- (represent the purpose of the program)
//	- SHOULD NOT be a generic name
//	- The name of the file should be readable for developers
//	- For example:
//		- SeniorCitizenCalculator (CalculatorSeniorCitizen)
//	- No spelling Mistakes
//	- Pascal case while naming
//	- Use Noun first and if required use Verb later, but always first noun.
//- Naming of classes
//	- (represent the purpose of the program)
//	- SHOULD NOT be a generic name
//	- The name of the class should be readable for developers
//	- For example:
//		- SeniorCitizenCalculator (this is not readble -> CalculatorSeniorCitizen)
//	- No spelling Mistakes
//	- Pascal case while naming
//	- Use Noun first and if required use Verb later, but always first noun.
//	- Class level comments using /* */
//- Naming of methods
//	- - (represent the purpose of the program)
//        - SHOULD NOT be a generic name
//	- The name of the method should be readable for developers
// 	- For methods that do operation - Use Verb first and then the noun (operation) - calculateAge()
//	- for methods that return Boolean start with isSeniorCitizen
//	- determine if the method is return or not
//		- if not use void
//		- if return a specific data type or complex type (class) then make sure return statement has 			the same.
//        - is the method called from inside the class
//		- private (access modifier)
//        - is the method called from the same package
//        - default
//	- is the method called by a class outside the package
//        - public
//	- determine if the method is a instance method or a static method
//		- instance methods - when an operation is done with object data
//Cat myCat = new Cat(); // myCat a reference to a Cat() object
//Cat yourCat = new Cat(); // another
//getColourOfCat();
//		- static method - when an operation is only doing some calculation and not involving instance 			object data
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
//- Naming of variables
//    - global variables (instance members, fields)
//    - Method arguments / parameters
//    - Local variables.

