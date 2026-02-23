package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java program to demonstrate composition using a 'has-a' relationship.
 *
 * @author a.nyanjui
 */
public class Student
{

    private final String name;
    Course course;

    public Student(String name)
    {
        this.name = name;
        this.course = new Course();
        this.course.setScore(88);
        this.course.setTitle("Python Programming");
    }
    
    public static void main(String[] args)
    {
        // Instantiate a student object and display its details
        Student s1 = new Student("John Kamau Ndemethiano");
        System.out.println("Student Details:\nName: " + s1.name + "\nCourse "
          + "Title: " + s1.course.getTitle() + "\nScore: " + s1.course.getScore());
    }
}
