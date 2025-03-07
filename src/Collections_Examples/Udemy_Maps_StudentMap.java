package Collections_Examples;

import java.util.HashMap;
import java.util.Map;

// Udemy Assignment description: https://www.udemy.com/course/automation-testing-masterclass/learn/quiz/5817080#questions/20170312
// Udemy Assignment explanation: https://www.udemy.com/course/automation-testing-masterclass/learn/lecture/45025493#questions/20170312

public class Udemy_Maps_StudentMap {

    // Map object named "studentData". The map has String keys and Student objects as values.
    private Map<String, Student> studentData;

    // Constructor that initializes studentData with a new instance of HashMap. Allows for storing students with a unique key
    public Udemy_Maps_StudentMap() {
        studentData = new HashMap<>();
    }

    //Takes in a String key and a Student object as parameters and adds the key-value pair to the "studentData" map.
    public void addStudent(String key, Student value) {
        studentData.put(key, value);
    }

    //Takes in a String key and removes the key-value pair from the "studentData" map.
    public void removeStudent(String key) {
        studentData.remove(key);
    }

    //Takes in a String key and returns the Student object associated with that key in the "studentData" map.
    public Student getStudent(String key) {
        return studentData.get(key);
    }

    //Returns the average GPA of all the Student objects in the "studentData" map.
    public double getAverageGPA() {
        double sum = 0.0;
        for (Student student : studentData.values()) {
            sum += student.getGpa();
        }
        return sum/ studentData.size();
    }
}

class Student {
    private String name;
    private int age;
    private double gpa;

    //Student class has a constructor that takes in values for all three instance variables and sets them accordingly.
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters to be able to access them
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

}
