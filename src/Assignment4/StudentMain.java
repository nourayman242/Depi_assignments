package Assignment4;

public class StudentMain {
    public static void main(String[] args) {

        Student student1=new Student("Ali",19,2.7);
        student1.displayInfo();
        student1.study();
        System.out.println(student1.getName()+" Gpa after studying "+student1.getGpa());


        Student student2=new Student("Mona",16,4.0);
        student2.displayInfo();
        student2.study();
        System.out.println(student2.getName()+" Gpa after studying "+student2.getGpa());
    }
}
