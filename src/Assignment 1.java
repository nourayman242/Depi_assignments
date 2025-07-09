import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Create a Java program that takes two numbers and performs:
        //Addition
        //Subtraction
        //Multiplication
        //Division

        System.out.println("Enter number 1 and number 2");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        System.out.println("Division: "+ (num1/num2));

// ***************************************************************************
//        Read a sentence from the user and:
//                Convert to uppercase
//                Show how many characters it contains
//                Show the first character

        String line=input.nextLine();
        System.out.println("Uppercase: "+ line.toUpperCase());
        System.out.println("Length: "+ line.length());
        System.out.println("First Character: "+ line.charAt(0));

//**********************************************************************************
        //Task : Check Voting Eligibility

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your nationality: ");
        String nationality = input.next();

        if(age>= 18 && nationality.equals("Egyptian")){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");}

//*******************************************************************************8
            // Task:
            //Write a Java program that:
            //Asks the user to enter a number.
            //If the number is even, print: "Even number"
            //Else, print: "Odd number"

        System.out.println("Please Enter a number: ");
        int x= input.nextInt();
        if(x%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }


        }
    }
