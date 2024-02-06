package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String no;
    private int studentLimit;
    private List<Student> students;


    public Group(String no, int studentLimit) {
        this.no = no;
        this.students = new ArrayList<>();
        setStudentLimit(studentLimit);


    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getStudentLimit() {
        return studentLimit;
    }

    public void setStudentLimit(int studentLimit) {
        if (studentLimit >= 5 && studentLimit <= 18) {
            this.studentLimit = studentLimit;
        } else {
            System.out.println("Tələblərin sayı min 5, max 18 ola bilər!");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
