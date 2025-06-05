package Accessmodifier.Default;

class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
    }
    void display(){
        System.out.println("Student Name:"+name+" Student age:"+age+" Student DOB:"+DOB);
    }
}
public class Date {
    public static void main(String[] args) {
        Student s1= new Student("Zaynab",20,"07-02-2005");
        s1.display();
    }
}
//student_course.java
class Course{
    String course;
    int sem;
    float marks;

    Course(String course, int sem, float marks){
        this.course=course;
        this.sem=sem;
        this.marks=marks;
    }
    void displayCourse(){
        System.out.println("Course:"+course+" sem:"+sem+" Marks:"+marks);
    }
}
public class student_marks {
    public static void main(String[] args) {
        Course c = new Course("Java",4,40);
        Course c1 = new Course("Big Data",4,40);
        Course c2 = new Course("Devops",4,40);
        c.displayCourse();
        c1.displayCourse();
        c2.displayCourse();
    }
}