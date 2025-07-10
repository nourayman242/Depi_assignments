import java.util.ArrayList;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Ask the user to enter a password. Repeat until the correct one is entered.
        String correct_password="assignment2";


        System.out.println("Please Enter your password: ");
        for(int i=0;i<3;i++){

            String password=input.next(); // I used next because we cant add spaces to the password
            if(password.equals(correct_password)){
                System.out.println("Correct Password!");
                break;
            }
            else {
                System.out.println("Wrong password please renter: ");
                continue;}
        }
        //********************************************************************************************
        //Print numbers 1 to 10 using a loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //Use if to check if a number is even or odd
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println(number + " is an even number");
        }
        else{
            System.out.println(number + " is an odd number");
        }
        //Use switch to display the name of the day (1–7)
        System.out.println("Enter a number (1-7): ");
        int day=input.nextInt();
        switch (day){
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
            default:
                System.out.println("Invalid");
        }
        //Print Multiplication Table (1 to 10) for
        for(int i=1;i<=10;i++){
            System.out.println(i + " x 10 = "+ (i*10));
        }
        //Count Digits in a Number while
        System.out.println("Please Enter a number: ");
        long number1 = input.nextLong();
        int count=0;
        if(number1==0){
            count=1;
        }
        else{
            while (number1!=0){
                number1=number1/10;
                count++;
            }
        }
        System.out.println("the number of digits is "+count);
        //Reverse a Number while
        System.out.println("Please Enter a number: ");
        int x= input.nextInt();
        int reversed=0;
        while (x!=0){
            int digit=x%10;
            reversed= (reversed*10) +digit;
            x=x/10;
        }
        System.out.println(reversed);

        //***************************************************************************************
        //Create a Java program with the following features:
        //1.The program asks the user to enter the number of students.
        //2.For each student, the program should:
        //Ask for the student's name
        //Ask for three exam scores (double)
        //Calculate the average using a method
        //Use another method to determine the grade:
        //A: 85 or higher
        //B: 70–84
        //C: 50–69
        //F: below 50
        //Display the student’s name, average, and grade

        System.out.println("Enter the number of students: ");
        int noOfStudents = input.nextInt();

        for(int i=0;i<noOfStudents;i++){
            input.nextLine();
            System.out.println("Enter student name: ");
            String name= input.nextLine();
            System.out.println("Enter three scores: ");
            double grades[]= new double[3];
            for (int j=0;j<3;j++){
                grades[j]= input.nextDouble();
            }
            double stAverage=calcAvg(grades);
            char grade=clacGrade(stAverage);
            System.out.println("Name: "+name+" ,Average: "+ stAverage+" ,Grade: "+grade);
        }

    }
    public static double calcAvg(double[] scores){
        double total=0;
        for(int i=0;i<3;i++){
            total+=scores[i];
        }
        return total/ scores.length;
    }
    public static char clacGrade(double avg){
        int average=(int) avg;
        if (average >= 85) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
