import org.w3c.dom.ls.LSInput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static ArrayList<Student> listStudent = new ArrayList<>();

    public void addStudent(Student student){
        listStudent.add(student);
    }

    public void EditInf(int id, Student newStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.get(i).setName(newStudent.getName());
                listStudent.get(i).setGpa(newStudent.getGpa());
                break;
            }
        }
    }

    public void DeleteInf(int id2 ){
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id2) {
                listStudent.remove(i);
                break;
            }
        }
    }

    public void SearchInf(int id3){
        for (Student student : listStudent) {
            if (student.getId() == id3) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void printMenu(){
        System.out.println("StudentManagement System");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student by id");
        System.out.println("4. Search student by id");
        System.out.println("5. Sort student by gpa");
        System.out.println("6. Print list hoc sinh");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        StudentManagement stdMn = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            stdMn.printMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhap ten sinh vien: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap id sing vien: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap diem trung binh: ");
                    double gpa = Double.parseDouble(sc.nextLine());
                    Student student = new Student(gpa, name, id);
                    stdMn.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhap id sinh vien muon sua: ");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    System.out.println("Change ten sinh vien: ");
                    String newName = sc.nextLine();
                    System.out.println("Change diem trung binh: ");
                    double newGpa = Double.parseDouble(sc.nextLine());
                    Student updatedStudent = new Student(newGpa, newName, idEdit);
                    stdMn.EditInf(idEdit, updatedStudent);
                    break;
                case 3:
                    System.out.println("Enter id delete: ");
                    int id2 = Integer.parseInt(sc.nextLine());
                    stdMn.DeleteInf(id2);
                    break;
                case 4:
                    System.out.println("Who do you search for (Enter id): ");
                    int id3 = Integer.parseInt(sc.nextLine());
                    stdMn.SearchInf(id3);
                    break;
                case 5:


                    break;
                case 6:
                    for (int j = 0; j < listStudent.size(); j++) {
                        System.out.println(listStudent.get(j));
                    }
                    break;
                case 7:
                    System.out.println("Exit!!!");
                    break;
            }
        }  while (choice != 7);
    }
}
