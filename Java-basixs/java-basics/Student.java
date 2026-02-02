public class Student {
    private String name;
    private int roll;
    private String course;

    // Constructor
    public Student(String name, int roll, String course) {
        this.name = name;
        this.roll = roll;
        this.course = course;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for roll
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // Behavior method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course);
    }
}