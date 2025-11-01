package service;

import model.Student;
import exceptions.StudentNotFoundException;
import threads.Loader;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        try {
            if (student.getMarks() < 0 || student.getMarks() > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100!");
            }

            if (studentMap.containsKey(student.getRollNo())) {
                throw new IllegalArgumentException("Duplicate Roll Number detected!");
            }

            Thread loader = new Thread(new Loader("Loading"));
            loader.start();
            loader.join(); // Wait for thread to finish

            studentMap.put(student.getRollNo(), student);
            System.out.println("Student added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        } finally {
            System.out.println("Add operation completed.\n");
        }
    }

    public void viewStudent(Integer rollNo) {
        try {
            if (!studentMap.containsKey(rollNo)) {
                throw new StudentNotFoundException("Student not found with Roll No: " + rollNo);
            }
            studentMap.get(rollNo).displayInfo();
        } catch (StudentNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("View operation completed.\n");
        }
    }
}
