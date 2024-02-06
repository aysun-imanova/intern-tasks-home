package service;

import model.Student;

import java.util.Scanner;

public interface IGroupService {
    void addStudent(Student student);

    Student[] filterByName(String filter);

    String validateNo(Scanner scanner);

    int validateStudentLimit(int studentLimit);
}
