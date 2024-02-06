package model;

import service.impl.GroupServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Group {
    private String groupNo;
    private int studentLimit;
    private List<Student> students;

    GroupServiceImpl groupService = new GroupServiceImpl();
    public Group(Scanner scanner) {
        this.groupNo = groupService.validateNo(scanner);
        this.studentLimit = groupService.validateStudentLimit(studentLimit);
        this.students = new ArrayList<>();
    }


    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public int getStudentLimit() {
        return studentLimit;
    }

    public void setStudentLimit(int studentLimit) {
        this.studentLimit = studentLimit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
