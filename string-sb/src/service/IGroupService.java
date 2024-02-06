package service;

import model.Group;
import model.Student;

import java.util.List;
import java.util.Scanner;

public interface IGroupService {
    void addStudent(Student student);

   List<Student>filterByName(String filter);

    Group createGroup(Scanner scanner);

    void addStudentToGroup(Scanner scan, Group group);
    void findStudentByName(Scanner scanner, Group group);
}
