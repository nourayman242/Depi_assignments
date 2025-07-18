package Assignment4;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("GPA: "+ gpa);
    }
    // when the student studies his gpa increeses
    public double study(){
        if(this.gpa==4.0){
            System.out.println("You're Gpa is 4.0!!");
            return this.gpa;
        }
        else {
        return this.gpa+=0.1;
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
