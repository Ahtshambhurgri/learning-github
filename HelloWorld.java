import java.util.Date;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java programming.");
        System.out.println("Date is "+ new Date());
        Student student1 = new Student("Alice", 20, "A");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student Grade: " + student1.getGrade());
        System.out.println("It is Working in Manual Pipeline");
    }

}
