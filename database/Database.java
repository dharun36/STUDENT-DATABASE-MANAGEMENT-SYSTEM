package database;

import java.util.ArrayList;

public class Database {
    protected ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, int age, int mark) {
        try {
            Student student = new Student(id, name, age, mark);
            students.add(student);
            System.out.println("Student added successfully.");
        }catch (Exception e) {
            System.out.println("Error adding student: ");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                student.displayInfo();
            }
        }
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}
