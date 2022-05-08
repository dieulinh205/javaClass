package Student;

public class Student {
    private int studentCode;
    private String name;
    private double GPA;

    public Student(int studentCode, String name, double GPA) {
        this.studentCode = studentCode;
        this.name = name;
        this.GPA = GPA;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    
}


