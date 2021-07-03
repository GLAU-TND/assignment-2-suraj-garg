/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    private int rollNumber;
    private String name;
    private int backlogCounter;
    private int appearingCounter;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(int rollNumber, String name, int backlogCounter, int appearingCounter) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.backlogCounter = backlogCounter;
        this.appearingCounter = appearingCounter;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacklogCounter() {
        return backlogCounter;
    }

    public void setBacklogCounter(int backlogCounter) {
        this.backlogCounter = backlogCounter;
    }

    public int getAppearingCounter() {
        return appearingCounter;
    }

    public void setAppearingCounter(int appearingCounter) {
        this.appearingCounter = appearingCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", Name=' " + this.name + '\'' +
                '}';
    }

    public String toStrings() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                " , Name=' " + this.name + '\'' +
                ", backlogCounter=" + backlogCounter +
                ", appearingCounter=" + appearingCounter +
                '}';
    }
}
