
public class Student {
    private double gpa;
    private String name;
    private int id;

    public Student(double gpa, String name, int id) {
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}