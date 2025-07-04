import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        String line=input.nextLine();
//        System.out.println("Uppercase: "+ line.toUpperCase());
//        System.out.println("Length: "+ line.length());
//        System.out.println("First Character: "+ line.charAt(0));

//        System.out.println("Enter number 1 and number 2");
//        double num1 = input.nextDouble();
//        double num2 = input.nextDouble();
//        System.out.println("Addition: "+ (num1+num2));
//        System.out.println("Subtraction: "+ (num1-num2));
//        System.out.println("Multiplication: "+ (num1*num2));
//        System.out.println("Division: "+ (num1/num2));

        System.out.println("Please enter your name: ");
        String name= input.nextLine();
        System.out.println("Please enter your age: ");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("Please enter your favourite programming language: ");
        String lang= input.nextLine();

        System.out.println("Hello! My name is "+name);
        System.out.println("I am "+age+" years old, which is "+(age*12)+" months old");
        System.out.println("May favourite programming language is "+ lang);
        System.out.println("Next year i will be "+ (++age) +" years old");

//        int x=input.nextInt();
//
//        String y=input.next();
//
//        System.out.println(x+y);

//        System.out.println(" Enter x");
//        int x= input.nextInt();
//        System.out.println(" Enter y");
//        int y= input.nextInt();
//        System.out.println("Are x and y even? "+ ((x%2==0)&&(y%2==0)));
//        //System.out.println("Is x even? "+ (x%2==0));
//        //System.out.println("Is y even? "+ (y%2==0));

        }
    }
