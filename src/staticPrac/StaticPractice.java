package staticPrac;

import javax.swing.*;
import java.util.ArrayList;

public class StaticPractice
{
    public static void main(String[] args) {
        int stop = 1;
        boolean keepRunning= true;
        ArrayList<Student> list = new ArrayList<>();

        while (keepRunning){

            String firsName = JOptionPane.showInputDialog("First Name");
            String lastName = JOptionPane.showInputDialog("Last Name");
            String className = JOptionPane.showInputDialog("Class Name");
            String collegeName = JOptionPane.showInputDialog("College Name");

            stop = Integer.parseInt(JOptionPane.showInputDialog("Stop? \n1: Yes\n2 No"));

            Student s = new Student(firsName,lastName,className,collegeName);
            list.add(s);
            System.out.println("********************************************");

            for (Student current : list) {
                Student.printName(current);
            }
            if (stop==1)
            {
                keepRunning=false;
            }

        }

    }
}

class Student{

    private String firstName;
    private String lastName;
    private static String className;
    private static String collegeName;

    Student(String fName, String lName, String csName, String clName)
    {
        firstName = fName;
        lastName = lName;
        className = csName;
        collegeName = clName;
    }

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Student.className = className;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void printName(Student s){
        System.out.println(s.firstName);
        System.out.println(s.lastName);
        System.out.println(className);
        System.out.println(collegeName);
    }
}