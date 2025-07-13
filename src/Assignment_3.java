import java.util.Scanner;
import java.util.Arrays;
public class Assignment_3 {

    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        /*Ask the user to enter the number of students.

Uses an array to store the marks (integer values) of each student.

Calculates:

The average mark

The highest and lowest marks

Prints all student marks with their index.

 Count how many students passed (mark ≥ 50) and how many failed.
        */
        System.out.println("Enter the number of students: ");

int noOfStudents = input.nextInt();
int [] students = new int[noOfStudents];
double grades[]= new double[noOfStudents];

        for(int i=0;i<noOfStudents;i++){

            System.out.println("Enter the score of student "+ i +" :");
            grades[i]= input.nextDouble();
        }


        double total=0;
            for(int j=0;j<noOfStudents;j++){
                total+=grades[j];
            }
            double average= total/students.length;

            double min=grades[0],max=grades[0];

        for(int j=1;j<noOfStudents;j++){
            if(grades[j]> max){
                max=grades[j];
            }
            if (grades[j]<min){
                min=grades[j];
            }
        }
        for(int i=0;i<noOfStudents;i++){
            System.out.println("Student["+i+"]: "+grades[i]);
        }
        int passed=0,failed=0;
        for (int i=0;i<noOfStudents;i++){
            if(grades[i]>=50){
                passed++;
            }
            else{failed++;}
        }
        System.out.println("Average mark: "+average);
        System.out.println("highest mark: "+max);
        System.out.println("Lowest mark: "+min);
        System.out.println("Number of Students that Passed: "+passed+" Number of Failed Students: "+failed);

    }
}
