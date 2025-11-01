package model;

public class Student {
    private Integer rollNo;   // Wrapper class for int
    private String name;
    private String email;
    private String course;
    private Double marks;     // Wrapper class for double
    private String grade;

    public Student(Integer rollNo, String name, String email, String course, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "D";
    }

    public void displayInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public Integer getRollNo() { return rollNo; }
    public Double getMarks() { return marks; }
}
